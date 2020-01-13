package com.cts.activity.main;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

public class NioOperations {
	@SuppressWarnings("unused")
	public static void main(String srgs[]) throws IOException
	{
		FileSystem fs= FileSystems.getDefault();
		
		
		Path pa=fs.getPath("C:\\Users\\Lenovo\\Desktop\\abhi\\abhigna\\data");
		
		//System.out.println("name count:"+path.getNameCount());
		//System.out.println("is absolute:"+path.isAbsolute());
		//System.out.println("name on index 2:"+path.getName(2));
		
		
		//FileAttribute<?> data = null;
		 Files.createDirectory(pa);
		//Path dir = Files.createTempDirectory("my-dir");
        //Path fileToCreatePath = dir.resolve("C:\\Users\\Lenovo\\Desktop\\abhi\\abhigna\\data");
       
		 
		
		
	}

}
