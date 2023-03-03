import java.util.Scanner;

public class bai3 {
public static void main(String[] args) {
	Scanner scaner = new Scanner(System.in);
	int tuoi;
	System.out.println("Nhap ten : ");
	String ten = scaner.nextLine();
	System.out.println("Nhap nam sinh : ");
	int namsinh = scaner.nextInt();
	System.out.println("Nhap nam hien tai : ");
	int namnay = scaner.nextInt();
	if(namnay < namsinh) 
		System.out.println("Du lieu ban nhap khong thoa man");
	else {
		tuoi = namnay - namsinh;
		if( tuoi < 16) System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
		else if ( tuoi >= 18) System.out.println("Ban " + ten + " da gia");
		else System.out.println("Ban " + ten + " o do tuoi truong thanh");
	}
}
}
