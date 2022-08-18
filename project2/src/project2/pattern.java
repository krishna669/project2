/*program to print pattern by using user input
 * 1
 * 121
 * 1231
 */
package project2;
import java.util.*;//importing utility

public class pattern {
	public static void main(String []args) {

		int i, j, rows; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of raw");
		rows=sc.nextInt();
		for (i = 1; i <= rows; i++)   
		{  
			//Prints first half of the row  
			for (j = 1; j <= i; j++)   
			{   
				System.out.print(j+" ");   
			}  
			//Prints second half of the row   
			for (j = i-1; j >= 1; j--)  
			{  
				System.out.print(j+" ");  
			}  
			System.out.println();  

		}

	}  
}  