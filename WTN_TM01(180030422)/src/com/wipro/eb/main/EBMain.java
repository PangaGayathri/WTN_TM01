package com.wipro.eb.main;
import java.util.*;
import com.wipro.eb.service.ConnectionService;

public class EBMain {
	public static void main(String args[]) {
		ConnectionService cs=new ConnectionService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Previous month reading: ");
		int a=sc.nextInt();
		System.out.println("Current month reading: ");
		int b=sc.nextInt();
		System.out.println("Connection Type ");
		String s=sc.next();
		System.out.println(cs.generateBill(a,b,s));
		sc.close();
	}
}