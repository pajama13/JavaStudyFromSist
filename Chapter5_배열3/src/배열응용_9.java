import java.util.Arrays;

public class 배열응용_9 {

	public static void main(String[] args) {
		
		int[] arr=new int[100];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*10); //0~9
		}
		System.out.println(Arrays.toString(arr));

		//빈도를 저장하는 배열(0~9)
		int[] result=new int[10];
		for(int i=0; i<arr.length; i++)
		{
			result[arr[i]]++;
		}
		//출력
		for(int i=0; i<result.length; i++)
		{
			System.out.println(i+":"+result[i]);
		}
		
	//	
	}

}
