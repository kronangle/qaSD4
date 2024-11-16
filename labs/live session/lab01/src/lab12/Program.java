package lab12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) throws Exception {
		
		String [] courses = readCSV("src/course.txt");
		String [] trainers = readCSV("src/trainer.txt");
//		String [] lines = readCSV("src/trainerCourse.txt");
		
		for (String line : courses) {
			System.out.println(line);
		}
		System.out.println();
		
		for (String line : trainers) {
			System.out.println(line);
		}
		
		writeCSV("src/trainersAndCourses.txt", trainers);
		writeCSV("src/trainersAndCourses.txt", courses);
	}
	
	
	private static void writeCSV(String inFile, String[] data) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(inFile, true));
		
		for (String info : data) {
			bw.write(info);
			bw.newLine();
		}
		
		bw.close();
		
	}


	private static String[] readCSV(String inFile) throws IOException { 
//		ArrayList<String> contents = new ArrayList<>();
//		Create a path
//		Path path = inFile;
		
		
//		Opens file
		File file = new File(inFile);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
//		Counts lines in file
		
		
		String line;
		int lineCount = 0 ;// Files.lines(inFile).count();
		while ((line = br.readLine()) != null){
			lineCount++;
		}
		br.close();
		
//		Creates array
		String[] lines = new String[lineCount];	
		
		lineCount = 0;
		br = new BufferedReader(new FileReader(file));
		
		while ((line = br.readLine()) != null){
			lines = line.split(",");
			
			
			lineCount++;
		}
		br.close();
		
		return lines;
	}
	
	
}
