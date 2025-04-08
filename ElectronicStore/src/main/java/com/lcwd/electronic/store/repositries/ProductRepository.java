package com.lcwd.electronic.store.repositries;

import com.lcwd.electronic.store.entities.Category;
import com.lcwd.electronic.store.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product ,String > {
        // JpaRepository<EntityName ,IdType > productid ,categoriesid ,userid he sagle string thats wjy we are taking string
    // class implements another class
    // interface  extends another interface


    //Search

    Page<Product> findByTitleContaining(String subTitle,Pageable pageable);

    Page<Product> findByLiveTrue(Pageable pageable);    // this method provide live product info
    Page<Product> findByCategory(Category category,Pageable pageable);
    // so many methods are available . search custom finder method data jpa
    // query method

}
