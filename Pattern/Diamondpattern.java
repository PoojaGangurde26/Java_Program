class patt
{
	   public static void Diamond(int n) {
        // st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int str = 1; str <= 2 * (i - 1) + 1; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
	public static void main(String arg[]){
		int n=4;
		
	}
}