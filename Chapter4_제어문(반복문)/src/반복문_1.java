
public class 반복문_1 {

	public static void main(String[] args) {

		//1~100까지의 합
		
		int i;
		int sum=0;
		
		//------------------
		for(i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
		
		//------------------		
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		
		
		//------------------		
		do {
			System.out.println(sum);
			i++;
		}while(i<=10);
		
		
		
		
	}
}
