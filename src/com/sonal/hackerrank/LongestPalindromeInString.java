package com.sonal.hackerrank;
/*
 * @author sonal
 */
public class LongestPalindromeInString {
	
	public static boolean checkPalindrome(String word) {
		int length = word.length();
		boolean flag = false;
		for(int i = 0 ; i < length/2 ; i++) {
			int index = length-1;
			if(word.substring(i,i+1).equals(word.substring(index-i,length-i)))//can use charAt(i) instead of substring
				flag = true;
			else
				return false;
		}
		return flag;
	}
	
	public static String getMaxPalindrome(String str) {
		int maxLength = 3;
		String cWord = "";
		boolean isPalindrome = false;
		String palindrome = "";
		for(int i = 0 ; i<=str.length()-maxLength ; i++) {			
			cWord = str.substring(i,maxLength+i);
			isPalindrome = LongestPalindromeInString.checkPalindrome(cWord);
			//System.out.println(cWord+" : "+palindrome);
			if(isPalindrome) {
				palindrome = cWord;
				maxLength = cWord.length()+1;
				i = -1;
			}			
			if(i==str.length()-maxLength) {
				maxLength = cWord.length()+1;
				i = -1;
			}
			
		}
		
		return palindrome;
	}
	
	public static void main(String[] args) {
		String str = "abccacmadamttttcghjuklgfdssdftffttrabcdcdce";
		//System.out.println(LongestPalindromeInString.checkPalindrome("bcca"));
		System.out.println("Longest Palindrome -> "+LongestPalindromeInString.getMaxPalindrome(str));
	}
}
