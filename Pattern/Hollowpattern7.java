import java.util.Scanner;
class  Hollowpattern7
{
	public static void p24(int n){
	
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
			if(j==1||i==1||i==j){
					System.out.print("* ");
			}else{
				System.out.print(" ");
			}
			}
			System.out.println();
			
		}
		
		
			for(int i=n-1;i>0;i--){
			for(int j=1;j<=i;j++){
		if(j==1||i==1||i==j){
					System.out.print("* ");
			}
			else{
				System.out.print(" ");
			}
			}
			System.out.println();
			
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		p24(n);
	}
}
