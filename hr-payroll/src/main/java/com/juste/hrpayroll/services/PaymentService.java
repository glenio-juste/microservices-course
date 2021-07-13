package com.juste.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.juste.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob2", 200.0, days);
	}

}
