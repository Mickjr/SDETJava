package File;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FileI {
	
	private static Employee e;
	private static HashMap<Integer, Employee> hash;
	private static BufferedReader br;
	
	public static void main(String[] args) {
		hash = new HashMap<Integer, Employee>();
		String enoffile = null;
		
		try{
			br = new BufferedReader(new FileReader("C:\\Users\\Horton\\Documents\\Eclipse\\Week1Homework\\src\\File\\file.txt"));
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			enoffile = br.readLine();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		while(enoffile !=null){
			StringTokenizer token = new StringTokenizer(enoffile, ":");
			e = new Employee();
			e.setEmpID(Integer.valueOf(token.nextToken()));
			e.setfName(token.nextToken());
			e.setlName(token.nextToken());
			e.setRole(token.nextToken());
			
			hash.put(Integer.valueOf(e.getEmpID()), e);
			try {
				enoffile = br.readLine();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		String hashmap = hash.toString();
		System.out.println(hashmap);
		
	}

}
