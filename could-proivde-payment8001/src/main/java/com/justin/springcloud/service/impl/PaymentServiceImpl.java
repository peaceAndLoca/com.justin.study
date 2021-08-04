package com.justin.springcloud.service.impl;

import com.justin.springcloud.dao.PaymentDao;
import com.justin.springcloud.entities.Payment;
import com.justin.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;

/**
 * @author JustinZhou
 * @date 2021/6/28 4:58 下午
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
