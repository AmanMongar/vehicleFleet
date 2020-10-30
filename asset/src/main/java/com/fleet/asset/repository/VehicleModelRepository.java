package com.fleet.asset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleet.asset.entity.VehicleModelEntity;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModelEntity, Integer> {

}
