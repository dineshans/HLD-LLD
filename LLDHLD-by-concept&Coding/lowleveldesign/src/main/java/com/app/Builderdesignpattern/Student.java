package com.app.Builderdesignpattern;

import java.util.List;

public class Student {

    private String rollNumber;
    private String name;

    public Student(StudentBuilder builder) {

        rollNumber = builder.rollNumber;
        name = builder.name;
    }

    static class StudentBuilder{

        private String rollNumber;
        private String name;
        private List<String> subject;

        public StudentBuilder(String rollNumber) {

            this.rollNumber = rollNumber;
        }

        public StudentBuilder setRollNumber(String rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
