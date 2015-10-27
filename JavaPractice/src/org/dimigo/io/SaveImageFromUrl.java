/**
 * 
 */
package org.dimigo.io;

import java.io.*;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * 		|_ SaveImageFromUrl
 * 
 * 1. 개요 :		
 * 2. 작성일 :		2015. 10. 22.
 * </pre>
 * 
 * @author :		이찬희
 * @version:		1.0
 *
 */
public class SaveImageFromUrl {
	public static void main(String[] args) {
		String imgUrl = "https://static.dimigo.in/img/logobeta.png";
		try {
			URL url = new URL(imgUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/microsoft.png");
			
			int result;
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
			System.out.println("finished!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
