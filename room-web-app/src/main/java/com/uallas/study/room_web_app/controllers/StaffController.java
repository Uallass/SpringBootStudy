package com.uallas.study.room_web_app.controllers;

import com.uallas.study.room_web_app.services.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String listStaff(Model model) {
        model.addAttribute("staff", staffService.getAllStaff());

        return "staff";
    }

}
