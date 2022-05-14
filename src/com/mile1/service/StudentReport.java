package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;
public class StudentReport {
	public String finalGrade(Student studentObj) {
		String str="";
		int sum=0;
		for(int i=0;i<3;i++) {
			if(studentObj.marks[i]<35) {
				str="F";
			}
		}
		for(int val:studentObj.marks) {
			sum=sum+val;
		}
		if(sum<=150)str="D";
		else if(sum>150 && sum<=200)str="C";
		else if(sum>200 && sum<=250)str="B";
		else if(sum>250 && sum<=300)str="A";
		return str;
	}
	public String validate(Student studentObj)throws NullStudentException,NullNameException,NullMarksArrayException {
		if(studentObj==null) {
			throw new NullStudentException();
		}
		else {
			if(studentObj.name==null) {
				throw new NullNameException();
			}
			if(studentObj.marks==null) {
				throw new NullMarksArrayException();
			}
			else {
				return finalGrade(studentObj);
			}
		}
	}
}
