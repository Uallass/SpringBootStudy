package com.uallas.study.room_web_app.services;

import com.uallas.study.room_web_app.data.StaffRepository;
import com.uallas.study.room_web_app.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }

}
