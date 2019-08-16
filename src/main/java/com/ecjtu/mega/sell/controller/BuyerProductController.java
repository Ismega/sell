package com.ecjtu.mega.sell.controller;

import com.ecjtu.mega.sell.VO.ResultVo;
import com.ecjtu.mega.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//返回json 格式，用RestController
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductInfoService service;

    @GetMapping("/list")
    public ResultVo list() {
        ResultVo resultVo = new ResultVo();
        return resultVo;
    }
}
