package lab14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		
		Account acc1 = new Account("Alex");
		System.out.println("=======================================");
		
		acc1.changeOpeningBalance(100);
		
		System.out.println("=======================================");
		
		try {
			acc1.withdraw(50);
		} catch (InsufficeintFundsException e) {
			try {
				log("You cannot withdraw more money than you have." + e.toString());
			} catch (IOException e1) {
				System.err.println(e1.toString());
			}
			System.err.println("You cannot withdraw more money than you have.\n" + e.toString());
		}
		
		System.out.println("=======================================");
		
		acc1.getDetails();
		
		System.out.println("=======================================");
		
		try {
			acc1.withdraw(60);
		} catch (InsufficeintFundsException e) {
			try {
				log("You cannot withdraw more money than you have." + e.toString());
			} catch (IOException e1) {
				System.err.println(e1.toString());
			}
			System.err.println("You cannot withdraw more money than you have.\n" + e.toString());
		} finally {
			System.out.println("=======================================");
			acc1.close();
		}
		
		
		System.out.println("=======================================");
	}
	
	public static void log(String message) throws IOException {
		File file = new File("log.txt");
		FileWriter fw = new FileWriter(file,true);  
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(message + "\r\n");
		bw.close();
		fw.close();
	}
}
