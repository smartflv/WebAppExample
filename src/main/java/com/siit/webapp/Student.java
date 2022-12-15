package com.siit.webapp;

public class Student implements Comparable<Student>{
    private final String firstName;
    private final String lastName;
    private int[] grade;

    private double gradesAverage;

    public Student(String firstName, String lastName, int[] grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getGrade() { return grade; }

    public double getGradesAverage() {
        return gradesAverage;
    }

    public void setGradesAverage(double gradesAverage) {
        this.gradesAverage = gradesAverage;
    }

    @Override
    public int compareTo(Student o){
        if(this.gradesAverage<o.gradesAverage)
            return -1;
        else if(o.gradesAverage<this.gradesAverage)
            return 1;
        return 0;
    }

}

