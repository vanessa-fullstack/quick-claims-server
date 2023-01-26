package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.QuickClaimRepository;
import com.allstate.quickclaimsserver.domain.QuickClaim;
import com.allstate.quickclaimsserver.exceptions.QuickClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class QuickClaimServiceImpl implements  QuickClaimService{

    @Autowired
    private QuickClaimRepository quickClaimRepository;

    @Override
    public QuickClaim saveQuickClaim(QuickClaim quickclaim) {
        return quickClaimRepository.save(quickclaim);

    }

    @Override
    public List<QuickClaim> getAllQuickClaims() {
        return quickClaimRepository.findAll();
    }

    @Override
    public QuickClaim getById(Integer id) throws QuickClaimNotFoundException {
        Optional<QuickClaim> optionalQuickClaim = quickClaimRepository.findById(id);
        if(optionalQuickClaim.isPresent()){
            return optionalQuickClaim.get();
        }
        else{
            throw new QuickClaimNotFoundException("There is no quick claim with id " + id);
        }
    }

    @Override
    public List<QuickClaim> getByStatus(String status) {
        return quickClaimRepository.findAllByStatus(status);
    }

    @Override
    public List<QuickClaim> getByInsuranceType(String insuranceType) {
        return quickClaimRepository.findAllByInsuranceType(insuranceType);
    }

    @Override
    public List<QuickClaim> getByCustomerName(String customerName) {
        return quickClaimRepository.findAllByCustomerName(customerName);
    }

    @Override
    public List<QuickClaim> getByPolicyNumber(String policyNumber) {
        return quickClaimRepository.findAllByPolicyNumber(policyNumber);
    }

    @Override
    public List<String> getAllStatuses() {

        return quickClaimRepository.findAll().stream()
                .map( quickClaim -> quickClaim.getStatus() )
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public QuickClaim updateQuickClaim(Integer id, Map<String, Object> fields) {

        QuickClaim quickClaim = quickClaimRepository.findById(id).get();

        if (fields.containsKey("status")){
            quickClaim.setStatus(fields.get("status").toString());
        }
        if (fields.containsKey("amount")){
            quickClaim.setAmount(Double.parseDouble(fields.get("amount").toString()));
        }
        return quickClaimRepository.save(quickClaim);

    }
}
