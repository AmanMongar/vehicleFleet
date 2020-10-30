package com.fleet.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleet.billing.models.BillingModel;

@Repository
public interface BillingRepo extends JpaRepository<BillingModel, Integer> {

}
