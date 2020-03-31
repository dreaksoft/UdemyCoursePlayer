package com.xsclt.udemyproject.objects;

import com.xsclt.udemyproject.people.Teacher;

public class Lesson {

    // Fields

    private String name;
    private double length;
    private Course course;
    private Teacher teacher;
    private boolean isUsed; // is Lesson registered any course

    // Constructor

    public Lesson(String name, double length,Teacher teacher) {
        this.name = name;
        this.length = length;
        this.teacher = teacher;
    }

    // Get methods

    public Teacher getTeacher() {
        return teacher;
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public String getCourseName() {
        return course.getName();
    }

    // Set method

    public void setCourse(Course course) {
        if (isUsed){
            System.out.println("Lesson can be on just one course");
        } else {
            this.course = course;
        }

        isUsed = true ;

    }

    @Override
    public String toString() {
        return "Name : " + name + " Teacher : " + teacher.getName() + " Lenght : " + length;
    }
}
