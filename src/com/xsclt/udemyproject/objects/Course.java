package com.xsclt.udemyproject.objects;

import com.xsclt.udemyproject.people.Teacher;
import com.xsclt.udemyproject.utilities.Util;

import java.util.LinkedHashSet;

public class Course {

    // Fields

    private String name;
    private LinkedHashSet<Lesson> lessonList;
    private LinkedHashSet<Teacher> teacherList;
    private double totalTime = 0;
    private boolean isActive ;

// Initialize block for create teacherList and lessonList.

    {
        lessonList = new LinkedHashSet<>();
        teacherList = new LinkedHashSet<>();

    }

    // Constructor

    public Course(String name) {

        this.name = name;

    }

    // Adding lesson to course.

    public void addLesson(Lesson lesson) {

        Util.add(lesson, lessonList);
        Util.add(lesson.getTeacher(), teacherList);
        totalTime += lesson.getLength();
        lesson.setCourse(this);

        if (totalTime >= 60 && lessonList.size() >= 5) {
            isActive = true;
        }

    }

    // Showing lessons

    public void showLessons(){

        System.out.println("Showing lessons at "+name);

        for (Lesson temp : lessonList) {
            System.out.println(temp);
        }

    }

    // Showing teachers

    public void showTeachers(){

        System.out.println("Showing teachers at "+name);

        for (Teacher temp : teacherList) {
            System.out.println(temp);
        }

    }

    // Get methods

    public boolean isActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

}
