package com.example.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.example.models.Data;

public class ReadXls {
	
	public static ArrayList<Data> readStringToXls(String filePath){
		
		ArrayList<Data> salida = new ArrayList<>();
		
		System.out.println("GHOA");
		
		try {
			
			File archivo = new File(filePath);
			
			Workbook workbook = WorkbookFactory.create(archivo);
			
			
			for (Sheet sheet : workbook) {
				
			
				
				int contDias = 1;
				int contRow = 1;
				
				
				for (int i = 0 ; i<6;i++) {
				
				Row rowDias = sheet.getRow(0);
				Row rowActual = sheet.getRow(contRow);
				
				if (rowDias != null && rowActual != null) {
					
					do {
						
						String dia = rowDias.getCell(contDias).getStringCellValue();
						System.out.println(dia);
						DataFormatter formatter = new DataFormatter();
						String hora = formatter.formatCellValue(rowActual.getCell(0));
						System.out.println(hora);
						String asignatura = rowActual.getCell(contDias).getStringCellValue();
						System.out.println(asignatura);
						
					salida.add(new Data(hora, asignatura, dia));
					
					
					contDias = contDias + 2;
						
					} while(11 > contDias);
					
					++contRow;
					contDias = 1;
					
					}
				}
					
				}
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		return salida;
	}
	

}
