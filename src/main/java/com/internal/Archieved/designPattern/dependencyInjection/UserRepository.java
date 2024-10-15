package com.internal.Archieved.designPattern.dependencyInjection;
public class UserRepository {
    public void saveUser(User user){
        System.out.println("User informaton saved: "+user.getName() + " and has age"+ user.getAge());
    }
}
