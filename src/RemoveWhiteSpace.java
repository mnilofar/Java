package StringCleanup;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// Remove white spaces in a string
	    String str = "Jave is a cool program";
	    String strg = str.replaceAll("\\s","");
	    System.out.println(strg);
	   
	}

}
