package tutorialWithTim;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Quizz!!");
		System.out.print("Do you want to play ? ");
		
		//String answer ="";
		String playing = input.next();			
		
		if((playing.toLowerCase()).equals("yes")) {
			System.out.println("Let play :)");
		}else System.exit(0);
		System.out.println();
		
		int count = 0;
		
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("What is CPU in full? ");
	        try {
	            String answer = reader.readLine();
	            if (answer.equalsIgnoreCase("central processing unit")) {
	                System.out.println("You are correct");
	                count+=1;
	            } else {
	                System.out.println("You are incorrect");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        //Question 2
	        
	        System.out.print("What is RAM in full? ");
	        try {
	            String answer = reader.readLine();
	            if (answer.equalsIgnoreCase("random access memory")) {
	                System.out.println("You are correct");
	                count = count+1;
	            } else {
	                System.out.println("You are incorrect");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	      //Question 3
	        System.out.print("What is ROM in full? ");
	        try {
	            String answer = reader.readLine();
	            if (answer.equalsIgnoreCase("read only memory")) {
	                System.out.println("You are correct");
	                count = count+1;
	            } else {
	                System.out.println("You are incorrect");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
	        System.out.println("You have scored "+((count/3.0)*100)+" %");
	        
	    }
		
	}



