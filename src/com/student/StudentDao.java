package com.student;

import java.util.Hashtable;
import java.util.Vector;

public interface StudentDao {
	public Hashtable<Integer, Student> getAllStudent();
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	public void addStudent(Student student);
}
