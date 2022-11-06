
/*---------------------------------------
★
★★
★★★
★★★★
 */
public class 반복문_중첩for4 {

	public static void main(String[] args) {

		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(j<=i)
					System.out.print("★");
			}
			System.out.println();
		}

		System.out.println();
/*---------------------------------------
★★★★
★★★
★★
★
 */

		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i<=j)
					System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();
/*---------------------------------------
A
BC
DEF
GHIJ

i j
1 1
1 

 */
		
		char c='A';
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(j<=i)
					System.out.print(c++);
			}
			System.out.println();
		}
		
		System.out.println();
/*---------------------------------------
A
AB
ABC
ABCD

i j
1 1
2 2
 */
		char c1='A';
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
					System.out.print(c1++);
			}
			System.out.println();
		}
		
		
	//
	}
}
