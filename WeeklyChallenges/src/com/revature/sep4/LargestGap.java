package com.revature.sep4;

public class LargestGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,10,6,7};
		int diff = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int d = Math.abs(arr[i]-arr[j]);
				if(d>diff) {diff = d;}
			}
		}
		System.out.println(diff);
	}

}
