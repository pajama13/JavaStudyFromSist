import java.util.Arrays;

/*

문제 : A~Z 사이 문자를 10개 저장 후 최대값, 최소값 출력

 */

public class 배열응용_2_알파벳최대값최소값 {

	public static void main(String[] args) {

	char[] alpha=new char[10];
	
	for(int i=0; i<alpha.length; i++)
	{
		alpha[i]=(char)((Math.random()*26)+65); //대문자 알파벳 랜덤추출
	}
	System.out.println(Arrays.toString(alpha));
	
	char max='A';
	char min='Z';
	
	//필요한 데이터를 찾기 위한 제어
	for(char i:alpha)
	{
		if(max<i)
			max=i;
		else if(min>i)
			min=i;
	}
	
	//데이터 출력
	System.out.println("최대값 : "+max);
	System.out.println("최소값 : "+min);
	
	
			
	//
	}

}
