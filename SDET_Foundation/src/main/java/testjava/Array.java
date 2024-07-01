package testjava;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] arr= new int [5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
	
		System.out.println(Arrays.toString(arr));
		
		int[] a= {1,2,3,4,5};
		a[2]=6;
		a[3]=7;
		System.out.println(Arrays.toString(a));
		
		int[] b= {8,10,7,15,20};
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+ " ");
			
		
		}
		//ArraySort
		
		int[] c= {0,5,10,20,-1,-5,1,4};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c)); 
		
		//reversearray
		
		int[] d={1,2,3,4,5};
		int index=0;
		for(int i=d.length-1;i>=d.length/2;i--) {
			int copy=d[index];
			d[index++]=d[i];
			d[i]=copy;
		}
		System.out.println(Arrays.toString(d));
		
		//pre increment and post increment
		
		int i=1;
		System.out.println(i++); //1 will get printed and i will be 2 now
		System.out.println(++i);// since i=2 now after incrementation it will print 3

		int j=3;
		 System.out.println(j--); //3 will get printed and have 1 now
		 System.out.println(--j);// after decrementation it will print 1 now
	}

}
