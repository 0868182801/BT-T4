import java.util.Scanner;

public class bai2 {
public static void main(String[] args) {
	System.out.println("Nhap 1 so nguyen bat ky: ");
	Scanner scaner = new Scanner(System.in);
	int a = scaner.nextInt();
	if( a%2 == 0 )
		System.out.println("So nguyen vua nhap la so chan" );
	else System.out.println("So nguyen vua nhap la so le");	
}
}
