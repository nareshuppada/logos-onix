package logos.vision.onixprocess;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.jonix.Jonix;
import org.jonix.JonixPackages;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String onixFolderReferences = "C:\\Users\\nareshu\\workspace\\onixprocess\\src\\resources\\sample\\references";
    	String onixFolderShort = "C:\\Users\\nareshu\\workspace\\onixprocess\\src\\resources\\sample\\short";
    	
    	JonixPackages onixVersionReference = JonixPackages.v21_Reference;
    	JonixPackages onixVersionShort = JonixPackages.v21_Short;
    	
    	PrintStream outFile = null;
		try {
			outFile = new PrintStream("C:\\Users\\nareshu\\workspace\\onixprocess\\src\\resources\\output\\MyOnixAsTable.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	Jonix.createBasicTabDelimitedExporter(outFile, null).scanFolder(onixVersionReference, onixFolderReferences, ".xml");
    	Jonix.createBasicTabDelimitedExporter(outFile, null).scanFolder(onixVersionShort, onixFolderShort, ".xml");

    }
}
