package com.sonal.multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("sonal","bharat","dheeraj","raushan","pankaj","jay","rathore","kinshu","ankit","shashi");
		List<String> names = new ArrayList<String>(list);
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("thread-1");
		t2.setName("thread-2");
		
		t1.setNames(names.subList( 0, ((names.size())/2) ) );
		t2.setNames(names.subList((names.size()/2), names.size()));
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			System.err.println("Interrupted Exception : "+e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1.getNames());
		System.out.println(t2.getNames());
	}
	
}
