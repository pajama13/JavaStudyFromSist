/*

 */

import java.util.Arrays;

public class 배열응용_5_ArraySort {

	public static void main(String[] args) {

		//정렬 대상 1개 만들기
		int[] arr=new int[5];
		
		//초기화
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		//출력
		System.out.println("정렬 전 : ");
		System.out.println("arr="+Arrays.toString(arr));
		
		System.out.println("\n정렬 후 : ");
		Arrays.sort(arr);
		System.out.println("arr="+Arrays.toString(arr));
		
		//거꾸로 출력
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
