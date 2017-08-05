package airlinereservation.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class AirlineReservation{
    @RequestMapping("/")  // For Login Page
    public String welcome(Map<String, Object> model) {
//hfgfjdg
        return "Login";
    }
    @RequestMapping("/createReservation")  // For Login Page
    public String createReservation(Map<String, Object> model) {

        return "Login";
    }
    @RequestMapping("/searchReservation")  // For Login Page
    public String searchReservation(Map<String, Object> model) {

        return "Login";
    }
    @RequestMapping("/searchFlight")  // For Login Page
    public String searchFlight(Map<String, Object> model) {

        return "Login";
    }
    @RequestMapping("/updateReservation")  // For Login Page
    public String updateReservation(Map<String, Object> model) {

        return "Login";
    }



}
