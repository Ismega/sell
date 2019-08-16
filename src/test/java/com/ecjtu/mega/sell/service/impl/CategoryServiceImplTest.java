package com.ecjtu.mega.sell.service.impl;

import com.ecjtu.mega.sell.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl service;

    @Test
    public void findOne() {
        Optional<ProductCategory> result = service.findOne(1);
        Assert.assertEquals(new Integer(1),result.get().getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> list = service.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("小欢喜",6);
        ProductCategory result = service.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = service.findByCategoryTypeIn(Arrays.asList(1,2,3));
        Assert.assertNotEquals(0,productCategoryList.size());
    }
}