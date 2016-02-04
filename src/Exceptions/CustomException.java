package Exceptions;

public class CustomException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1579311588384029918L;

	public static void main(String [] args){
		
		String test = "no";
		try{
			System.out.println("start try block");
			doThrow(test);
			System.out.println("ending try block");
			System.exit(0);
		}catch(Exception e){
			System.out.println("start catch block");
		}finally{
			System.out.println("finally");
		}
		System.out.println("Thanks, Goodbye");
	}
	
	static void doThrow(String test) throws Exception{
		System.out.println("start throw");
		if("yes".equals(test)){
			throw new Exception();
		}
		System.out.println("end throw");
		return;
	}
}