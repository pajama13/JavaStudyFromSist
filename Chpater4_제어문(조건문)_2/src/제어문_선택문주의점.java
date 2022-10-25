/*

{}안에 있는 변수는 해당 블럭 안에서만 사용 가능

 */

public class 제어문_선택문주의점 {

	public static void main(String[] args) {
		int d=40;
		if(true) {
			int a=10;
				if(true) {
					int b=20;
					if(true) {
						int c=30;
					}
				}
		}
		
		
		
	}
}
