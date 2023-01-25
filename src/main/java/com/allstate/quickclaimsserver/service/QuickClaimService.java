package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.domain.QuickClaim;
import com.allstate.quickclaimsserver.exceptions.QuickClaimNotFoundException;

import java.util.List;

public interface QuickClaimService {

    public void saveQuickClaim(QuickClaim quickclaim);

    public List<QuickClaim> getAllQuickClaims();
    public QuickClaim getById(Integer id) throws QuickClaimNotFoundException;

    public List<QuickClaim> getByStatus(String status);
    public List<QuickClaim> getByInsuranceType(String insuranceType);
    public List<QuickClaim> getByCustomerName(String customerName);
    public List<QuickClaim> getByPolicyNumber(String policyNumber);







}
