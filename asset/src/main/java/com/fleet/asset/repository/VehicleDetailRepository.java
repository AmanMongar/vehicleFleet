package com.fleet.asset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleet.asset.entity.VehicleDetailEntity;

@Repository
public interface VehicleDetailRepository extends JpaRepository<VehicleDetailEntity, Integer>{

}
