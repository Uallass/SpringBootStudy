package com.uallas.study.room_web_app.models;

public enum Position {

    CONCIERGE("Manager"),
    ROOM_SERVICE("Room Service"),
    FRONT_DESK("Front Desk"),
    HOUSEKEEPING("Cleaning"),
    SECURITY("Gate Keeper");

    private final String position;

    Position(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return this.position;
    }
}
