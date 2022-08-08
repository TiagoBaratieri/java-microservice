package com.baratieri.hrpayroll.services;

import com.baratieri.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long WorkerId, Integer days) {
        return new Payment("Bob", 200.0, days);
    }
}
