package com.ecjtu.mega.sell.service;

import com.ecjtu.mega.sell.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductInfoService {

    Optional<ProductInfo> findOne(String productId);
    //查询在架所有商品
    List<ProductInfo> findUpAll();
    // 管理员查询所有，分页
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
    //加库存
    //减库存

}
