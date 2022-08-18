package com.revature;

public class WalkOnTheAxis {
	public static void main(String[] args) {
		int[] N = {1,2};
		int T = 2;
		
		for(int i=0;i<T;i++) {
			int dist =0;
			for(int j=0;j<N[i]/2;j++) {
				dist = dist+Math.abs(j-N[i]-j);
				int a = j+1;
				if(a*2 <= N[i]) {
					dist = dist+Math.abs(N[i]-j-a);
				}
			}
			System.out.println(dist+2);
		}
	}
	
}
