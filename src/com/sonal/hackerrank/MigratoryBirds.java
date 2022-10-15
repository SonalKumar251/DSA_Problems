package com.sonal.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
	Map<Integer,Integer> type = new HashMap<Integer,Integer>();
	//Map.Entry<Integer, Integer> entry = null;
	public int getMinimumSpottedBirdWithMaxFrequency(List<Integer> arr) {
		int maxFrequency =0;
		for(Integer bird : arr) {
			type.put(bird, type.containsKey(bird)?type.get(bird)+1:1);
		}
		
//		for(Map.Entry<Integer, Integer> value : type.entrySet()) {
//			maxFrequency = value.getValue()>maxFrequency ? value.getValue() : maxFrequency;
//		}
		
		//OR
		
		maxFrequency = type.values().stream().max(Comparator.naturalOrder()).get();

		int smallestId=5;
		for(Map.Entry<Integer, Integer> ent: type.entrySet()) {
			if(ent.getValue()==maxFrequency)
				smallestId = ent.getKey()<smallestId ? ent.getKey() : smallestId;
		}

		return smallestId;
	}
	
	public static void main(String[] args) {
	    
	    List<Integer> arr = Arrays.asList(4,4,2,2,1,3,3);
	    
	    MigratoryBirds mb = new MigratoryBirds();
	    System.out.println("bird with smallest id and max frequency = "+mb.getMinimumSpottedBirdWithMaxFrequency(arr));
	}
}
