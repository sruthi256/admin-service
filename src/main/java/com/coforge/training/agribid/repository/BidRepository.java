package com.coforge.training.agribid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.agribid.model.Bid;

public interface BidRepository extends JpaRepository<Bid, Long> {

}
