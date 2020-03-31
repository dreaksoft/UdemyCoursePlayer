package com.xsclt.udemyproject.people;

import com.xsclt.udemyproject.objects.Course;
import com.xsclt.udemyproject.objects.Lesson;
import com.xsclt.udemyproject.utilities.Util;

import java.util.LinkedHashSet;

public class Teacher extends Person{

    private LinkedHashSet<Lesson> lessonList;
    private int experienceYear;
    private Course course;

    {
        lessonList = new LinkedHashSet<>();
    }

    public Teacher(String name, String email, int age, int experienceYear) {
        super(name, email, age);
        this.experienceYear = experienceYear;
    }

    public void createLesson(String name, double length) {

        Lesson lesson = new Lesson(name, length, this);
        Util.add(lesson, lessonList);

    }

    public void createCourse(String name){
        course = new Course(name);
    }

    public void addLesson(Lesson lesson) {
        course.addLesson(lesson);
    }

    // Showing teacher's lessons

    public void showLessons() {

        System.out.println("Showing lessons at " + getName());

        for (Lesson temp : lessonList) {
            System.out.println(temp);
        }

    }

    @Override
    public void getInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + " Experience Year : " + experienceYear;
    }



}
