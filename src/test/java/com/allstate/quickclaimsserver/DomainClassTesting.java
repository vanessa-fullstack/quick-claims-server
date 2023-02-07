package com.allstate.quickclaimsserver;

import com.allstate.quickclaimsserver.domain.QuickClaim;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DomainClassTesting {

    @Test
    public void test2QuickClaimsWithTheSameIdAreEqual() {
        QuickClaim quickClaim1 = new QuickClaim();
        QuickClaim quickClaim2 = new QuickClaim();
        quickClaim1.setId(123);
        quickClaim2.setId(123);
        assertEquals(quickClaim1, quickClaim2);
    }

    @Test
    public void test2QuickClaimsWithTheSameCustomerName() {
        QuickClaim quickClaim1 = new QuickClaim();
        QuickClaim quickClaim2 = new QuickClaim();
        quickClaim1.setCustomerName("Carly Smith");
        quickClaim2.setCustomerName("Carly Smith");
        assertEquals(quickClaim1, quickClaim2);
    }

    @Test
    public void test2QuickClaimsWithTheSameInsuranceType() {
        QuickClaim quickClaim1 = new QuickClaim();
        QuickClaim quickClaim2 = new QuickClaim();
        quickClaim1.setInsuranceType("Pet");
        quickClaim2.setInsuranceType("Pet");
        assertEquals(quickClaim1, quickClaim2);
    }

    @Test
    public void test2QuickClaimsWithDifferentInsuranceType() {
        QuickClaim quickClaim1 = new QuickClaim();
        QuickClaim quickClaim2 = new QuickClaim();
        quickClaim1.setInsuranceType("Pet");
        quickClaim2.setInsuranceType("Car");
        assertNotEquals(quickClaim1, quickClaim2);
    }

}
