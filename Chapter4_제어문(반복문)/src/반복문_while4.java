
import java.util.Scanner;

public class 반복문_while4 {

	public static void main(String[] args) {

		int sum=0;
		
		int i=1;
		while(i<=10)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println(i+"번째 정수 입력:");
			int num=scan.nextInt();
			sum+=num;

			i++;
		}
		System.out.println("sum:"+sum);
		
		
	}
}
