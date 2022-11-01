import java.util.Arrays;

public class 배열_3_로또 {

	public static void main(String[] args) {
		
		int[] lotto=new int[6];
		for(int i=0; i<lotto.length; i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;	
			
			//중복값 제외하기
			for(int j=0; j<i; j++) // j<i : 맨처음 난수는 제외시키기
			{
				if(lotto[i]==lotto[j])
				{
					i--; //저장하지 않는다
					break; //다시 1차 for문
				}
			}
			
		}
		System.out.println(Arrays.toString(lotto));
		
	
		
	//	
	}

}
