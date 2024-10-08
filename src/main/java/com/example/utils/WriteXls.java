package com.example.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.example.models.Data;

public class WriteXls {
	
	public static void writeTxt(ArrayList<Data> dataList, String path){
		
		try {
			
			FileWriter file = new FileWriter(path);
			BufferedWriter salida = new BufferedWriter(file);
			
			for (Data data : dataList) {
				
				salida.write(data.toString());
				salida.newLine();

				
			}
			
			salida.close();
			System.out.println("TXT CREADO CON EXITO");

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	

}
