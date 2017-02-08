
public class Parser {
	
	//To Do - This method is not sustainable long term and needs to be replaced, either with a case statement or preferrably with some type of pattern recognition string parsing 
	//such as using the Pattern/Matcher classes and regex. 
	public String parseText(String command){
		String action = command.trim();
		if(action.equalsIgnoreCase("North")){
			System.out.println("Success");
			
			
		}
		else{
			System.out.println("Failed");
		}
		
		return action;
	}
}
