import java.util.Arrays;

/*

*/


public class 배열응용_7_알파벳정렬 {

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
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
	//
	}

}
