package com.sonal.Demo;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	public void testSet() {
		Set<Integer> set= new HashSet<>();
		try {
			//to check exception
			set.add(1);
			set.add(3);
			set.add(5);
			set.add(1);
			set.add(3);
			System.out.println(set);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestSet ts = new TestSet();
		ts.testSet();
	}
	
}
