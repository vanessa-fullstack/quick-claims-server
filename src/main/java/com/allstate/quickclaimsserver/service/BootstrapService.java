package com.allstate.quickclaimsserver.service;

import com.allstate.quickclaimsserver.data.QuickClaimRepository;
import com.allstate.quickclaimsserver.data.UserRepository;
import com.allstate.quickclaimsserver.domain.QuickClaim;
import com.allstate.quickclaimsserver.domain.User;
import com.allstate.quickclaimsserver.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;


@Service
public class BootstrapService {

    @Autowired
    private QuickClaimRepository quickClaimRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostConstruct
    public void setUpInitialData(){
        int numberOfClaims = quickClaimRepository.findAll().size();
        if (numberOfClaims == 0) {
            QuickClaim newQuickClaim1 = new QuickClaim(1, "Carly Smith", "Pet", 150.00, "Operation on dog", "Required to remove lump", "Waiting", LocalDate.of(2023, Month.JANUARY, 1), "124758960", null, null, null, null, "Dog", "Labrador");
            QuickClaim newQuickClaim2 = new QuickClaim(2, "Sam Reynolds", "Home", 300.00, "Flood damage", "Damage from floods last week", "Active", LocalDate.of(2022, Month.DECEMBER, 28), "121378412", "34 Elm Road", null, null, null, null, null);
            QuickClaim newQuickClaim3 = new QuickClaim(3, "Maria Anders", "Pet", 150.00, "needed an operation", "Broken bone", "Closed", LocalDate.of(2022, Month.SEPTEMBER, 8), "128553017", null, null, null, null, "Cat", "British Shorthaired");
            QuickClaim newQuickClaim4 = new QuickClaim(4, "Jane Brown", "Car", 250.00, "crack in window screen", "a stone hit the window screen and caused a crack", "Rejected", LocalDate.of(2023, Month.JANUARY, 14), "127541368", null, "Ford", "Focus", "2020", null, null);
            QuickClaim newQuickClaim5 = new QuickClaim(5, "Alan Grey", "Home", 375.00, "boiler repairs", "no hot running water", "Closed", LocalDate.of(2022, Month.NOVEMBER, 13), "123078426", "87 Oak Street", null, null, null, null, null);
            QuickClaim newQuickClaim6 = new QuickClaim(6, "Maddie Wray", "Pet", 75.00, "cut on paw", "vet visit for cut on paw", "Awaiting Payment", LocalDate.of(2023, Month.JANUARY, 20), "123745601", null, null, null, null, "Dog", "Cocker Spaniel");
            QuickClaim newQuickClaim7 = new QuickClaim(7, "Tommy Murray", "Car", 255.00, "other car drove into back of car", "sitting in traffic and car behind went into back of car", "Rejected", LocalDate.of(2022, Month.OCTOBER, 11), "120886123", null, "Vauxhall", "Astra", "2021", null, null);
            QuickClaim newQuickClaim8 = new QuickClaim(8, "James McHugh", "Car", 250.00, "skid on ice", "black ice due to snow during night", "Active", LocalDate.of(2022, Month.DECEMBER, 30), "122374451", null, "BMW", "1 Series", "2019", null, null);
            QuickClaim newQuickClaim9 = new QuickClaim(9, "Mike Peters", "Home", 175.00, "broken window", "stone thrown through window", "Active", LocalDate.of(2023, Month.JANUARY, 23), "125466328", "123 Sycamore Drive", null, null, null, null, null);
            QuickClaim newQuickClaim10 = new QuickClaim(10, "Cain Hobbs", "Pet", 500.00, "operation", "dog needed neutered", "Passed on", LocalDate.of(2022, Month.AUGUST, 5), "125622489", null, null, null, null, "Dog", "German Shepard");
            QuickClaim newQuickClaim11 = new QuickClaim(11,"Margaret Armstrong", "Car", 200.00, "service", "car check up", "Active", LocalDate.of(2022, Month.SEPTEMBER, 6), "126641208", null, "Ford", "Kuga", "2018", null, null);
            QuickClaim newQuickClaim12 = new QuickClaim(12, "Harry Robson", "Car", 150.00, "break down", "pick up truck needed", "Rejected", LocalDate.of(2022, Month.APRIL, 24), "127425596", null, "Renault", "Clio", "2012", null, null);
            QuickClaim newQuickClaim13 = new QuickClaim(13,"Mike Hanna", "Home", 155.00, "break in", "broken lock on door", "Awaiting Payment", LocalDate.of(2022, Month.OCTOBER, 30), "122351008", "81 Pine Avenue", null, null, null, null, null);
            QuickClaim newQuickClaim14 = new QuickClaim(14,"Hannah Nelson", "Home", 225.00, "burst pipes", "leak from pipes due to frost", "Rejected", LocalDate.of(2022, Month.JANUARY, 6), "128761044", "12 Maple Drive", null, null, null, null, null);
            QuickClaim newQuickClaim15 = new QuickClaim(15,"Hannah Grey", "Pet", 95.00, "operation", "dog needed neutered", "Waiting", LocalDate.of(2023, Month.JANUARY, 30), "125354110", null, null, null, null, "Dog", "Labrador");
            QuickClaim newQuickClaim16 = new QuickClaim(16,"Carol Fell", "Pet", 150.00, "medicine", "treatment for sickness", "Rejected", LocalDate.of(2022, Month.OCTOBER, 24), "127412649", null, null, null, null, "Cat", "Siamese");
            QuickClaim newQuickClaim17 = new QuickClaim(17, "James Matthews", "Car", 350.00, "car crash", "car behind drove into back", "Active", LocalDate.of(2022, Month.NOVEMBER, 15), "123365004", null, "Volkswagon", "Golf", "2015", null, null);
            QuickClaim newQuickClaim18 = new QuickClaim(18, "Elizabeth Robinson", "Car", 160.00, "scrap on side of car", "paintwork repair", "Rejected", LocalDate.of(2022, Month.MAY, 5), "123410659", null, "Volkswagon", "Golf", "2019", null, null);
            QuickClaim newQuickClaim19 = new QuickClaim(19, "Emily Rooney", "Home", 205.00, "alarm repairs", "needed a new alarm", "Closed", LocalDate.of(2023, Month.JANUARY, 16), "127451003", "144 Oak Crescent", null, null, null, null, null);
            QuickClaim newQuickClaim20 = new QuickClaim(20, "Natalie Rooney", "Car", 200.00, "wing mirror off", "other car knocked off wing mirror", "Active", LocalDate.of(2023, Month.JANUARY, 16), "127451224", null, "Vauxhall", "Astra", "2020", null, null);

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
            QuickClaim savedQuickClaim11 = quickClaimRepository.save(newQuickClaim11);
            QuickClaim savedQuickClaim12 = quickClaimRepository.save(newQuickClaim12);
            QuickClaim savedQuickClaim13 = quickClaimRepository.save(newQuickClaim13);
            QuickClaim savedQuickClaim14 = quickClaimRepository.save(newQuickClaim14);
            QuickClaim savedQuickClaim15 = quickClaimRepository.save(newQuickClaim15);
            QuickClaim savedQuickClaim16 = quickClaimRepository.save(newQuickClaim16);
            QuickClaim savedQuickClaim17 = quickClaimRepository.save(newQuickClaim17);
            QuickClaim savedQuickClaim18 = quickClaimRepository.save(newQuickClaim18);
            QuickClaim savedQuickClaim19 = quickClaimRepository.save(newQuickClaim19);
            QuickClaim savedQuickClaim20 = quickClaimRepository.save(newQuickClaim20);

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
            System.out.println("Claim saved with id " + savedQuickClaim11.getId());
            System.out.println("Claim saved with id " + savedQuickClaim12.getId());
            System.out.println("Claim saved with id " + savedQuickClaim13.getId());
            System.out.println("Claim saved with id " + savedQuickClaim14.getId());
            System.out.println("Claim saved with id " + savedQuickClaim15.getId());
            System.out.println("Claim saved with id " + savedQuickClaim16.getId());
            System.out.println("Claim saved with id " + savedQuickClaim17.getId());
            System.out.println("Claim saved with id " + savedQuickClaim18.getId());
            System.out.println("Claim saved with id " + savedQuickClaim19.getId());
            System.out.println("Claim saved with id " + savedQuickClaim20.getId());
        }

    }

    @PostConstruct
    public void createInitialUsers(){
        if(userRepository.count() == 0) {
            User user1 = new User("vanessa", "Vanessa", "pass1", UserRole.AGENT);
            User user2 = new User("tommy", "Tommy", "pass1", UserRole.USER);
            userService.save(user1);
            userService.save(user2);
        }
    }

}
