import java.util.Scanner;
class Pattern15 
{
	public static void p15(int n){
		for(int i=n;i>0;i--){
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
	p15(n);
	}
}
