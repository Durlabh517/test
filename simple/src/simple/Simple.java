package simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
//		String[]array= {"a","b","c","d"};
//		
//		
//		List<String> std=new ArrayList<String>();
//		
//		for(String lang:array) {
//			std.add(lang);
//		}
//			
//	System.out.print(std);
		
		//Taking the inputs 
		Scanner scan=new Scanner(System.in);
		HashMap<Integer, Integer> mapStd=new HashMap<>();
		HashMap<Integer, Integer> position=new HashMap<>();
		System.out.println("Enter the width");
		Integer width= scan.nextInt();
		System.out.println("Enter the height");
		Integer height= scan.nextInt();
		 mapStd.put(width, height);
	    for(int id:mapStd.keySet()) {
	    	System.out.println(id+" "+mapStd.get(id));
	    }
	    System.out.println("Enter the x position");
		Integer xposition= scan.nextInt();
		System.out.println("Enter the y position");
		Integer yposition= scan.nextInt();
		position.put(xposition, yposition);
		
		
		
		

	}      }