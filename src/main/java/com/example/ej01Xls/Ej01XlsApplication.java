package com.example.ej01Xls;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.models.Data;
import com.example.utils.ReadXls;
import com.example.utils.WriteXls;

@SpringBootApplication
public class Ej01XlsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ej01XlsApplication.class, args);
		
		
		String path = "src/main/resources/static/horario.xls";
		String pathtxt = "src/main/resources/static/salida.txt";
		
		ReadXls lector = new ReadXls();
		WriteXls writeXls = new WriteXls();
		
		writeXls.writeTxt(lector.readStringToXls(path), pathtxt);
		
		
		
		
		
		
	}

}
