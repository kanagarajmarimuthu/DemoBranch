package com.Selenium.Advance;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadCSVFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	
		String dataCol=getReadCSVFileValue("C:\\Users\\poorani\\workspace\\sampleProject\\LoginData1.csv",0,"Name");
		System.out.println("OutPut:"+dataCol);
		
		
	    }
	
	
	public static String getReadCSVFileValue(String path,int rowNum,String colName){
		
		HashMap<String,String> runtimeData=null;  
		 
		 List< HashMap<String,String>> listMap=new ArrayList();
		
		try {
	            Reader reader = Files.newBufferedReader(Paths.get(path));
	            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
	        
	            for (CSVRecord csvColName : csvParser) {
	                // Accessing Values by Column Index
	            	
	            	 for (CSVRecord csvNextRowValue : csvParser) {
	            	
			            	runtimeData=new HashMap<String,String>();   
			            	for(int i=0;i<csvColName.size();i++){
			            		
			            		String colNames=csvColName.get(i);
			            		String colRowValues=csvNextRowValue.get(i);
			            		
			            		runtimeData.put(colNames, colRowValues);
			            		
			            	}
			            	
			            	listMap.add(runtimeData);
	            	 }
	            }
	        }
		catch(Exception er){
			
		}
	
		
		
		return listMap.get(rowNum).get(colName);
		
	}

}
