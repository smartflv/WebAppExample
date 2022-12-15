package com.siit.webapp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentsRepository {

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Mihai", "Pop", new int[]{4, 8, 9});
        Student student2 = new Student("Roxana", "Dobre", new int[]{9, 10, 10});
        Student student3 = new Student("Vali", "Topescu", new int[]{7, 8, 7});
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        return studentList;
    }


}
