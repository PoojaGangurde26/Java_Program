import java.util.Scanner;
class  Hollowpattern13 
{
public static void p29(int n){
int ed=7;
int od=1;
for(int i=1;i<=n;i++){
System.out.print(i+" ");
int temp=1;
for(int j=2;j<=n;j++){
	if(j%2==0){
		temp+=ed;
        System.out.print(temp+" ");
	}else{
		temp+=od;
System.out.print(temp+" ");
	}
}
System.out.println();
ed-=2;
od+=2;
	
}
	
}
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
          p29(n);

	}
}