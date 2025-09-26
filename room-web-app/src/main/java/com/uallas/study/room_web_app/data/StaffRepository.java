package com.uallas.study.room_web_app.data;

import com.uallas.study.room_web_app.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember, Long> {
}
