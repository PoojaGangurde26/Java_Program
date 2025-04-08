import java.util.Scanner;
class  Hollowpattern6 
{
	public static void p23(int n){
		for(int i=n;i>0;i--){
			for(int j=1;j<=n;j++){
				if(j==i||j==n){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==i||j==n){
					System.out.print("*");
				}else{
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
		p23(n);
	}
}
