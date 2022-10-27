/*

jsoup 다운 받고 연결시키기

프로젝트 우클릭-빌드패스-컨피겨 빌드패스, 라이브러리탭, 클래스패스, 애드 익스터널 자, jsoup파일 클릭

 */


import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 반복문_while3 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
		System.out.println("=====MENU======");
		System.out.println("1. 로그인"); //String
		System.out.println("2. 회원가입"); //IO
		System.out.println("3. 영화목록"); // try~catch, Jsoup
		System.out.println("4. 영화상세정보");
		System.out.println("5. 영화예매");
		System.out.println("6. 종료");
		System.out.println("===============");
		System.out.println("메뉴를 선택해주세요!");
		
		int menu=scan.nextInt();
			switch(menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("프로그램을 종료합니다!");
				System.exit(0);
			default:
				System.out.println("존재하지 않는 메뉴입니다! (404)");
			}
		}
		}
	
		//https://movie.daum.net/ranking/reservation
		//영화 목록 출력 기능
		

		
		static void movieList()
		{
			 
			 try
			 {
				 Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
				 Elements title=doc.select("strong.tit_item a.link_text");
				 Elements reserve=doc.select("span.info_txt span.txt_num");
				 for(int i=0; i<title.size(); i++)
				 {
					 System.out.println((i+1)+"."+title.get(i).text()+"("+reserve.get(i).text()+")");
				 }
			 }catch(Exception e){} 
		}
	
		
	//--
}



