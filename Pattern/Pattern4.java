import java.util.Scanner;
class  Pattern4
{
	public static void P1(int n){
		for(int i=n;i>=0;i--){
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		P1(n);
	}
}
