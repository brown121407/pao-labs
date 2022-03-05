package com.company.ex2;

public class Room {
    private int number;
    private RoomType type;
    private int floor;

    public Room(int number, RoomType type, int floor) {
        this.number = number;
        this.type = type;
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type=" + type +
                ", floor=" + floor +
                '}';
    }
}
