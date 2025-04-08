import java.util.Scanner;
class  Hollowpattern3
{
	public static void P20(int n){
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n;j++){
				if(j==1||i==n||i==j){
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
		P20(n);
	}
}
