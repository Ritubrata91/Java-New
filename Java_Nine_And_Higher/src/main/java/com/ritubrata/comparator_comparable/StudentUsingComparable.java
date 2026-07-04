package com.ritubrata.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentUsingComparable  implements Comparable<StudentUsingComparable>{
	int rollno;
	String name;
	int age;
	StudentUsingComparable(final int rollno,final String name,final int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(final StudentUsingComparable st){
		if(age==st.age) {
			return 0;
		} else if(age>st.age) {
			return 1;
		} else {
			return -1;
		}
	}


	public static void main(final String args[]){
		final ArrayList<StudentUsingComparable> al=new ArrayList<StudentUsingComparable>();
		al.add(new StudentUsingComparable(101,"Vijay",23));
		al.add(new StudentUsingComparable(106,"Ajay",27));
		al.add(new StudentUsingComparable(105,"Jai",21));

		Collections.sort(al);
		for(final StudentUsingComparable st:al){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}
