package com.coforge.training.agribid.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.training.agribid.bidder.model.BidderRegistration;

@FeignClient(name = "bidder-service")
public interface BidderClient {
	
    @GetMapping("/bidders/{id}")
    BidderRegistration getBidderById(@PathVariable Long id);
    
    @GetMapping("/allbidders")
    public List<BidderRegistration> getAllBidders();
}

