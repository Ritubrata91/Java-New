package com.ritubrata.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentUsingComparator {
	final int rollno;
	final String name;
	final int age;
	StudentUsingComparator(final int rollno,final String name,final int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}

	static class AgeComparator implements Comparator<StudentUsingComparator>{
		@Override
		public int compare(final StudentUsingComparator s1,final StudentUsingComparator s2){
			if(s1.age==s2.age) {
				return 0;
			} else if(s1.age>s2.age) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	static class NameComparator implements Comparator<StudentUsingComparator>{
		@Override
		public int compare(final StudentUsingComparator s1,final StudentUsingComparator s2){
			return s1.name.compareTo(s2.name);
		}
	}

	public static void main(final String args[]){
		final ArrayList<StudentUsingComparator> al=new ArrayList<StudentUsingComparator>();
		al.add(new StudentUsingComparator(101,"Vijay",23));
		al.add(new StudentUsingComparator(106,"Ajay",27));
		al.add(new StudentUsingComparator(105,"Jai",21));

		System.out.println("Sorting by Name");
		Collections.sort(al,new NameComparator());
		for(final StudentUsingComparator st: al){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

		System.out.println("sorting by Age");
		Collections.sort(al,new AgeComparator());
		for(final StudentUsingComparator st: al){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
