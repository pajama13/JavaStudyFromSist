import java.util.Scanner;

public class 조건문_연습문제 {

	public static void main(String[] args) {

		//1. 정수 1개를 입력 받아서 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 입력:");
//		int num=scan.nextInt();
//		
//		if(num>=50){
//			System.out.println(num+": 50이상의 수");
//		}else{
//			System.out.println(num+": 50미만의 수");
//		}

		
		//2. 정수 1개를 입력받아서 그 수가 3의 배수인지 판단해보자

//		int num=(int)(Math.random()*100)+1;
//		
//		if(num%3==0) {
//			System.out.println("[랜덤값] "+num+" -> 3의 배수");
//		}else{
//			System.out.println("[랜덤값] "+num+" -> 3의 배수 아님");
//		}
		
//		3. 1학년부터 4학년까지 중간고사 시험을 보았다.
//		   4학년은 70점 이상이면 합격, 그 외의 학년은 60점 이상이면 합격임.
//		   이를 판단하는 프로그램을 작성해보자.
//		   점수가 0미만 100초과이면 경고문구 출력!
//		 
//		
//		int grade, score;
//		grade=(int)(Math.random()*4)+1;
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 입력(0~100):");
//		
//		score=scan.nextInt();
//		if(score>=0 && score<=100) {
//			if(grade==4) { //4학년
//				if(score>=70)
//					System.out.println(grade+"학년: 합격입니다.");
//				else
//					System.out.println(grade+"학년: 불합격입니다.");
//			}else { //1~3학년
//				if(score>=60)
//					System.out.println(grade+"학년: 합격입니다.");
//				else
//					System.out.println(grade+"학년:불합격입니다.");
//			}
//		}else {
//			System.out.println("잘못된 입력입니다.");
//		}
	
		
		
		//4. 사용자로부터 3개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자
//		int a=(int)(Math.random()*100)+1;
//		int b=(int)(Math.random()*100)+1;
//		int c=(int)(Math.random()*100)+1;
//		
//		System.out.println("a="+a+" b="+b+" c="+c);
//		
//		int max=a;
//		if(max<b) max=b;
//		if(max<c) max=c;
//		// 전부 비교해야 되기 때문에 도중에 빠져나가게 하면 안 됨(수가 많아지면 for문 돌리기)
//
//		System.out.println("최대값:"+max);
//		
//		int min=a;
//		if(min>b) min=b;
//		if(min>c) min=c;
//		
//		System.out.println("최솟값:"+min);
//		
//		int sum=a+b+c;
//		double avg=(a+b+c)/3.0;
//		
//		System.out.println("총합:"+sum);
//		System.out.printf("평균:%.2f",avg);

		
		//5. 사용자로부터 정수를 입력 받아서 양수인지 음수인지 확인하는 프로그램 작성
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 입력:");
//		
//		int num=scan.nextInt();
//		
//		if(num>0) {
//			System.out.println(num+": 양수");
//		}else {
//			System.out.println(num+": 음수");
//		}
		
		
		System.out.println('a'+""+10+'a');
		
		//6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성

//		int i=(int)(Math.random()*2); //0~1
//		int no=(int)(Math.random()*26)+65;
//		char c=' ';
//		
//		if(i==0){
//			c=(char)no;  //대문자
//		}else{
//			c=(char)(no+32);  //소문자(+32 들어감)
//		}
//		System.out.println("c="+c);
//		if(c>='A' && c<='Z')
//			System.out.println(c+": 대문자");
//		else
//			System.out.println(c+": 소문자");
		
		//7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성
		// 97 이상 A+, 94이상 A0, 90 이상 A-
		// 87 이상 b+, 84이상 b0, 80이상 b-
		// 77 이상 c+, 74이상c0, 70이상 c-
		//67 이상d+, 64이상d0, 60이상 d-
//	
//		Scanner scan=new Scanner(System.in);
//		System.out.println("국어,영어,수학 입력(스페이스로 구분):");
//		int kor=scan.nextInt();
//		int eng=scan.nextInt();
//		int math=scan.nextInt();
//		int total=kor+eng+math;
//		double avg=total/3.0;
//		
//		int avg2=(int)avg;
//		char grade=' ', opt='-';
//		
//		if(avg2>=90) {
//			grade='A';
//			if(avg>=97)
//				opt='+';
//			else if(avg2>=94)
//				opt='0';
//			else 
//				opt='-';
//		}
//		else if(avg>=80) {
//			grade='B';
//			if(avg>=87)
//				opt='+';
//			else if(avg2>=84)
//				opt='0';
//			else 
//				opt='-';
//		}
//		else if(avg>=70) {
//			grade='C';
//			if(avg>=77)
//				opt='+';
//			else if(avg2>=74)
//				opt='0';
//			else 
//				opt='-';
//		}
//		else if(avg>=60) {
//			grade='B';
//			if(avg>=67)
//				opt='+';
//			else if(avg2>=64)
//				opt='0';
//			else 
//				opt='-';
//		}
//		
//		System.out.println("국어:"+kor);
//		System.out.println("영어:"+eng);
//		System.out.println("수학:"+math);
//		System.out.println("총점:"+total);
//		System.out.printf("평균:%.2f\n",avg);
//		System.out.println("학점:"+grade+""+opt);
		
		
	}
}
