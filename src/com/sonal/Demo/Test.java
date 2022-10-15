package com.sonal.Demo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static boolean checkVendorsValidity(String nextVcQtr) {
		boolean valid = false;
		Map<String,Integer> vcQtrs = new HashMap<>(); 
		vcQtrs.put("A",1);
		vcQtrs.put("B",2);
		vcQtrs.put("C",3);
		vcQtrs.put("D",4);
		LocalDate today = LocalDate.now();
		int currentYear = today.getYear();
		int nextVcYear = Integer.parseInt(nextVcQtr.substring(2));
		if(nextVcYear > currentYear) {
			valid = true;
		}
		else if(nextVcYear < currentYear){
			valid = false;
		}
		else {
			int currMonth = today.getMonthValue();
			int rem = 0, qtr = 0;
			for(int i = 1 ; i<=4 ; i++) {
				rem = currMonth - (3*i);
				if(rem<=0) {
					qtr = i;
					break;
				}			
			}
			String vendorsQtr = nextVcQtr.substring(0,1).toUpperCase();
			if(vcQtrs.get(vendorsQtr) > qtr)
				valid = true;
			else if(vcQtrs.get(vendorsQtr) <= qtr)
				valid = false;
		}
		return valid;
	}

	public static void main(String[] args) {
		//System.out.println(Test.checkVendorsValidity("a/2022"));
		StringBuilder sb = new StringBuilder("Sonal");
		sb.replace(sb.length()-1,sb.length(), "");
		System.out.println(sb);
		
	}
}
