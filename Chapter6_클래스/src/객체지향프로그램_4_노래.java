import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.select.Elements;

/*

 */

class Music
{
	int mno; //곡번호
	String title;
	String singer;
	String album;
	String poster; //앨범표지
	String state; //순위변동여부 (유지/상승/하락)
	int idcrement; //순위변동값
}

public class 객체지향프로그램_4_노래 {
	
	public static void main(String[] args) {
		
		Music[] music=new Music[200]; //클래스는 일반 변수처럼 배열 사용 가능함
		try {
				int k=0;
				for(int i=1; i<=4; i++)
				{
					
					Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20221107&hh=12&rtm=Y&pg="+i).get();
					
					// html 태그 -> Element
					Elements title=doc.select("tr.list a.title");
					Elements singer=doc.select("tr.list a.artist");
					Elements album=doc.select("tr.list a.albumTitle");
					Elements etc=doc.select("tr.list span.rank");
					Elements poster=doc.select("tr.list a.cover img");
					
					for(int j=0; j<title.size(); j++)
					{
						music[k]=new Music();
						music[k].mno=k+1;
						music[k].title=title.get(j).text();
						music[k].singer=singer.get(j).text();
						music[k].album=album.get(j).text();
						String s=etc.get(j).text();
						music[k].state=s.replaceAll("[^가-힣]", ""); //한글 빼고 다 지우기
						music[k].poster=poster.get(j).attr("src");
						
						System.out.println(k+1);
						System.out.println(title.get(j).text());
						System.out.println(singer.get(j).text());
						System.out.println(album.get(j).text());
						System.out.println(etc.get(j).text());
						System.out.println("--------------------");
						k++;
					}
				}
		}catch(Exception ex){}
		
		for(int i=0; i<music.length; i++)
		{
			String str="";
			if(music[i].state.equals("유지"))
				str="-";
			else if(music[i].state.equals("상승"))
				str="▲";
			else if(music[i].state.equals("하락"))
				str="▼";
			else
				str="new";
			System.out.println((i+1)+". "+str+" "+music[i].title+" "+music[i].singer+" "+music[i].album+" "+music[i].poster);
		}
		
	}

}

/*

html 참고

  <tr class="list" songid="97209570">
                                <td class="check"><input type="checkbox" class="select-check" title="POP!" /></td>
                                <td class="number">72
                                        
                                    <span class="rank">
                                        
                                            
                                            
                                            
                                            
                                                <span class="rank"><span class="rank-up">15<span
                                                        class="hide">상승</span></span></span>
                                            
                                        
                                    </span>
                                </td>
                                <td><a href="#" class="cover" onclick="fnViewAlbumLayer('82781282');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/781/282/82781282_1656034600098_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="IM NAYEON" /></a></td>
                                <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('97209570');return false;">곡 제목 정보 페이지</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('97209570','1');return false;">
                                        
                                            
                                        
                                        
                                        
                                        
                                            
                                                POP!</a>
                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('80468933');return false;">나연 (TWICE)</a>
                                        
                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('97209570');">외</button>
                                            <ul class="list" id="RelationArtist_97209570"></ul>
                                        </div>
                                        
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('82781282');return false;">IM NAYEON</a>
                                </td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-listen" title="재생" onclick="fnPlaySong('97209570;' ,'1'); return false;">듣기</a></td>
                                        <td class="btns"><a href="#" class="btn-basic btn-add" title="추가" onclick="fnPlaySong('97209570;' ,'3'); return false;">재생목록에 추가</a></td>
                                    
                                    
                                
                                <td class="btns"><button type="button" class="btn-basic btn-album" songId="97209570" id="add_my_album_97209570" onclick="fnAddMyAlbumForm('#add_my_album_97209570' , '97209570' ,10, 10);return false;">플레이리스트에 담기</button></td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-down" title="다운" onclick="fnDownSong('97209570');return false;">다운로드</a></td>
                                    
                                    
                                
                                <td class="btns">
                                    <div class="toggle-button-box lyr-mv" id="list-mv_97209570">
                                        
                                            
                                                <a href="#" class="btn btn-basic btn-mv" title="뮤비" alt="POP!" onclick="fnPlayMv('97209570','3'); return false;">뮤직비디오 보기</a>
                                            
                                            
                                        
                                    </div>
                                </td>
                                <td class="more">
                                    <div class="toggle-button-box">
                                        <button type="button" class="btn btn-basic btn-more">더보기</button>
                                        <ul class="list">
                                            
                                                
                                                    <li><a href="#" class="item" title="공유" onclick="shareDo('97209570');return false;">공유하기/음악나누기</a></li>
                                                
                                                
                                            
                                            
                                                
                                                    <li><a href="#" class="item" title="선물" onclick="fnGiftSong('97209570');return false;">선물하기</a></li>
                                                
                                                
                                            
                                        </ul>
                                    </div>
                                </td>
                            </tr>
 */
