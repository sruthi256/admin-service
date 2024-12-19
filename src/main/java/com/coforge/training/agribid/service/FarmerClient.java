package com.coforge.training.agribid.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.training.agribid.bidder.model.BidderRegistration;
import com.coforge.training.agribid.farmer.model.Crop;
import com.coforge.training.agribid.farmer.model.DemoCrop;
import com.coforge.training.agribid.farmer.model.Farmer;

@FeignClient(name = "farmer-service")
public interface FarmerClient {
	
    @GetMapping("/farmers/{id}")
    Farmer getFarmerById(@PathVariable Long id);
    
    @GetMapping("/allfarmers")
    public List<Farmer> getAllFarmers();
    
    @GetMapping("/allcrops")
    public List<Crop> getAllCrops();
    
    @GetMapping("/crops")
	public List<DemoCrop> getSelectedStates();
}



