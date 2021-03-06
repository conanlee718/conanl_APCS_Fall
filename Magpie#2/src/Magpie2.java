public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */

	public static String getResponse( String statement) {

		String response = "";
		
		
			
		if (statement.indexOf("no") >= 0) {
			response = "Why are so negative? :[";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0 ){
			response = "Tell me more about your family.";
		} else if (statement.indexOf("brother") >=0){
			response= "Oh I have a brother too! What is his name?";
		} else if (statement.indexOf("Dreyer") >= 0 
				|| statement.indexOf("Peel") >= 0
				|| statement.indexOf("Michot") >= 0
				|| statement.indexOf("Williams") >= 0
				|| statement.indexOf("Louie") >= 0
				|| statement.indexOf("Dwyer") >= 0 ){
			response= "Wow, you are so lucky you have such a good teacher at Mills!";
		} else if (statement.indexOf("Phillips") >= 0){
			response="Did you know that Mr. Phillips is supposed to be retired?";
		} else if (statement.trim().length()<1) {
			response= "Say something, please.";
		} else {
			response = getRandomResponse();
		}
		return response;
		}

		
	


	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private static String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "Oh, I see.";			
		} else if (whichResponse == 5) {
			response = "I don't get what you mean. Mind explaining again?";
		}

		return response;
	}
}


