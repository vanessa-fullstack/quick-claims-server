package com.allstate.quickclaimsserver.data;

import com.allstate.quickclaimsserver.domain.QuickClaim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuickClaimRepository extends JpaRepository<QuickClaim, Integer> {
}
