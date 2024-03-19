package org.example;

public class Main2 {
    public static void main(String[] args) {
        User user = new User("zxc123", "1234");
        System.out.println(user.getLogin());
        user.setLogin("zxc1234");
        System.out.println(user.getLogin());
    }
}
