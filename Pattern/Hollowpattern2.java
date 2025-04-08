import java.util.Scanner;
class Hollowpattern2 
{
	public static void p19(int n){
		for(int i=n;i>0;i--){
			for(int j=1;j<=n;j++){
				if(i==1||j==i||j==n){
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
		p19(n);
	}
}
