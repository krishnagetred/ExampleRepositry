package Basicjava;

import java.util.Scanner;

public class Takeinput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = s.next();
		System.out.println("enter your address");
		String address = s.next();
		System.out.println("enter your gender");
		char gender = s.next().charAt(0);
		System.out.println("enter your phone no");
		long phoneno = s.nextLong();
		System.out.println("eneter you age ");
		int age = s.nextInt();
		
		System.out.println("_______________________________________");
		System.out.println("name :" + name);
		System.out.println("address :" + address);
		System.out.println("gender:" + gender);
		System.out.println("phone no:" +phoneno);
		System.out.println("age:" + age);
		

}
}