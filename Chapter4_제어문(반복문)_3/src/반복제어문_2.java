
//continue -> 제외할 때 이용
//1~10 출력, 5, 9는 제외

public class 반복제어문_2 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++)
		{
			if(i==5 || i==9)
				continue;
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int i=1;
		while(i<=10)
		{
			if(i==5 || i==9)
				continue;
			System.out.print(i+" ");
			i++;
		}
		
		
	}

}
