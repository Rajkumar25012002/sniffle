package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarks(Student data[]) {
		int count=0;
		for(int i=0;i<data.length;i++) {
			try{data[i].getMarks();} 
			catch(Exception e) {
				count++;
			}
		}
		return count;
	}
	public int findNumberOfNullNames(Student data[]) {
		int cout=0;
		for(int i=0;i<data.length;i++) {
			try{data[i].getName();} 
			catch(Exception e) {
				cout++;
			}
		}
		return cout;
	}
	public int findNumberOfNullObjects(Student data[]) {
		int cont=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]==null) {
				cont++;
			}
		}
		return cont;
	}
}
