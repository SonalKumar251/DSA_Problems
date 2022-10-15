package com.sonal.Demo;

public class GrandChildren {
	
	private int noOfGrandChilds = 0;
	private int attempt = 0;
	
	public static void main(String[] args) {
		GrandChildren gc = new GrandChildren();
		String arr[][] = { 
						   {"luke", "shaw"},
		                   {"wayne", "rooney"},
		                   {"rooney", "ronaldo"},
		                   {"shaw", "rooney"}
						 };
		
		gc.findNoOfGrandChilds("ronaldo", arr);
		System.out.println(gc.getNoOfGrandChilds());
	}
	
	//method to count no of grand childs
	public void findNoOfGrandChilds(String name, String arr[][]) {
		String childName = null;
		System.out.println(name);
		for(int i = 0 ; i < arr.length ; i++) {
			if(name.equals(arr[i][1])) {
				childName = arr[i][0];
				this.attempt++;
			}
		}
		
		if(childName != null){		
			//System.out.println(getAttempt());
			System.out.println(childName+", "+getAttempt());
			findNoOfGrandChilds(childName, arr);
			if(getAttempt()>2) {				
				this.noOfGrandChilds++;
			}					
		}
			
	}
	
	private int getNoOfGrandChilds() {
		return noOfGrandChilds;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}
}
