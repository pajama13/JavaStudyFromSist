
public class 반복문_중첩for5 {

	public static void main(String[] args) {

		//구구단 2단부터 출력하기
		System.out.println("구구단 출력:");
		
		for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=9; j++)
			{
				System.out.printf("%2d*%2d=%2d\n",j,i,j*i);
			}
			System.out.println();
		}
		
		
	//
	}
}
