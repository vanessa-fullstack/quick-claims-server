package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.domain.QuickClaim;
import com.allstate.quickclaimsserver.service.QuickClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/quickclaim")
@CrossOrigin
public class QuickClaimController {

    @Autowired
    private QuickClaimService quickClaimService;

    @GetMapping()
    public List<QuickClaim> getAllClaims(){
//        QuickClaim claim1 = new QuickClaim("Vanessa Carney", "Car",  250.00, "Broken wing mirror", "Another car knocked the wing mirror off", "Closed");
        QuickClaim claim2 = new QuickClaim("Sam Reynolds", "Home",  300.00, "Flood damage", "Damage from floods last week", "Active");
        QuickClaim claim3 = new QuickClaim("Carly Smith", "Pet",  150.00, "Operation on dog", "Required to remove lump", "Rejected");
        List<QuickClaim> claims = new ArrayList<>();
//        claims.add(claim1);
        claims.add(claim2);
        claims.add(claim3);
        return claims;

    }

    @GetMapping("/init")
    public String setUpData(){
        QuickClaim claim1 = new QuickClaim("Vanessa Carney", "Car",  250.00, "Broken wing mirror", "Another car knocked the wing mirror off", "Closed");
        quickClaimService.saveQuickClaim(claim1);
        return "ok";
    }
}
