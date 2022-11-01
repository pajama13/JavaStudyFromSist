import java.util.Arrays;

/*

정렬 (asc 올림차순 / desc 내림차순) - 202p
*선택정렬 : 하나를 기준으로 전체 비교하는 것을 반복함 (전체 대상-1 회 비교함)
*버블정렬 바로 옆끼리 비교


 */


public class 배열응용_4_정렬_내림차순 {

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
		//정렬 - 내림차순
		for(int i=0; i<arr.length-1; i++) //length-1 : 자신과의 비교는 제외하기(불필요한 루프 줄이기)
		{
			for(int j=i+1; j<arr.length; j++) //length-1이 아닌 이유 : 
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println((i+1)+":"+Arrays.toString(arr));
		}
		//정렬 - 올림차순
//		for(int i=0; i<arr.length-1; i++) //length-1 : 자신과의 비교는 제외하기
//		{
//			for(int j=i+1; j<arr.length; j++) //length-1이 아닌 이유 : 
//			{
//				if(arr[i]>arr[j])  //올림차순
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		System.out.println("정렬 후 : ");
		System.out.println("arr="+Arrays.toString(arr));
		
		
	//
	}
}
