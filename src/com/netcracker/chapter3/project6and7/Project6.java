package com.netcracker.chapter3.project6and7;

public class Project6 {
    public static void main(String[] args) {
        Person person1 = new Person("Michail");
        Person person2 = new Person("Oleg");
        Person person3 = new Person("Anna");
        Person person4 = new Person("Julia");
        Person person5 = new Person("Denis");

        person1.befriend(person2);
        person1.befriend(person3);
        person1.befriend(person4);
        person1.befriend(person5);

        System.out.println(person1.getFriends());

        person1.unfriend(person3);

        System.out.println(person1.getFriends());

        System.out.println("Количество друзей: " + person1.getFriendCount());
    }
}
