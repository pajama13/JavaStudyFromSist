
abstract class 도형  //추상클래스
{
	public abstract void draw();  //추상메소드 - 공통적으로 사용되는 기능을 모아서 관리
	public void selectColor(String color) //색깔 변경 희망 시 자식클래스에서 오버라이딩해서 변경
	{
		System.out.println("선택 색상 : 검정색");
	}
}
class 사각형 extends 도형
{
	//추상클래스 상속 받을 때 추상메소드 구현부를 완성시켜줘야 함**
	public void draw()
	{
		System.out.println("사각형을 그린다");
	}
	public void selectColor(String color) //색깔 변경 희망 시 자식클래스에서 오버라이딩해서 변경
	{
		System.out.println("선택 색상 : 파란색");
	}
}
class 원 extends 도형
{
	public void draw()
	{
		System.out.println("원을 그린다");
	}
}
class 삼각형 extends 도형
{
	public void draw()
	{
		System.out.println("삼각형을 그린다");
	}
}
//추상클래스는 게임쪽에서 많이 사용 - ex 아바타, 적군 비행기(비행기 종류별)
public class MainClass_클래스종류 {

	public static void main(String[] args) {
		
		도형 graph=new 사각형(); //new 추상클래스 하면 안 됨 : 미완성 클래스로 메모리 할당이 안 됨
		graph.draw(); //생성자에 맞게 메소드가 호출됨
		
		graph=new 원();
		graph.draw();
		
		graph=new 삼각형();
		graph.draw();
	}

}
