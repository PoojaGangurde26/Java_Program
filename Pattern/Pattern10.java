import java.util.Scanner;
class  Pattern10
{
	public static void P1(int n){
		int a=2;
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=i;j++){
		System.out.print(a + " ");
		 a+=2;
		   
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
