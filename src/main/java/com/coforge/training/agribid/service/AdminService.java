package com.coforge.training.agribid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.coforge.training.agribid.model.Admin;
import com.coforge.training.agribid.model.Bid;
import com.coforge.training.agribid.model.Crop;
import com.coforge.training.agribid.model.Insurance;
import com.coforge.training.agribid.repository.AdminRepository;
import com.coforge.training.agribid.repository.BidRepository;
import com.coforge.training.agribid.repository.CropRepository;
import com.coforge.training.agribid.repository.InsuranceRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private CropRepository cropRepository;

    @Autowired
    private BidRepository bidRepository;

    @Autowired
    private InsuranceRepository insuranceRepository;

    @Autowired
    private FarmerClient farmerClient;

    @Autowired
    private BidderClient bidderClient;

    public Admin validateAndGrantAccess(Admin user) {
        // Validate documents and grant access
        return adminRepository.save(user);
    }

    public Crop approveCrop(Long cropId) {
        Crop crop = cropRepository.findById(cropId).orElseThrow();
        crop.setApproved(true);
        return cropRepository.save(crop);
    }

    public Bid approveBid(Long bidId) {
        Bid bid = bidRepository.findById(bidId).orElseThrow();
        bid.setApproved(true);
        return bidRepository.save(bid);
    }

    public Insurance approveInsurance(Long claimId) {
        Insurance claim = insuranceRepository.findById(claimId).orElseThrow();
        claim.setApproved(true);
        return insuranceRepository.save(claim);
    }

    public List<Crop> getAllCrops() {
        return cropRepository.findAll();
    }

    public List<Bid> getAllBids() {
        return bidRepository.findAll();
    }

    public List<User> getAllFarmers() {
        return adminRepository.findByRole("FARMER");
    }

    public List<User> getAllBidders() {
        return adminRepository.findByRole("BIDDER");
    }
}


