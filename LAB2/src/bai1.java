import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Nhap 2 so a va b bat ky:");
		float a = scaner.nextFloat(), b = scaner.nextFloat();
		float tong = a + b, hieu = a - b, tich = a*b;
		float max = a > b ? a : b; 
		System.out.println("So lon nhat trong 2 so " + a + " va " + b + " la:  " + max);  // để liên kết các từ hoặc giá trị dùng thêm dấu + ở giữa //
		System.out.println("Tong cua 2 so a va b la : " + tong);
		System.out.println( a + " + " + b +" = " + tong);
		System.out.println("Hieu cua 2 so a va b la : " + hieu);
		System.out.println( a + " - " + b +" = " + hieu);
		System.out.println("Tich cua 2 so a va b la : " + tich);
		System.out.println( a + " x " + b +" = " + tich);
		float thuong, chialaydu;
		if(b > 0) {
			thuong = a / b;
			chialaydu = a % b;
			System.out.println("Thuong cua 2 so a va b la : " + thuong);
			System.out.println( a + " / " + b +" = " + thuong);
			System.out.println("Chia lay du cua 2 so a va b la : " + chialaydu);
			System.out.println( a + " % " + b +" = " + chialaydu);
		}
		else System.out.println("Khong thoa man dieu kien phep chia : b = 0");		
	}
}
