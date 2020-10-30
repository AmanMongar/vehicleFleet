package com.fleet.asset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleet.asset.entity.VehicleTypeEntity;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleTypeEntity, Integer > {

}
