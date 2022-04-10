package com.netcracker.chapter3.project6and7;

public class Person {
    private String name;
    private String friends;

    public Person(String name) {
        this.name = name;
        friends = "";
    }

    public void befriend(Person p){
        this.friends += p.getName() + " ";
    }

    public void unfriend(Person p){
        this.friends = this.friends.replace(p.getName()+" ","");
    }

    public String getName() {
        return name;
    }

    public String getFriends(){
        return friends;
    }

    public int getFriendCount(){
        int result = 0;
        String[] array = friends.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].trim().isEmpty()) {
                result++;
            }
        }
        return result;
    }
}
