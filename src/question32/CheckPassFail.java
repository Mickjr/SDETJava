package question32;

public class CheckPassFail {

	public static void main(String[] args) {
		
		int marks = 51;
		String grade;
		
		if(marks>= 50){
			grade = "PASS";
		}
		else{
			grade ="FAIL";
		}
		System.out.println("Grade " + grade);
	}

}
