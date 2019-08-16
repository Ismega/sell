package com.ecjtu.mega.sell.service;

import com.ecjtu.mega.sell.entity.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Optional<ProductCategory> findOne(Integer categoryId);
    List<ProductCategory> findAll();
    ProductCategory save(ProductCategory productCategory);
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
