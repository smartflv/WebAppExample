package com.siit.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CatalogueService {

    @Autowired
    public CatalogueService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    private final StudentsRepository studentsRepository;
    public String createStudentCatalogue(){
        List<Student> studentListToBeProcessed = studentsRepository.getStudents();
        String result = "";

        for (Student student: studentListToBeProcessed) {
            result = result.concat(student.getFirstName()).concat(" ").concat(student.getLastName().concat("<br></br>"));
        }

        return result;
    }

    private double calculateAverage(int[] grade) {
        double sum = 0;
        for (int i=0; i< grade.length; i++) {
            sum += grade[i];
        }
        return sum / grade.length;
    }

    public String createStudentGradesList() {
        List<Student> studentGradesList = studentsRepository.getStudents();
        String result = "";

        for (Student student : studentGradesList) {
            double average = calculateAverage(student.getGrade());
            student.setGradesAverage(average);
        }

        Collections.sort(studentGradesList, Collections.reverseOrder());

        for (Student student: studentGradesList) {
            result = result + "<br></br>" + student.getFirstName() + "," + student.getLastName() + ":" + String.format("%.2f", student.getGradesAverage());
        }
        return result;
    }

}
