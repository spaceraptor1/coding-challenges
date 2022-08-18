package com.revature;

public class yourNameIsMine {
	public static void main(String[] args) {
		String[][] n = {{"john","johanna"},{"ira","ira"},{"kayla","jayla"}};
		int T = n.length;
		
		for(int i=0;i<T;i++) {
			boolean b = true;
			String s1 = n[i][0];
			String s2 = n[i][1];
			for(int j=0;j<s1.length();j++) {
				if(!charExists(s1.charAt(j),s2)) {
					b=false;
				}
			}
			if(b) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}
	public static boolean charExists(char c, String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == c) {
				return true;
			}
		}
		return false;
	}
}
