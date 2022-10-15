package com.sonal.multithreading;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceManager {
	
	public List<String> prepareList(List<String> names){
		for(int i = 0 ; i < names.size() ; i++) {
			System.out.println(Thread.currentThread().getName()+", name : "+names.get(i)+", index : "+i);
			String upper = names.get(i).toUpperCase();
			names.set(i, upper);
		}
		//names=names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		return names;
	}
}
