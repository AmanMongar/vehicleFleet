package com.fleet.billing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.billing.models.BillingModel;
import com.fleet.billing.models.ReferenceNumber;
import com.fleet.billing.repository.BillingRepo;
import com.fleet.billing.repository.RefernceSequenceRepo;
import com.fleet.billing.service.BillingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class BillingController {

	@Autowired
	private RefernceSequenceRepo refernceSequenceRepo;
	
	@Autowired
	private BillingService billingService;
	
	@Autowired
	private BillingRepo billingRepo;
	
	@RequestMapping("/")
	public String DefaultMessage() {
		return "Vehicle Billing";
	}
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("billing")
	public List<BillingModel> BillingDetails(){
		 log.warn("Getting the billing ");
		return billingService.BillingDetails(); 
	}
	@GetMapping("billing/{id}")
	public BillingModel getBillById(@PathVariable("id") Integer Id){
		return billingRepo.findById(Id).orElse(null);
	}
	@PostMapping("addBill")
	public ResponseEntity<?> EntryNewData(@RequestBody BillingModel billingModel) {
		try {
			log.debug("Add bill");
			billingRepo.save(billingModel);
			return new ResponseEntity<>(HttpStatus.OK);
			//return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		//log.debug("Add bill");
		//billingRepo.save(billingModel);
		//return new ResponseEntity<>(HttpStatus.OK);		
	}
	@PutMapping("updateBill")
	public ResponseEntity<?> UpdateNewData(@RequestBody BillingModel billingModel) {
		billingRepo.save(billingModel);
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	@GetMapping("refNo")
	public List<ReferenceNumber> referenceNumbers(){
		return refernceSequenceRepo.findAll();
	}
	
	@PutMapping("updateRefNo")
	public ResponseEntity<?> updateRefNo(@RequestBody ReferenceNumber referenceNumber){
		int lastSeq = referenceNumber.getLast_sequence();
		referenceNumber.setLast_sequence(lastSeq+1);
		refernceSequenceRepo.save(referenceNumber);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}

