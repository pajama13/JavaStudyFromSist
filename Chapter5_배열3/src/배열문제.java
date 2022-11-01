import java.util.Scanner;

public class 배열문제 {

	public static void main(String[] args) {

/*------------------------------------
1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 
	점수를 score 배열 변수에 저장하 고 1) 아래와 같이 출력하시오.
	
	1번 학생 : 100점  
	2번 학생 : 90점  
	3번 학생 : 85점  

2) 학생들의 총점을 출력하시오.

[풀이]
1. 배열 저장 : 데이터형[] 배열명
2. 배열 데이터 출력
3. 배열에 있는 가공하는 문제

 */
	
//		int[] score={100,90,85};
//		for(int i=0; i<score.length; i++)
//		{
//			System.out.println("1번) "+(i+1)+"번 학생 : "+score[i]);
//		}
//		
//		//총점 출력
//		int sum=0;
//		for(int i:score)
//		{
//			sum+=i;
//		}
//		System.out.println("1번) 전체 학생 점수합:"+sum);

/*------------------------------------
2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다.
 (실적 0~100)
 1) 사번별 실적을 출력하시오.사원(1) 50..
 2) 1월 실적의 총점과 평균을 출력하시오.
 3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.

 */
		
//		int[] score= {50,45,35,12,70};
//		
//		for(int i=0; i<score.length; i++)
//		{
//			System.out.println("2번) 사원("+(i+1)+") "+score[i]);
//		}
//	
//		//총합
//		int sum=0;
//		
//		for(int i:score)
//		{
//			sum+=i;
//		}
//		System.out.println("2번) 1월 실적 총점 : "+sum);
//		System.out.printf("2번) 1월 실적 평균 : %.2f\n",(sum/(double)score.length));
//		
//		int max=score[0],sabun1=0;
//		int min=score[0],sabun2=0;
//		
//		for(int i=0; i<score.length; i++)
//		{
//			if(score[i]>max)
//				max=score[i];
//			else if(score[i]<min)
//				min=score[i];
//		}
//		for(int i=0; i<score.length; i++)
//		{
//			if(score[i]==max)
//			{
//				sabun1=i;
//				break;
//			}
//		}
//		for(int i=0; i<score.length; i++)
//		{
//			if(score[i]==min)
//			{
//				sabun2=i;
//				break;
//			}
//		}
//		System.out.println("2번) 실적 가장 높은 사원("+(sabun1+1)+") "+max);
//		System.out.println("2번) 실적 가장 낮은 사원("+(sabun2+1)+") "+min);
				
	
/*------------------------------------
 3. 크기가 10인 정수형 배열을 생성하고
	여기에 0부터 9까지의 값으로 배열을 채우는 프로그램 만들기
 */
		
		
//		int[] arr=new int[10];
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*10);
//		}
//		System.out.println("3번) 0~9까지의 배열:"+Arrays.toString(arr));
		
/*------------------------------------
 4. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.

           public static void main(String[] args)
	{
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
	           (1) 알맞은 코드를 넣어 완성하시오.
	           
		System.out.println("sum="+sum); // 결과 : sum=150
	}

 */
		
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		System.out.println("4번) sum="+sum);

		
		
/*------------------------------------
5. 1~100사이의 정수를 10개 저장하고  
 정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장
 정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장

 */
		
//		int[] arr=new int[10];
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1; 
//		}
//		
//		int evenTotal=0, oddTotal=0;
//		
//		for(int i:arr)
//		{
//			if(i%2==0)
//				evenTotal+=i;
//			else
//				oddTotal+=i;
//		}
//		System.out.println("5번) 전체배열 = "+Arrays.toString(arr));
//		System.out.printf("5번) 짝수합 : %d  홀수합 : %d",evenTotal,oddTotal);
		

/*------------------------------------
6. 0~9사이의 난수를 100개 발생해서 
   빈도를 구해서 출력하시오 
   예)
   0의 개수: 1
   1의 개수: 1
   ..
   9의 개수: 0

 */
		
//		int[] arr=new int[100];
//		for(int i=0; i<arr.length; i++)
//		{
//			arr[i]=(int)(Math.random()*10); //0~9
//		}
//		System.out.println("6번) 전체배열="+Arrays.toString(arr));
//
//		
//		int[] count=new int[10];
//		for(int i=0; i<arr.length; i++)
//		{
//			count[arr[i]]++;
//		}
//		
//		//출력
//		for(int i=0; i<count.length; i++)
//		{
//			System.out.println("6번) "+i+"의 개수:"+count[i]);
//		}
		
		
		
/*------------------------------------
7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
    A C D H J
    -> A C D H J
    -> J H D C A

 */
		
//		char[] arr=new char[5];
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			arr[i]=(char)(Math.random()*26+65);
//		}
//		System.out.println("7번) 전체배열="+Arrays.toString(arr));
//		
//		//오름차순
//		for(int i=0; i<arr.length-1; i++)
//		{
//			for(int j=i+1; j<arr.length; j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					char temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("7번) 오름차순 정렬 : "+Arrays.toString(arr));
//		//내림차순
//		for(int i=0; i<arr.length-1; i++)
//		{
//			for(int j=i+1; j<arr.length; j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					char temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("7번) 내림차순 정렬 : "+Arrays.toString(arr));

		
		
/*------------------------------------

학생 3명의 국어, 영어, 수학 점수를 만들고,
총점, 평균, 등수를 구해라

*/
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		//int[][] 성적=new int[3][5];
		
		double[] avg=new double[3];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			System.out.println((i+1)+"번째 국어 입력:");
			kor[i]=scan.nextInt();
			System.out.println((i+1)+"번째 영어 입력:");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 수학 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		for(int i=0; i<3; i++)
		{
			rank[i]=1;
			for(int j=0; j<3; j++)
			{
				if(total[i]>total[j])
					rank[i]++;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
		}
		
		
	//	
	}

}
