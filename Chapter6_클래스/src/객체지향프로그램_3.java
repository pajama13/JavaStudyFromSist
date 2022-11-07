/*



 */

class FoodHouse{
	//자동초기화
	int fno; //0
	String title; //null
	double score; //0.0
	String address;
	String tel;
	String type;
	String price;
	String time;
	String[] menu; //null
}

public class 객체지향프로그램_3 {
	
	public static void main(String[] args) {

		//1. 메모리 생성
		FoodHouse food1=new FoodHouse();
		food1.fno=1;
		food1.title="부부김밥";
		food1.score=4.7;
		
		FoodHouse food2=new FoodHouse();
		food2.fno=2;
		food2.title="솔레미오";
		food2.score=4.8;
		
		//2. 메모리에 값 넣기
		//3. 메모리에 넣은 값 읽어오기
		System.out.println("---1번 맛집---");
		System.out.println(food1.fno);
		System.out.println(food1.title);
		System.out.println(food1.score);
		System.out.println("---2번 맛집---");
		System.out.println(food2.fno);
		System.out.println(food2.title);
		System.out.println(food2.score);
		
	}

}
