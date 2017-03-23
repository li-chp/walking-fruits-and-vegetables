/**
 * @(#)IOTest.java 2017年2月27日
 * Copyright 2017 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:li-chp@neusoft.com"> li-chp </a>
 * @version $Revision 1.0.0 $ 2017年2月27日 上午11:25:21
 */
public class IOTest {
	
	public static void printWriter() {
		try {
			String s = "测试！";
			File file = new File("D:/1.txt");
			PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file))) ;
			pw.write(s);
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@SuppressWarnings("resource")
	public static void fileInputStream() {
		try {
			File file = new File("D:/1.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
//		printWriter();
		fileInputStream();
	}
	
}
