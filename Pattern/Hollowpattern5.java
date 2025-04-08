import java.util.Scanner;
class  Hollowpattern5
{
	public static void P22(int n){
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
				if(i==1||i==j||j==n){
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
		P22(n);
	}
}
