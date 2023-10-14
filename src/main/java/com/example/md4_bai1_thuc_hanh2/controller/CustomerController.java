package com.example.md4_bai1_thuc_hanh2.controller;

import com.example.md4_bai1_thuc_hanh2.model.Customers;
import com.example.md4_bai1_thuc_hanh2.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomersService customersService;
//    CustomersService customersService = new CustomersService();
//    @GetMapping("/customers")
//    public String showList(Model model) {
//        List<Customers> customers = customersService.displayAll();
//        model.addAttribute("customersList", customers);
//        return "list";
//    }
//    @GetMapping("/customers")
//    public String showList(HttpServletRequest request) {
//        List<Customers> customers = customersService.displayAll();
//        request.setAttribute("customersList", customers);
//        return "list";
//    }
    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customers> customersList = customersService.displayAll();
        modelAndView.addObject("customersList", customersList);
        return modelAndView;
    }
    @GetMapping("/createCustomers")
    public ModelAndView createCustomers(){
        return new ModelAndView("form");
    }
    @PostMapping("/createCustomers")
    public ModelAndView saveCustomer(Customers customers){
//        ModelAndView modelAndView = new ModelAndView("list");
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String address = request.getParameter("address");
        customersService.create(customers);
        return showList();
    }
//    @GetMapping ("/saveCustomers")
//    public String showListAfter (HttpServletRequest request) {
//                List<Customers> customers = customersService.displayAll();
//        request.setAttribute("customersList", customers);
//        return "list";
//    }
}
