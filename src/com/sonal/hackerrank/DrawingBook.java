package com.sonal.hackerrank;
public class DrawingBook {
	public static int pageCount(int totalPages, int toPage) {
		int count = 0;
		boolean odd = totalPages % 2 != 0;
		boolean forwardDirection = toPage <= totalPages/2;
		if(forwardDirection) {
			for(int i=1 ; i<=totalPages ; i++) {
				if(toPage <= i) {
					break;
				}
				i++;
				count++;
			}
		}
		else {
			for(int i = totalPages ; i>0 ; i--) {
				if(i == totalPages && odd)
					i--;				
				if(toPage >= i) {
					break;
				}
				i--;
				count++;
			}
		}
		return count; 
	}
	
	public static void main(String[] args) {
		System.err.println("minimum navigation of "+DrawingBook.pageCount(7, 4)+" pages.");
	}
}