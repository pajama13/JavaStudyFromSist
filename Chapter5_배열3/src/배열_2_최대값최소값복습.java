import java.util.Arrays;

/*

 */



public class 배열_2_최대값최소값복습 {

	public static void main(String[] args) {

		//1~100 사이의 정수를 10개 저장, 최대값, 최소값 구하고 최대값-최소값를 출력
		
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println("arr 전체값:"+Arrays.toString(arr)+"\n");
		
		int max=1;
		int min=100;
	
		for(int i:arr)
		{
			if(max<i)
				max=i;
			else if(min>i)
				min=i;
		}
		
		int index=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==max)
				index=i; //인덱스 번호 확인
				break;
		}
		
		int index1=0;
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]==min)
				index1=i;
				break;
		}
		
		//수정해야함
		System.out.println("최대값:"+max+" 저장위치:"+(index+1)); 
		System.out.println("최소값:"+min+" 저장위치:"+(index1+1));
		System.out.println("최대값-최소값:"+(max-min)); 
		
		
		
	//
	}

}
