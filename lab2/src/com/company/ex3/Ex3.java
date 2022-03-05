package com.company.ex3;

import com.company.ex1.Person;
import com.company.ex2.Room;
import com.company.ex2.RoomType;

public class Ex3 {
    public static void main(String[] args) {
        var p1 = new Person("Unu", "Persoana", 20, 1234567890, "M");
        var p2 = new Person("Doi", "Persoana", 20, 1234567891, "F");

        var room1 = new Room(101, RoomType.Single, 1);
        var room2 = new Room(203, RoomType.Double, 2);

        var subject1 = new Subject(room1, 29, p1);
        var subject2 = new Subject(room2, 33, p2);

        System.out.println(subject1);
        System.out.println(subject2);
    }
}
