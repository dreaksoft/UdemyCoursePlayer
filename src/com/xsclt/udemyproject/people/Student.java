package com.xsclt.udemyproject.people;

import com.xsclt.udemyproject.objects.Course;
import com.xsclt.udemyproject.objects.Lesson;
import com.xsclt.udemyproject.utilities.Util;

import java.util.LinkedHashSet;

public class Student extends Person {

    // Fields
    private LinkedHashSet<Course> courseList;
    private LinkedHashSet<Lesson> lessonList;

    // Constructor
    public Student(String name, String email, int age) {
        super(name, email, age);
        courseList = new LinkedHashSet<>();
        lessonList = new LinkedHashSet<>();
    }

    // Add course at courseList
    public void addCourse(Course course) {

        Util.add(course,courseList);

    }

    // Remove course from courseList
    public void removeCourse(Course course) {

        Util.remove(course,courseList);

    }

    // Add lesson at lessonList
    public void addLesson(Lesson lesson) {

        Util.add(lesson,lessonList);

    }

    // Remove lesson from lessonList
    public void removeLesson(Lesson lesson) {

        Util.remove(lesson,lessonList);

    }

    public int sizeList(){
        return courseList.size();
    }

    @Override
    public void getInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
