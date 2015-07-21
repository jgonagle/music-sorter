import java.io.*;

public class MusicSorter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File dir1 = new File(".");
		
		//get root path
		String path = dir1.getCanonicalPath();
		
		//root directory
		File dir = new File(path);
		
		//make directories
		for (char a='A'; a<='Z'; a++) {
			new File(Character.toString(a)).mkdir();
		}
		new File("#").mkdir();
		
		//list subfiles
		String[] children = dir.list();
		if (children == null){
		}
		else {
			for (int i=0; i<children.length; i++) {
	            String filename = children[i];
	            if (filename.length() == 1) {
	            }
	            else {
	            	if (Character.isUpperCase(filename.charAt(0))) {
	            		(new File (filename)).renameTo
	            		(new File(Character.toString(filename.charAt(0)), filename));
	            	}
	            	else {
	            		(new File (filename)).renameTo
	            		(new File("#", filename));
	            	}
	            }
	        }
	    }
	}				
}
