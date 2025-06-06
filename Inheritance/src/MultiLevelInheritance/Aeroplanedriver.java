package MultiLevelInheritance;

public class Aeroplanedriver {
 public static void main(String[] args) {
Sukhoi s1=new Sukhoi("Sukhoi", 12345678.8, 2, 2000, 1200, 2, 3400, 23400, 4,
		3,3000, "Multi role", "Ait to Air", "Suko30 MKI", 12,
		"28 OFAB 250Kg Bombs. 32 0FaB" , "India", "Flying" );

s1.DisplayAeroplane();
System.out.println("_______________________________________");

s1.displayFighterPlane();
System.out.println("_______________________________________");

s1.dispalySukhoi();


}
}
