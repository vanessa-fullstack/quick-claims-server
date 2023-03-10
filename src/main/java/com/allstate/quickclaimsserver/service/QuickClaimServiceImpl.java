package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.QuickClaimRepository;
import com.allstate.quickclaimsserver.domain.QuickClaim;
import com.allstate.quickclaimsserver.exceptions.QuickClaimBadRequestException;
import com.allstate.quickclaimsserver.exceptions.QuickClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
    public QuickClaim updateQuickClaim(Integer id, Map<String, Object> fields) throws QuickClaimBadRequestException {

        QuickClaim quickClaim = quickClaimRepository.findById(id).get();

        if (fields.containsKey("customerName")){
            quickClaim.setCustomerName(fields.get("customerName").toString());
        }
        if (fields.containsKey("status")){
            if (!quickClaim.getStatus().contains("Rejected") && !quickClaim.getStatus().contains("Closed")){
                System.out.println("You have updated the value if not already rejected or closed");
                quickClaim.setStatus(fields.get("status").toString());
            }
            else {
                throw new QuickClaimBadRequestException("Cannot update Quick Claim Status " + id);
            }
        }
        if (fields.containsKey("insuranceType")){
            quickClaim.setInsuranceType(fields.get("insuranceType").toString());
        }
        if (fields.containsKey("amount")){
            quickClaim.setAmount(Double.parseDouble(fields.get("amount").toString()));
        }
        if (fields.containsKey("reason")){
            quickClaim.setReason(fields.get("reason").toString());
        }
        if (fields.containsKey("description")){
            quickClaim.setDescription(fields.get("description").toString());
        }
        if (fields.containsKey("address")){
            quickClaim.setAddress(fields.get("address").toString());
        }
        if (fields.containsKey("makeOfVehicle")){
            quickClaim.setMakeOfVehicle(fields.get("makeOfVehicle").toString());
        }
        if (fields.containsKey("modelOfVehicle")){
            quickClaim.setModelOfVehicle(fields.get("modelOfVehicle").toString());
        }
        if (fields.containsKey("yearOfManufacture")){
            quickClaim.setYearOfManufacture(fields.get("yearOfManufacture").toString());
        }
        if (fields.containsKey("animal")){
            quickClaim.setAnimal(fields.get("animal").toString());
        }
        if (fields.containsKey("breed")){
            quickClaim.setBreed(fields.get("breed").toString());
        }

        return quickClaimRepository.save(quickClaim);

    }
}
