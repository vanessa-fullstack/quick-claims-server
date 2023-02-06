package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.domain.QuickClaim;
import com.allstate.quickclaimsserver.exceptions.QuickClaimNotFoundException;
import com.allstate.quickclaimsserver.service.QuickClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/quickclaim")
@CrossOrigin
public class QuickClaimController {

    @Autowired
    private QuickClaimService quickClaimService;

    @GetMapping()
    public List<QuickClaim> getAllClaims(
            @RequestParam(value="status", required = false) String status,
            @RequestParam(value ="insuranceType", required = false) String insuranceType,
            @RequestParam(value ="customerName", required = false) String customerName,
            @RequestParam(value ="policyNumber", required = false) String policyNumber){
//        QuickClaim claim1 = new QuickClaim("Vanessa Carney", "Car",  250.00, "Broken wing mirror", "Another car knocked the wing mirror off", "Closed");
//        QuickClaim claim2 = new QuickClaim("Sam Reynolds", "Home",  300.00, "Flood damage", "Damage from floods last week", "Active", LocalDate.of(2023, Month.JANUARY, 21),"129145278");
//        QuickClaim claim3 = new QuickClaim("Carly Smith", "Pet",  150.00, "Operation on dog", "Required to remove lump", "Rejected", LocalDate.of(2022, Month.NOVEMBER, 1), "127425189");
//        List<QuickClaim> claims = new ArrayList<>();
//        claims.add(claim1);
//        claims.add(claim2);
//        claims.add(claim3);
//        return claims;
//        if(status == null){
//            return quickClaimService.getAllQuickClaims();
//        }
//        else {
//            return quickClaimService.getByStatus(status);
//        }

        if(insuranceType != null){
            return quickClaimService.getByInsuranceType(insuranceType);
        }
        else if(status != null ){
            return quickClaimService.getByStatus(status);
        }
        else if(customerName != null ){
            return quickClaimService.getByCustomerName(customerName);
        }
        else if(policyNumber != null ){
            return quickClaimService.getByPolicyNumber(policyNumber);
        }
        else {
            return quickClaimService.getAllQuickClaims();
        }
    }

    @GetMapping("/{id}")
    public QuickClaim findById(@PathVariable Integer id) throws QuickClaimNotFoundException {
        return quickClaimService.getById(id);
    }

    @PostMapping
    public QuickClaim saveNewQuickClaim(@RequestBody QuickClaim quickClaim){
        System.out.println(quickClaim);
        return quickClaimService.saveQuickClaim(quickClaim);
    }

//    @GetMapping("/init")
//    public String setUpData(){
//        QuickClaim claim1 = new QuickClaim(1, "Vanessa Carney", "Car",  250.00, "Broken wing mirror", "Another car knocked the wing mirror off", "Closed", LocalDate.of(2022, Month.DECEMBER, 5), "127574123", null, "Ford", "Fiesta", "2018", null, null);
//        quickClaimService.saveQuickClaim(claim1);
//        return "ok";
//    }

    @PutMapping("/{id}")
    public QuickClaim updateQuickClaim(@PathVariable Integer id, @RequestBody HashMap<String, Object> fields){
        System.out.println("updating claim with "+ id + fields);
        return quickClaimService.updateQuickClaim(id, fields);
    }



}
