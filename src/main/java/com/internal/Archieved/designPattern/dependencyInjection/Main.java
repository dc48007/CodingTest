package com.internal.Archieved.designPattern.dependencyInjection;
public class Main {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        User user = new User("John", 22);
        userService.createUser(user);
    }

}
