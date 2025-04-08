package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.ProductDto;

import java.util.List;

public interface ProductService {

    // create

    ProductDto create(ProductDto productDto);


    //update
    ProductDto update(ProductDto productDto, String  productId);


    // delete

    void delete(String productId);

    // get single product
    ProductDto get(String productId);


    // get all product

    //List<ProductDto> getAll(); list hoti but we need pageableresponse thats why changed

    PageableResponse <ProductDto>getAll(int pageNumber, int pageSize, String sortBy,String sortDir);


    //get all :live product
    PageableResponse <ProductDto> getAllLive(int pageNumber, int pageSize, String sortBy,String sortDir);

    // seacrh product

    PageableResponse <ProductDto> searchByTitle(String subTitle,int pageNumber, int pageSize, String sortBy,String sortDir);

   // create product with category

    ProductDto creatWithCategory(ProductDto productDto,String categoryId);

    //update category of product
    ProductDto updateCategory(String productId, String categoryId);

        //
        PageableResponse<ProductDto> getAllOfCategory(String categoryId,int pageNumber,int pageSize, String sortBy, String sortDir);

    // other methods


}
