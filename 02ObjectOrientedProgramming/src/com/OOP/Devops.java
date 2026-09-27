package com.OOP;

public class Devops implements ICourse{
    @Override
    public boolean registerCourse() {
        System.out.println("Enrolled to Devops course");
        return false;
    }
}
