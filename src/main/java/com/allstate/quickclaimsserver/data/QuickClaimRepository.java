package com.allstate.quickclaimsserver.data;

import com.allstate.quickclaimsserver.domain.QuickClaim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuickClaimRepository extends JpaRepository<QuickClaim, Integer> {

    public List<QuickClaim> findAllByStatus(String status);
    public List<QuickClaim> findAllByInsuranceType(String insuranceType);
    public List<QuickClaim> findAllByCustomerName(String customerName);
    public List<QuickClaim> findAllByPolicyNumber(String policyNumber);

}
