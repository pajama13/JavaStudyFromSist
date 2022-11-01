import java.util.Arrays;

/*

응용1 : 학생 3명의 국어, 영어, 수학 점수 저장 후, 총점, 평균, 학점, 등수 출력하기
응용2 : 숫자 야구게임 만들기

 */



public class 배열응용_1 {

	//5개의 정수 저장 후, 총합과 평균을 출력하기 (196p)
	public static void main(String[] args) {
		
		int[] score=new int[5];
		for(int i=0; i<score.length; i++)
		{
			score[i]=(int)(Math.random()*71)+30; //100점 만점에 30점은 기본점수로 넣어줌
		}
		System.out.println(Arrays.toString(score));
		
		//총합과 평균 초기화
		int total=0;
		double avg=0.0;
		
		//총합 구하기
		for(int i:score)
		{
			total+=i;
		}
		
		//출력
		System.out.println("총합 : "+total);
		System.out.printf("평균 : %.2f\n",total/(double)score.length);
		
		
		
		
	//
	}

}
