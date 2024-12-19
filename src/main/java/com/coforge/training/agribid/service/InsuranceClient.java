package com.coforge.training.agribid.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.training.agribid.model.Insurance;


@FeignClient(name = "insurance-service")
public interface InsuranceClient {
    @GetMapping("/claims/{id}")
    Insurance getClaimById(@PathVariable Long id);
}
