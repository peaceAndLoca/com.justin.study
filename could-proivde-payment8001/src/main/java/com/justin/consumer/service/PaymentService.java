package com.justin.consumer.service;

import com.justin.commonapi.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author JustinZhou
 * @date 2021/6/28 4:57 下午
 */
public interface PaymentService {
    /** insert function
     * @param payment
     * @return
     */
     int add(Payment payment);

    /**
     *query function
     * @param id
     * @return
     */
     Payment getPaymentById(@Param("id")Long id);


}
