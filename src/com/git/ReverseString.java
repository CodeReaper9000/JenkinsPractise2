package com.git;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefgh";
		char c[] = s.toCharArray();
		int l=0, r=s.length()-1;
		while(l<=r) {
			char temp = c[l];
			c[l] = c[r];
			c[r] = temp;
			l++;r--;
		}
		System.out.println(new String(c));
	}

}
