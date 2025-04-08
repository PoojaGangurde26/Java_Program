import java.util.Scanner;
class  Pattern12
{
	public static void P1(int n){
		int a=1;
		char c='a';
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=i;j++){
	if(i%2!=0){
		System.out.print(a++ + " ");
	}else{
		System.out.print(c++ + " ");
	}
		
		  
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
