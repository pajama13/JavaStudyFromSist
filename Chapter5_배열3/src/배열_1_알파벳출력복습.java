import java.util.Arrays;

/*
2022.11.01



 */

//10.31자 수업 복습
public class 배열_1_알파벳출력복습 {

	public static void main(String[] args) {

		// 26자 알파벳 저장 후 출력
		
		char[] alpha=new char[26]; //초기화 (값 : \u0000)
		
		char c='A';
		for(int i=0; i<alpha.length; i++)
		{
			alpha[i]=c++; //첫번째 i에는 A, 후치연산자이므로 두번째 i부터 B 저장
		}

		for(char ch:alpha) //배열, 컬렉션만 사용 가능
		{
			System.out.print(ch+" ");
		}
		
		
		
	//
	}
}
