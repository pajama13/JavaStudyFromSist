import java.util.Scanner;

/*

std    std[0]	std[1]	std[2]
0x100	null	null	null
		 |
		0x100

 */

public class 객체배열_2 {

	public static void main(String[] args) {
		Student[] std=new Student[3]; //같은 폴더내에서는 다른 클래스 불러올 수 있음
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<std.length; i++)
		{
			//주의사항 std[i]를 메모리에 저장해줘야 함 (따로 안 만들면 저장공간 없어 값 저장 못함)
			std[i]=new Student(); //메모리 공간 만들기
			System.out.println("이름 입력 :");
			std[i].name=scan.next();
			System.out.println("국어점수 입력 : ");
			std[i].kor=scan.nextInt();
			System.out.println("영어점수 입력 : ");
			std[i].eng=scan.nextInt();
			System.out.println("수학점수 입력 : ");
			std[i].math=scan.nextInt();
			
	
		}
		//출력
		for(int i=0; i<std.length; i++)
		{
			System.out.println(std[i].name+" "+
				std[i].kor+" "+std[i].eng+" "+std[i].math+" "+
				(std[i].kor+std[i].eng+std[i].math)+" "+(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
	}

}
