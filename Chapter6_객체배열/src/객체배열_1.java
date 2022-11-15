

class Student
{
	String name;
	int kor,eng,math;
}
public class 객체배열_1 {

	public static void main(String[] args) {

		Student hong=new Student(); //hong 주소(참조변수) --- name,kor,eng,math
		Student park=new Student();
		Student kim=new Student();
		
		//변수에 값 저장
		hong.name="홍합";
		hong.kor=90;
		hong.eng=80;
		hong.math=76;
		
		park.name="박카스";
		park.kor=80;
		park.eng=70;
		park.math=90;
		
		kim.name="김말이";
		kim.kor=60;
		kim.eng=100;
		kim.math=90;
		
		//출력과 제어 - 먼저 배열로 묶어주기
		Student[] std= {hong,park,kim};
		for(int i=0; i<std.length; i++)
		{
			System.out.println(std[i].name+" "+
				std[i].kor+" "+std[i].eng+" "+std[i].math+" "+
				(std[i].kor+std[i].eng+std[i].math)+" "+(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
		
	}

}
