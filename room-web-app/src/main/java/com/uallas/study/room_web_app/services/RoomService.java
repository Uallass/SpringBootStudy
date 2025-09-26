package com.uallas.study.room_web_app.services;

import com.uallas.study.room_web_app.data.RoomRepository;
import com.uallas.study.room_web_app.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository rooms;

    public RoomService(RoomRepository rooms) {
        this.rooms = rooms;
    }

    public List<Room> getAllRooms(){
        return rooms.findAll();
    }
}
