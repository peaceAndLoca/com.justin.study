package com.justin.consumer.controller;

import com.justin.commonapi.entities.CommonResult;
import com.justin.commonapi.entities.Payment;
import com.justin.consumer.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author JustinZhou
 * @date 2021/6/28 5:10 下午
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentServiceImpl;

    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody Payment payment){
        int addSuccessNumber = paymentServiceImpl.add(payment);
        if (addSuccessNumber >0){
            return  new CommonResult(200,"插入成功"+addSuccessNumber+"条",addSuccessNumber);
        }else {
            return  new CommonResult(400,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentServiceImpl.getPaymentById(id);
        if (payment != null) {
            return  new CommonResult(200,"获取成功",payment);
        }else{
            return  new CommonResult(400,"获取失败");
        }
    }

}
