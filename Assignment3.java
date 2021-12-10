package Day5Assignments;

import java.util.regex.*;
import java.io.*;
  
class Assignment3 {
    public static void Emails(BufferedReader br,Pattern p)
    {
    	try {
    		String line = br.readLine();
            while (line != null) {
                Matcher m = p.matcher(line);
                while (m.find()) {
     
                	System.out.println(m.group());
                }
                line = br.readLine();
            }}
            catch(Exception e){
            	System.out.println(e);
            }  
  
      }
        
	 public static void main(String[] args)
		    {
		 try {
			 Pattern p = Pattern.compile("[a-zA-Z0-9]" + "[a-zA-Z0-9_.]" + "*@[a-zA-Z0-9]" + "+([.][a-zA-Z]+)+");        
		        File file = new File("E:\\input.txt");
		        BufferedReader br= new BufferedReader(new FileReader(file));
		        Emails(br,p);
		 }
		  catch(Exception e) {
			  System.out.println(e);
		  }
		        
		    }
}
