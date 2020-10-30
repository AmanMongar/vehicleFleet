package com.fleet.billing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet.billing.models.BillingModel;
import com.fleet.billing.repository.BillingRepo;

@Service
public class BillingService {

	@Autowired
	private BillingRepo billingRepo;

	public List<BillingModel> BillingDetails() {
		return billingRepo.findAll();
	}
}
