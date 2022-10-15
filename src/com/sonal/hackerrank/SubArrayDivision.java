package com.sonal.hackerrank;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
	
	public int getCount(List<Integer> s, int d, int m) {
		int j=0,count=0;

		int temp=0;
		boolean flag=true;
		for(int i=0;i<=s.size()-m;i++) {
			for(int k=0;k<m;k++) {
				j=k+i;
				if(j==s.size())break;
				
				temp+=s.get(j);
			}
			
			System.out.println("temp ->"+temp);
			if(temp==d) count++;
			temp=0;
			
		}
        return count;
	}
	
	public static void main(String[] args) {
		List<Integer> arr= Arrays.asList(2,2,1,2,4);
		int length = 3;
		int sum = 5;
		SubArrayDivision sb=new SubArrayDivision();
		System.out.println(sb.getCount(arr,sum,length));
	}
}
