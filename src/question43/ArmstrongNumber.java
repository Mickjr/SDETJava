package question43;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[]){

        int input,store,output=0,modolus;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number for checking.");
        input=in.nextInt();
        store=input;
        while(input != 0){
        modolus=input%10;
        output=output+(modolus*modolus*modolus);
        input=input/10;
        }
        System.out.println(output);

                if(store == output){

                    System.out.println("This is an armstrong number.");
        } else{

            System.out.println("This is not an armstrong number.");
        }
        in.close();
    }

}

