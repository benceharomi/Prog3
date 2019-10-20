import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : FileLogger.java
//  @ Date : 19/10/2019
//  @ Author : 
//
//




public class FileLogger extends Observer {
	private PrintWriter pw;
	public FileLogger(String fileName) throws FileNotFoundException {
		FileOutputStream fo = new FileOutputStream(fileName);
		pw = new PrintWriter(fo);
	}
	
	public FileLogger(Observable observable) {
		pw.println(observable);
		pw.flush();
	}
	
	public void finalize() {
		pw.close();
	}
}
