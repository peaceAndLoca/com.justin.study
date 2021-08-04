package com.justin.springcloud.controller;

import com.justin.springcloud.entities.CommonResult;
import com.justin.springcloud.entities.Payment;
import com.justin.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JustinZhou
 * @date 2021/6/28 5:10 下午
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentServiceImpl;

    @PostMapping(value = "/payment/add")
    public CommonResult add(Payment payment){
        System.out.println(payment);
        int addSuccessNumber = paymentServiceImpl.add(payment);
        if (addSuccessNumber >0){
            return  new CommonResult(200,"插入成功"+addSuccessNumber+"条",addSuccessNumber);
        }else {
            return  new CommonResult(400,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        System.out.println(id);
        Payment payment = paymentServiceImpl.getPaymentById(id);
        System.out.println(payment.getId());
        if (payment != null) {
            return  new CommonResult(200,"获取成功",payment);
        }else{
            return  new CommonResult(400,"获取失败");
        }
    }

}
