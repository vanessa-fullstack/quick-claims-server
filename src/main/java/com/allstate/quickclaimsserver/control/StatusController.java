package com.allstate.quickclaimsserver.control;

import com.allstate.quickclaimsserver.service.QuickClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/status")
public class StatusController {

    @Autowired
    private QuickClaimService quickClaimService;

    @GetMapping()
    public List<String> getAllStatuses(){
        return quickClaimService.getAllStatuses();

    }
}
