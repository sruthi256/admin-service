package com.coforge.training.agribid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.agribid.bidder.model.BidderRegistration;
import com.coforge.training.agribid.farmer.model.Crop;
import com.coforge.training.agribid.farmer.model.DemoCrop;
import com.coforge.training.agribid.farmer.model.Farmer;
import com.coforge.training.agribid.service.AdminService;
import com.coforge.training.agribid.service.BidderClient;
import com.coforge.training.agribid.service.FarmerClient;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    
    @Autowired
    private FarmerClient fclient;
    
    @Autowired
    private BidderClient bclient;
    
    @GetMapping("/allfarmers")
    public List<Farmer> getAllFarmers() {
        return fclient.getAllFarmers();
    }
    
    @GetMapping("/allBidders")
    public List<BidderRegistration> getAllBidders() {
        return bclient.getAllBidders();
    }
    
    @GetMapping("/allcrops")
    public List<Crop> getAllCrops(){
    	return fclient.getAllCrops();
    }
    
    @GetMapping("/crops")
	public List<DemoCrop> getSelectedStates(){
    	return fclient.getSelectedStates();
    }
    
//
//    @PostMapping("/users/validate")
//    public ResponseEntity<User> validateAndGrantAccess(@RequestBody User user) {
//        return ResponseEntity.ok(adminService.validateAndGrantAccess(user));
//    }
//
//    @PostMapping("/crops/approve/{id}")
//    public ResponseEntity<Crop> approveCrop(@PathVariable Long id) {
//        return ResponseEntity.ok(adminService.approveCrop(id));
//    }
//
//    @PostMapping("/bids/approve/{id}")
//    public ResponseEntity<Bid> approveBid(@PathVariable Long id) {
//        return ResponseEntity.ok(adminService.approveBid(id));
//    }
//
//    @PostMapping("/insurance/approve/{id}")
//    public ResponseEntity<Insurance> approveInsuranceClaim(@PathVariable Long id) {
//        return ResponseEntity.ok(adminService.approveInsuranceClaim(id));
//    }
}

