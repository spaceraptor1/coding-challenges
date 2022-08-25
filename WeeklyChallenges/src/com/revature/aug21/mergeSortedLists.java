package com.revature.aug21;

public class mergeSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] lists = {{1,4,5},{1,3,4},{2,6}};
		
		int l=0;
		for(int[] i:lists) {
			l = l + i.length;
		}
		
		int[] a = new int[l];
		int ind = 0;
		for(int[] i:lists) {
			for(int j:i) {
				a[ind] = j;
				ind++;
			}
			
		}
		
		//int[] ans = new int[l];
		boolean b = true;
		while(b) {
			b = false;
			for(int i=0;i<l-1;i++) {
				if(a[i]>a[i+1]) {
					b = true;
					int c = a[i];
					a[i] = a[i+1];
					a[i+1] = c;
				}
			}
		}
		for(int i:a) {
			System.out.print(i + " ");
		}
		
		
	}

}
