package com.coforge.training.agribid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.agribid.model.Crop;

public interface CropRepository extends JpaRepository<Crop,Long> {

}
