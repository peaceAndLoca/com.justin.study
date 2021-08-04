package com.justin.springcloud.dao;

import com.justin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author JustinZhou
 * @date 2021/6/28
 */
@Mapper
public interface PaymentDao {
     int add(Payment payment);
     Payment getPaymentById(@Param("id")Long id);

}
