package com.fleet.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet.billing.models.ReferenceNumber;

public interface RefernceSequenceRepo extends JpaRepository<ReferenceNumber, Integer>{

}
