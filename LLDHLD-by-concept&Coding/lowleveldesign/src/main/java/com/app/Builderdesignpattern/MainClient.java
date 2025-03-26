package com.app.Builderdesignpattern;

public class MainClient {

    public static void main(String[] args) {


       Student student = new Student.StudentBuilder("123").setName("Dinesh").build();

    }
}
