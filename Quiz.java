import java.util.Scanner;
import questions.JavaQuestions;

class Quiz{
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] agrs){
		System.out.println("----------JAVA QUIZ----------\n\n");

		//taking name
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

		/* -------here take the input for which language test you want to give-------*/
		
		int count=0,setOfQuestions;

		do{
		//choosing number of questions
			if(count==0){	
				System.out.println("how many set of questions do you want to give(10 , 20 or 30)?");
				setOfQuestions = input.nextInt();
				count++;
			}
			else{
				System.out.println("set of questions can be either 10 or 20 or 30.Enter againn");
				setOfQuestions = input.nextInt();
			}	
	    }while(setOfQuestions!=10&&setOfQuestions!=20&&setOfQuestions!=30);

			//initialize test
			JavaTest test = new JavaTest(name,setOfQuestions);
			//start test
			test.start();
			//test result         
			test.result();
			
			/*--------here take the initialize the another language test like I did in java-----*/
	}
}
