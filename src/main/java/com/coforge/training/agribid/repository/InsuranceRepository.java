package com.coforge.training.agribid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.agribid.model.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {

}
