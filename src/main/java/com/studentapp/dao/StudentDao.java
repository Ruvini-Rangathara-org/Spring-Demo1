package com.studentapp.dao;

import com.studentapp.entity.Student;

import java.util.List;

public interface StudentDao {

    boolean saveStudent(Student student);
    boolean updateStudent(Student student);
    Student getStudent(long id);
    boolean deleteStudent(long id);
    List<Student> getAllStudents();

}
