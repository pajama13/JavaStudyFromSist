import java.util.Arrays;

/*

버블정렬

 */

// 버블정렬 - 올림차순
public class 배열_6_버블정렬 {

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
		//버블 정렬 실행
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
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
