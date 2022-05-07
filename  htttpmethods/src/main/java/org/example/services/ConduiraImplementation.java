package org.example.services;

import org.example.Model.StudentDetails;
import org.springframework.stereotype.Service;

@Service
public class ConduiraImplementation implements ConduiraService {
    @Override
    public String addStudentData(StudentDetails studentDetails) {
        return studentDetails.getName();
    }

    @Override
    public String getStudetData() {
        return null;
    }

    @Override
    public String getStudentData(StudentDetails studentDetails) {
        return "This is the get method";
    }
}

