import java.util.Scanner;

public class 제어문_반복문5 {

	public static void main(String[] args) throws Exception{
	//아래와 같이 exe 프로그램 열려면 throws Exception를 꼭 해줘야 함
		
		Scanner scan=new Scanner(System.in);
		for(;;) {
			System.out.println("[1. 메모장 / 2. 그림판 / 3. 브라우저 / 4. 종료] 중 하나(번호)를 입력해주세요:"
					+ "");
			int no=scan.nextInt();
			
			if(no<1 || no>4) {
				System.out.println("1~4 중 메뉴 하나를 선택해주세요");
				continue;
			}
			
			switch(no) {
			case 1:
				//exe 프로그램 불러오기
				Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
				break;
			case 2:
				Runtime.getRuntime().exec("C:\\Windows\\System32");
				break;
			case 3:
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다~!");
				System.exit(0); //0(정상종료), -1(비정상 종료)
			}
			
		}
		
		
		
	}
}
