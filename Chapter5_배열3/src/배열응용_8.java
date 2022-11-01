import java.util.Arrays;

/*

버블 정렬 : 인접한 것끼리 비교


 */

public class 배열응용_8 {

	public static void main(String[] args) {
	
		//알파벳 정렬 예제
		char[] arr=new char[10];
		//초기화
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(char)((Math.random()*26)+65); //임의의 알파벳 대문자 출력
		}
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\n정렬 후 : ");
		System.out.println(Arrays.toString(arr));
		
	//
	}

}
