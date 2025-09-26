package com.uallas.study.room_web_app.data;

import com.uallas.study.room_web_app.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
