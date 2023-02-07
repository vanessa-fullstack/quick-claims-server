package com.allstate.quickclaimsserver;

import com.allstate.quickclaimsserver.data.QuickClaimRepository;
import com.allstate.quickclaimsserver.domain.QuickClaim;
import com.allstate.quickclaimsserver.service.BootstrapService;
import com.allstate.quickclaimsserver.service.QuickClaimService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class QuickClaimsServiceTesting {

    @Autowired
    private QuickClaimService quickClaimService;

    @MockBean
    private QuickClaimRepository quickClaimRepository;

    @Test
    public void testGetAllStatues() {
        List<QuickClaim> quickClaims = new ArrayList<>();
        quickClaims.add(new QuickClaim(1,"Tom Brown", "Home", 150.00, "boiler repairs", "No hot running water", "Awaiting payment", LocalDate.of(2023, Month.JANUARY, 1), "127423658","23 Main Street", null, null, null, null, null));
        quickClaims.add(new QuickClaim(2,"Haley Wiggens", "Pet", 150.00, "Operation on dog", "Required to remove lump", "Active",  LocalDate.of(2023, Month.JANUARY, 1), "124758960",null, null, null, null, "Dog", "Labrador"));
        quickClaims.add(new QuickClaim(3,"Stacey Brown", "Home", 150.00, "boiler repairs", "No hot running water", "Closed",  LocalDate.of(2023, Month.JANUARY, 1), "127423658","23 Main Street", null, null, null, null, null));
        quickClaims.add(new QuickClaim(4,"John Smith", "Car", 150.00, "Broke down", "Tow truck needed", "Rejected",  LocalDate.of(2023, Month.JANUARY, 1), "123415876",null, "Renault", "Clio", "2015", null, null));
        quickClaims.add(new QuickClaim(5,"Jane Smith", "Car", 150.00, "Broke down", "Tow truck needed", "Passed on",  LocalDate.of(2023, Month.JANUARY, 1), "123415876",null, "Renault", "Clio", "2015", null, null));
        Mockito.when(quickClaimRepository.findAll()).thenReturn(quickClaims);

        List<String> statues = quickClaimService.getAllStatuses();
        assertEquals(5, statues.size());
//        fail();
    }

}
