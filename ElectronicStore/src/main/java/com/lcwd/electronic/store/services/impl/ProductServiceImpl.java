package com.lcwd.electronic.store.services.impl;

import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.ProductDto;
import com.lcwd.electronic.store.entities.Category;
import com.lcwd.electronic.store.entities.Product;
import com.lcwd.electronic.store.exceptions.ResourceNotFoundException;
import com.lcwd.electronic.store.helper.Helper;
import com.lcwd.electronic.store.repositries.CategoryRepository;
import com.lcwd.electronic.store.repositries.ProductRepository;
import com.lcwd.electronic.store.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ProductDto create(ProductDto productDto) {

       Product product= mapper.map(productDto, Product.class);
       // product id
        String productId=UUID.randomUUID().toString();
        product.setProductId(productId);

        // added
        product.setAddedDate(new Date());
        Product saveProduct=productRepository.save(product);
        return mapper.map(saveProduct, ProductDto.class);
    }

    @Override
    public ProductDto update(ProductDto productDto, String productId) {
     // fecth the product of given id

        Product product =productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("product not found with given id !!"));
        // product madhi old data aahe and productDTO new data aahe yat

        product.setTitle(productDto.getTitle());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());
        product.setDiscountedPrice(productDto.getDiscountedPrice());
        product.setLive(productDto.isLive());
        product.setStock(productDto.isStock());

        product.setProductImageName(productDto.getProductImageName());
// save the entity
        Product updateProduct= productRepository.save(product);
        return mapper.map(updateProduct ,ProductDto.class);

    }

    @Override
    public void delete(String productId) {

        Product product =productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("product not found with given id !!"));
        productRepository.delete(product);
    }

    @Override
    public ProductDto get(String productId) {
        Product product =productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("product not found with given id !!"));
        return mapper.map(product, ProductDto.class);
    }

    @Override
    public PageableResponse<ProductDto> getAll(int pageNumber, int pageSize, String sortBy,String sortDir) {

        Sort sort=(sortDir.equalsIgnoreCase("desc"))?(Sort.by(sortBy).descending()) :(Sort.by(sortBy).ascending());
        Pageable pageable= PageRequest.of(pageNumber ,pageSize,sort);
        Page<Product> page=productRepository.findAll(pageable);
        return Helper.getpageableResponse(page,ProductDto.class);

    }

    @Override
    public   PageableResponse <ProductDto> getAllLive(int pageNumber, int pageSize, String sortBy,String sortDir) {
        Sort sort=(sortDir.equalsIgnoreCase("desc"))?(Sort.by(sortBy).descending()) :(Sort.by(sortBy).ascending());
        Pageable pageable= PageRequest.of(pageNumber ,pageSize,sort);
        Page<Product> page=productRepository.findByLiveTrue(pageable);
        return Helper.getpageableResponse(page,ProductDto.class);

    }

    @Override
    public   PageableResponse <ProductDto> searchByTitle(String subTitle,int pageNumber, int pageSize, String sortBy,String sortDir) {
        Sort sort=(sortDir.equalsIgnoreCase("desc"))?(Sort.by(sortBy).descending()) :(Sort.by(sortBy).ascending());
        Pageable pageable= PageRequest.of(pageNumber ,pageSize,sort);
        Page<Product> page=productRepository.findByTitleContaining(subTitle,pageable);
        return Helper.getpageableResponse(page,ProductDto.class);

    }

    @Override
    public ProductDto creatWithCategory(ProductDto productDto, String categoryId) {

       // fecth the category from DB
      Category category=  categoryRepository.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category not found !!"));

        Product product= mapper.map(productDto, Product.class);
        // product id
        String productId=UUID.randomUUID().toString();
        product.setProductId(productId);

        // added
        product.setAddedDate(new Date());
        product.setCategory(category);
        Product saveProduct=productRepository.save(product);
        return mapper.map(saveProduct, ProductDto.class);

    }

    @Override
    public ProductDto updateCategory(String productId, String categoryId) {

    // product fecth
       Product product= productRepository.findById(productId).orElseThrow(()-> new ResourceNotFoundException("product of given id  not found !!"));
        Category category=  categoryRepository.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category of given id not found !!"));
        product.setCategory(category);
        Product saveProduct=productRepository.save(product);
        return mapper.map(saveProduct, ProductDto.class);
    }

    @Override
    public PageableResponse<ProductDto> getAllOfCategory(String categoryId,int pageNumber,int pageSize, String sortBy, String sortDir) {
        Category category=  categoryRepository.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category of given id not found !!"));

        Sort sort=(sortDir.equalsIgnoreCase("desc"))?(Sort.by(sortBy).descending()) :(Sort.by(sortBy).ascending());

        Pageable pageable=PageRequest.of(pageNumber,pageSize,sort);
        Page<Product> page=productRepository.findByCategory(category,pageable);
        return Helper.getpageableResponse(page,ProductDto.class);

    }
}
