package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.QuickClaimRepository;
import com.allstate.quickclaimsserver.domain.QuickClaim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BootstrapService {

    @Autowired
    private QuickClaimRepository quickClaimRepository;

    @PostConstruct
    public void setUpInitialData(){
        int numberOfClaims = quickClaimRepository.findAll().size();
        if (numberOfClaims == 0) {
            QuickClaim newQuickClaim1 = new QuickClaim("Carly Smith", "Pet", 150.00, "Operation on dog", "Required to remove lump");
            QuickClaim newQuickClaim2 = new QuickClaim("Sam Reynolds", "Home", 300.00, "Flood damage", "Damage from floods last week");
            QuickClaim newQuickClaim3 = new QuickClaim("Maria Anders", "Pet", 150.00, "needed an operation", "Broken bone");
            QuickClaim newQuickClaim4 = new QuickClaim("Jane Brown", "Car", 250.00, "crack in windowscreen", "a stone hit the windowscreen and caused a crack");
            QuickClaim newQuickClaim5 = new QuickClaim("Alan Grey", "Home", 375.00, "boiler repairs", "no hot running water");
            QuickClaim newQuickClaim6 = new QuickClaim("Maddie Wray", "Pet", 75.00, "cut on paw", "vet visit for cut on paw");
            QuickClaim newQuickClaim7 = new QuickClaim("Tommy Murray", "Car", 255.00, "other car drove into back of car", "sitting in traffic and car behind went into back of car");
            QuickClaim newQuickClaim8 = new QuickClaim("James McHugh", "Car", 250.00, "skid on ice", "black ice due to snow during night");
            QuickClaim newQuickClaim9 = new QuickClaim("Mike Peters", "Home", 175.00, "broken window", "stone thrown through window");
            QuickClaim newQuickClaim10 = new QuickClaim("Cain Hobbs", "Pet", 125.00, "operation", "dog needed neutered");

            QuickClaim savedQuickClaim1 = quickClaimRepository.save(newQuickClaim1);
            QuickClaim savedQuickClaim2 = quickClaimRepository.save(newQuickClaim2);
            QuickClaim savedQuickClaim3 = quickClaimRepository.save(newQuickClaim3);
            QuickClaim savedQuickClaim4 = quickClaimRepository.save(newQuickClaim4);
            QuickClaim savedQuickClaim5 = quickClaimRepository.save(newQuickClaim5);
            QuickClaim savedQuickClaim6 = quickClaimRepository.save(newQuickClaim6);
            QuickClaim savedQuickClaim7 = quickClaimRepository.save(newQuickClaim7);
            QuickClaim savedQuickClaim8 = quickClaimRepository.save(newQuickClaim8);
            QuickClaim savedQuickClaim9 = quickClaimRepository.save(newQuickClaim9);
            QuickClaim savedQuickClaim10 = quickClaimRepository.save(newQuickClaim10);

            System.out.println("Claim saved with id " + savedQuickClaim1.getId());
            System.out.println("Claim saved with id " + savedQuickClaim2.getId());
            System.out.println("Claim saved with id " + savedQuickClaim3.getId());
            System.out.println("Claim saved with id " + savedQuickClaim4.getId());
            System.out.println("Claim saved with id " + savedQuickClaim5.getId());
            System.out.println("Claim saved with id " + savedQuickClaim6.getId());
            System.out.println("Claim saved with id " + savedQuickClaim7.getId());
            System.out.println("Claim saved with id " + savedQuickClaim8.getId());
            System.out.println("Claim saved with id " + savedQuickClaim9.getId());
            System.out.println("Claim saved with id " + savedQuickClaim10.getId());
        }

    }
}

