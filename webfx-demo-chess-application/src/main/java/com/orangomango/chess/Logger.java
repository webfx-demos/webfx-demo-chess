package com.orangomango.chess;

import dev.webfx.platform.console.Console;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger{
	//private static BufferedWriter writer;
	
	/*static {
		try {
			File dir = new File(System.getProperty("user.home"), ".omchess");
			if (!dir.exists()) dir.mkdir();
			File file = new File(dir, "chess.log");
			writer = new BufferedWriter(new FileWriter(file, true));
			Runtime.getRuntime().addShutdownHook(new Thread(() -> {
				try {
					writer.close();
				} catch (IOException ex){
					ex.printStackTrace();
				}
			}));
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}*/
	
	private static void write(String t, String msg){
		//SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");

//		try {
			for (String line : msg.split("\n")){
				Console.log(t + "[" + f.format(LocalDate.now()) + "]: " + line);
/*
				writer.write(t+String.format("[%s]: ", f.format(new Date()))+line);
				writer.newLine();
				writer.flush();
*/
			}
/*
		} catch (IOException ex){
			ex.printStackTrace();
		}
*/
	}
	
	public static void writeInfo(String msg){
		write("INFO", msg);
	}
	
	public static void writeError(String msg){
		write("ERROR", msg);
	}
}
