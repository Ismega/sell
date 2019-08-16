package com.ecjtu.mega.sell.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class OrderMaster {

    @Id
    private String detailId;
    private String orderId;
    private String productId;
    private String productName;
//    private  productPrice;
    private Integer productQuantity;
    private String productIcon;

}
