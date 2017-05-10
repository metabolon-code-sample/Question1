
public class CheckForSSN {

	// Checks to see whether a string looks like an SSN.
	public static void main(String[] args){
		if(CheckForSSN(args[0])){
			System.out.println(args[0] + " looks like a valid SSN.");
		} else {
			System.out.println(args[0] + " does NOT look like a valid SSN.");
		}
	}
	
	// Returns true if argument matches regex.
	public static boolean CheckForSSN(String sampleString){
		// This regex represents what we want an SSN to look like
		String targetRegex = "\\A\\d{3}-\\d{2}-\\d{4}\\z";
		return sampleString.matches(targetRegex);
	}
}
