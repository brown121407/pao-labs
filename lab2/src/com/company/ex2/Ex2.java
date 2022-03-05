package com.company.ex2;

public class Ex2 {
    public static void main(String[] args) {
        var room1 = new Room(101, RoomType.Single, 1);
        var room2 = new Room(203, RoomType.Double, 2);

        System.out.println(room1);
        System.out.println(room2);
    }
}
