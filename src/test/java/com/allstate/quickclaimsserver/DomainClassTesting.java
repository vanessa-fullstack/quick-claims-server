package com.allstate.quickclaimsserver;

import com.allstate.quickclaimsserver.domain.QuickClaim;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomainClassTesting {

    @Test
    public void test2QuickClaimsWithTheSameIdAreEqual() {
        QuickClaim quickClaim1 = new QuickClaim();
        QuickClaim quickClaim2 = new QuickClaim();
        quickClaim1.setId(123);
        quickClaim2.setId(123);
        assertEquals(quickClaim1, quickClaim2);
    }

}
