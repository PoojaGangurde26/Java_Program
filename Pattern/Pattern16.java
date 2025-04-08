import java.util.Scanner;
class Pattern16 
{
	public static void p16(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=1;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		p16(n);
	}
}
