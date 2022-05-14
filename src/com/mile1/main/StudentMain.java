package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;
public class StudentMain {
		static Student data[]=new Student[4];
		static {
			for(int i=0;i<data.length;i++) data[i]=new Student();
			data[0]=new Student("Sekar",new int[] {35,35,35});
			data[1]=new Student(null,new int[] {11,22,33});
			data[2]=null;
			data[3]=new Student("Manoj",null);
		}
		public static void main(String[]args) {
			StudentService ss =new StudentService();
			StudentReport sr =new StudentReport();
			System.out.println(("Grade calculation"));
			String x=null;
			for(int i=0;i<data.length;i++) {
				try{x=sr.validate(data[i]);}
				catch(NullNameException e) {x="NullNameException occured";}
				catch(NullMarksArrayException e) {x="NullMarksArrayException occured";}
				catch(NullStudentException e) {x="NullStudentException occured";}
				System.out.println("Grade= "+x);
			}
			System.out.println(ss.findNumberOfNullMarks(data));
			System.out.println(ss.findNumberOfNullNames(data));
			System.out.println(ss.findNumberOfNullObjects(data));
			
			
			
		}
		
}
