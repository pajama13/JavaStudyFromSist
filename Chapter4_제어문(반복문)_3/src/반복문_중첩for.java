
public class 반복문_중첩for {

	public static void main(String[] args) {
		
		char c='A';
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(c);
		
			}
			c++;
			System.out.println();
		}
		
		
		//구구단 출력하기
//		for(int i=1; i<=9; i++)
//		{
//			for(int j=1; j<=9; j++)
//			{
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
//		for(int i=0; i<5; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	
//		for(int i=0; i<5; i++)
//		{
//			for(char c='A'; c<=('A'+i); c++)
//			{
//				System.out.print(c);
//			}
//			System.out.println();
//		}
		
		
	}

}
