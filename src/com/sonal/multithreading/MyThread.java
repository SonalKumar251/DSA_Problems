package com.sonal.multithreading;

import java.util.List;

public class MyThread extends Thread{
	
	List<String> names;
	
	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public List<String> getNames() {
		return this.names;
	}
	
	@Override
	public void run() {
		ServiceManager sm = new ServiceManager();
		names = sm.prepareList(names);		
	}

}
