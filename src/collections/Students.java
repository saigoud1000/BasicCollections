package collections;

import java.util.ArrayList;
import java.util.List;

public class Students {

	
	public Students(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public static  void main(String[] args) {
		
		List<Students> st= new ArrayList<Students>();
		
		st.add(new Students(1,65)); 
		st.add(new Students(2,75));
		st.add(new Students(3,69));
		st.add(new Students(4,99));
		for(Students s: st){
			System.out.println(s);
			
		}
		

	}
	 class Student{
		int rollno;
		int marks;
		
		public Student(int rollno, int marks) {
			
			this.rollno = rollno;
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "students [rollno=" + rollno + ", marks=" + marks + "]";
		}
		
	}
	

}
