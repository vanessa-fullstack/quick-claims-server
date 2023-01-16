package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.QuickClaimRepository;
import com.allstate.quickclaimsserver.domain.QuickClaim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuickClaimServiceImpl implements  QuickClaimService{

    @Autowired
    private QuickClaimRepository quickClaimRepository;

    @Override
    public void saveQuickClaim(QuickClaim quickclaim) {
        quickClaimRepository.save(quickclaim);

    }

//    @Override
//    public List<QuickClaim> getAllQuickClaims() {
//        return null;
//    }
}
