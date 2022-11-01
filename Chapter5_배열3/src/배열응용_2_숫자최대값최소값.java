import java.util.Arrays;

/*

 */


public class 배열응용_2_숫자최대값최소값 {

	public static void main(String[] args) {

		int[] arr=new int[10];
		//데이터 넣기, 배열의 초기화
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int max=arr[0];
		int min=arr[0];
		
		//데이터 가공
		for(int i:arr)
		{
			if(max<i)
				max=i;
			else if(min>i)
				min=i;
		}
		System.out.println("최대값 : "+max+"  최소값 : "+min);
		
		
	//
	}

}
