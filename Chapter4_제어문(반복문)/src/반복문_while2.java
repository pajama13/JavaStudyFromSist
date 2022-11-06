
public class 반복문_while2 {

	public static void main(String[] args) {
		
		int sum=0;
		
		int i=1;
		while(i<=6) {
			int a=(int)(Math.random()*100)+1;
			System.out.println(i+":"+a);
			sum+=a;
			i++;
		}
		System.out.println("총합:"+sum);
	}

}
