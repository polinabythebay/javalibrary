import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import au.com.bytecode.opencsv.CSVReader;


/*
 * @author: psoshnin
 * @date created: August 1, 2013
 * @date modified: August 1, 2013
 * @purpose: use CSV reader/writer, make use of char delimiters 
 */

public class CSVReadWrite {

  
	public void loadCSV(String strFileName, char delimiter) {
  	  
        try {
       	 CSVReader reader = new CSVReader(new FileReader(strFileName), delimiter );
       	 List<String[]> csvEntries = reader.readAll();
       	 Iterator<String[]> Iter = csvEntries.iterator();

       	 while ( Iter.hasNext()) {
       		 String [] strArray = Iter.next();
             
       		 //conveniently access your all of your attributes in each line here
       		 //Is helpful to put a try block here if you need to make sure
       		 //your char delimiter is correct
       		 String exampleString1= strArray[0];

       		 //process CSV here
       	 }
       	 reader.close();
        }
        catch ( FileNotFoundException fnfe )
        {
       	 System.err.println("File Not Found Exception");
        }
        catch ( IOException ioe )
        {
       	 System.err.println("IO Exception");
        }
     }
	
}
