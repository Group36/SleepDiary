package com.GC01.FileManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFileIntoArrayList {

	public static ArrayList<String> GeorgesFileReader(String location){
		ArrayList<String>theArrayListObject;
		theArrayListObject=new ArrayList();
			try{
			BufferedReader in = new BufferedReader(new FileReader(location)); 
			String Figures = in.readLine(); 
			in.close();
			String[] firstConversion=Figures.split(",");
			for(int i =0;i<firstConversion.length;i++){
				theArrayListObject.add(firstConversion[i]);}
			
			return theArrayListObject;
			}
			
			catch (Exception e) {
				e.printStackTrace();
			
			return theArrayListObject;}
}
}
