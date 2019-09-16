package questions;
import java.util.Scanner;
import java.lang.reflect.Method;

/*---want options to be also shown randomly along with random questions---*/


	
//main class of package
public class JavaQuestions{
	public static Scanner input = new Scanner(System.in);
	public static char ans;

   //answer checking
	private static boolean check(char right_ans , int question_number) throws MyException{
			
			
		boolean answer;

			while(ans!='a'&&ans!='b'&&ans!='c'&&ans!='d'){
				System.out.printf("\n********answer choice can be only a , b, c or d.********\n");
				Method method ;
				JavaQuestions javaQ = new JavaQuestions();
				try{			
					System.out.println("*************************ANSWER AGAIN*******************");
					System.out.print("->");
					method= JavaQuestions.class.getDeclaredMethod("q"+question_number);
        				Object value = method.invoke(javaQ);
					answer = (boolean)value;
					return answer;
			
				}
				catch(Exception e){
					System.out.println("exception occured\n"+e);	
					return false;			
				}
				 
			}

			
			if(ans==right_ans){
				System.out.println("Correct answer : "+right_ans);
				System.out.println("");
				return true;
			}
			else{
				System.out.println("Correct answer : "+right_ans);
				System.out.println("");
				return false;
			}
			
			

			
		
	}
    //question 1
	public boolean q1(){
		System.out.println("When does Exceptions in Java arises in code sequence?");
		System.out.println("A. Run Time");
		System.out.println("B. Compilation Time");
		System.out.println("C. Can Occur Any Time");
		System.out.println("D. None of the mentioned");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=1;
		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 2
	public boolean q2(){
		System.out.println("Which of these keywords is not a part of exception handling?");
		System.out.println("A. try");
		System.out.println("B. finally");
		System.out.println("C. thrown");
		System.out.println("D. catch");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=2;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 3
	public boolean q3(){
		System.out.println("Which of these keywords must be used to monitor for exceptions?");
		System.out.println("A. try");
		System.out.println("B. finally");
		System.out.println("C. throw");
		System.out.println("D. catch");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=3;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 4
	public boolean q4(){
		System.out.println("Which of these keywords must be used to handle the exception thrown by try block in some rational manner?");
		System.out.println("A. try");
		System.out.println("B. finally");
		System.out.println("C. throw");
		System.out.println("D. catch");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=4;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 5
	public boolean q5(){
		System.out.println("Which of these keywords is used to manually throw an exception?");
		System.out.println("A. try");
		System.out.println("B. finally");
		System.out.println("C. throw");
		System.out.println("D. catch");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=5;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 6
	public boolean q6(){
		System.out.println("Which of these is a super class of all exceptional type classes?");
		System.out.println("A. String");
		System.out.println("B. RuntimeExceptions");
		System.out.println("C. Throwable");
		System.out.println("D. Cachable");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=6;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 7
	public boolean q7(){
		System.out.println("Which of these class is related to all the exceptions that can be caught by using catch?");
		System.out.println("A. Error");
		System.out.println("B. Exception");
		System.out.println("C. RuntimeExecption");
		System.out.println("D. All of the mentioned");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=7;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 8
	public boolean q8(){
		System.out.println("Which of these class is related to all the exceptions that cannot be caught?");
		System.out.println("A. Error");
		System.out.println("B. Exception");
		System.out.println("C. RuntimeExecption");
		System.out.println("D. All of the mentioned");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=8;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 9
	public boolean q9(){
		System.out.println("Which of these handles the exception when no catch is used?");
		System.out.println("A. Default handler");
		System.out.println("B. finally");
		System.out.println("C. throw handler");
		System.out.println("D. Java run time system");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=9;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 10
	public boolean q10(){
		System.out.println("Which of these keywords is used to manually throw an exception?");
		System.out.println("A. try");
		System.out.println("B. finally");
		System.out.println("C. throw");
		System.out.println("D. catch");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=10;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 11
	public boolean q11(){
		System.out.println("Which of these keywords is used to generate an exception explicitly?");
		System.out.println("A. try");
		System.out.println("B. finally");
		System.out.println("C. throw");
		System.out.println("D. catch");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=11;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 12
	public boolean q12(){
		System.out.println(" Which of these class is related to all the exceptions that are explicitly thrown?");
		System.out.println("A. Error");
		System.out.println("B. Exception");
		System.out.println("C. Throwable");
		System.out.println("D. Throw");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=12;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 13
	public boolean q13(){
		System.out.println("Which of these operator is used to generate an instance of an exception than can be thrown by using throw?");
		System.out.println("A. new");
		System.out.println("B. malloc");
		System.out.println("C. alloc");
		System.out.println("D. thrown");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=13;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 14
	public boolean q14(){
		System.out.println("Which of these handles the exception when no catch is used?");
		System.out.println("A. Default handler");
		System.out.println("B. finally");
		System.out.println("C. throw handler");
		System.out.println("D. Java run time system");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=14;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 15
	public boolean q15(){
		System.out.println("Which of these keywords is used to by the calling function to guard against the exception that is thrown by called function?");
		System.out.println("A. try");
		System.out.println("B. throw");
		System.out.println("C. throws");
		System.out.println("D. catch");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=1;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 16
	public boolean q16(){
		System.out.println(" Which of these keywords is used to define packages in Java??");
		System.out.println("A. pkg");
		System.out.println("B. Pkg");
		System.out.println("C. package");
		System.out.println("D. Package");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=16;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 17
	public boolean q17(){
		System.out.println("Which of these is a mechanism for naming and visibility control of a class and its content?");
		System.out.println("A. Object");
		System.out.println("B. Packages");
		System.out.println("C. Interfaces");
		System.out.println("D. None of the Mentioned.");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=17;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 18
	public boolean q18(){
		System.out.println("Which of this access specifies can be used for a class so that its members can be accessed by a different class in the same package?");
		System.out.println("A. Public");
		System.out.println("B. Protected");
		System.out.println("C. No Modifier");
		System.out.println("D. All of the mentioned");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=18;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 19
	public boolean q19(){
		System.out.println("Which of these access specifiers can be used for a class so that it’s members can be accessed by a different class in the different package?");
		System.out.println("A. Public");
		System.out.println("B. Protected");
		System.out.println("C. Private");
		System.out.println("D. No Modifier");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=19;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 20
	public boolean q20(){
		System.out.println("Which of the following is correct way of importing an entire package ‘pkg’?");
		System.out.println("A. import pkg.");
		System.out.println("B. import pkg.*");
		System.out.println("C. Import pkg.");
		System.out.println("D. Import pkg.*");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=20;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 21
	public boolean q21(){
		System.out.println("Which of the following is incorrect statement about packages?");
		System.out.println("A. Package defines a namespace in which classes are stored.");
		System.out.println("B. A package can contain other package within it.");
		System.out.println("C. Java uses file system directories to store packages.");
		System.out.println("D. A package can be renamed without renaming the directory in which the classes are stored.");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=21;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 22
	public boolean q22(){
		System.out.println("Which of the following package stores all the standard java classes?");
		System.out.println("A. lang");
		System.out.println("B. java");
		System.out.println("C. util");
		System.out.println("D. java.packages");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=22;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 23
	public boolean q23(){
		System.out.println(" Which of these keywords is used to define interfaces in Java?");
		System.out.println("A. interface");
		System.out.println("B. Interface");
		System.out.println("C. intf");
		System.out.println("D. Intf");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=23;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 24
	public boolean q24(){
		System.out.println("Which of these can be used to fully abstract a class from its implementation?");
		System.out.println("A. Objects");
		System.out.println("B. Packages");
		System.out.println("C. Interfaces");
		System.out.println("D. None of the Mentioned.");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=24;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 25
	public boolean q25(){
		System.out.println("Which of the following is the correct way of compiling a class?");
		System.out.println("A. java Welcome.java");
		System.out.println("B. javac Welcome.java");
		System.out.println("C. javac Welcom");
		System.out.println("D. java Welcome");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=25;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 1
	public boolean q26(){
		System.out.println("Which of these access specifiers can be used for an interface?");
		System.out.println("A. Public");
		System.out.println("B. Protected");
		System.out.println("C. private");
		System.out.println("D. All of the mentioned");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=26;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 27
	public boolean q27(){
		System.out.println("Which of these keywords is used by a class to use an interface defined previously?");
		System.out.println("A. import");
		System.out.println("B. Import");
		System.out.println("C. implements");
		System.out.println("D. Implements");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=27;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 28
	public boolean q28(){
		System.out.println("Which of the following is correct way of implementing an interface salary by class manager?");
		System.out.println("A. class manager extends salary {}");
		System.out.println("B. class manager implements salary {}");
		System.out.println("C. class manager imports salary {}");
		System.out.println("D. None of the mentioned.");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=28;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 29
	public boolean q29(){
		System.out.println("Which of the following is incorrect statement about packages?");
		System.out.println("A. Interfaces specifies what class must do but not how it does.");
		System.out.println("B. Interfaces are specified public if they are to be accessed by any code in the program.");
		System.out.println("C. All variables in interface are implicitly final and static.");
		System.out.println("D. All variables are static and methods are public if interface is defined public.");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=29;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 30
	public boolean q30(){
		System.out.println("Which of these packages contain all the collection classes?");
		System.out.println("A. java.lang");
		System.out.println("B. java.util");
		System.out.println("C. java.net");
		System.out.println("D. java.awt");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=30;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 31
	public boolean q31(){
		System.out.println("Which of these classes is not part of Java’s collection framework?");
		System.out.println("A. Maps");
		System.out.println("B. Array");
		System.out.println("C. Stack");
		System.out.println("D. Queue");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=31;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 32
	public boolean q32(){
		System.out.println("Which of these interface is not a part of Java’s collection framework?");
		System.out.println("A. List");
		System.out.println("B. Set");
		System.out.println("C. SortedMap");
		System.out.println("D. SortedList");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=32;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 33
	public boolean q33(){
		System.out.println("Which of these methods deletes all the elements from invoking collection?");
		System.out.println("A. clear()");
		System.out.println("B. reset()");
		System.out.println("C. delete()");
		System.out.println("D. refresh()");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=33;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 34
	public boolean q34(){
		System.out.println("What is Collection in Java?");
		System.out.println("A. A group of objects");
		System.out.println("B. A group of classes");
		System.out.println("C. A group of interfaces");
		System.out.println("D. None of the mentioned");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=34;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 35
	public boolean q35(){
		System.out.println("Which of these interface declares core method that all collections will have?");
		System.out.println("A. set");
		System.out.println("B. EventListner");
		System.out.println("C. Comparator");
		System.out.println("D. Collection");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=35;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 36
	public boolean q36(){
		System.out.println("Which of these interface handle sequences?");
		System.out.println("A. Set");
		System.out.println("B. List");
		System.out.println("C. Comparator");
		System.out.println("D. Collection");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=36;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 37
	public boolean q37(){
		System.out.println("Which of these interface is not a part of Java’s collection framework?");
		System.out.println("A. List");
		System.out.println("B. Set");
		System.out.println("C. SortedMap");
		System.out.println("D. SortedList");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=37;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 38
	public boolean q38(){
		System.out.println("Which of these interface must contain a unique element?");
		System.out.println("A. Set");
		System.out.println("B. List");
		System.out.println("C. Array");
		System.out.println("D. Collection");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='a';
		int question_number=38;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 39
	public boolean q39(){
		System.out.println("Which of these is Basic interface that all other interface inherits?");
		System.out.println("A. Set");
		System.out.println("B. Array");
		System.out.println("C. List");
		System.out.println("D. Collection");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=39;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 40
	public boolean q40(){
		System.out.println("Which of these is an incorrect form of using method max() to obtain maximum element?");
		System.out.println("A. max(Collection c)");
		System.out.println("B. max(Collection c, Comparator comp)");
		System.out.println("C. max(Comparator comp)");
		System.out.println("D. max(List c)");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=40;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 41
	public boolean q41(){
		System.out.println("Which of these methods sets every element of a List to a specified object?");
		System.out.println("A. set()");
		System.out.println("B. fill()");
		System.out.println("C. Complete()");
		System.out.println("D. add()");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=41;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 42
	public boolean q42(){
		System.out.println("Which of these methods can randomize all elements in a list?");
		System.out.println("A. rand()");
		System.out.println("B. randomize()");
		System.out.println("C. shuffle()");
		System.out.println("D. ambigous()");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=42;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 43
	public boolean q43(){
		System.out.println("Which of these methods can convert an object into a List?");
		System.out.println("A. SetList()");
		System.out.println("B. ConvertList()");
		System.out.println("C. singletonList()");
		System.out.println("D. CopyList()");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=43;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 44
	public boolean q44(){
		System.out.println("Which of these is true about unmodifiableCollection() method?");
		System.out.println("A. unmodifiableCollection() returns a collection that cannot be modified.");
		System.out.println("B. unmodifiableCollection() method is available only for List and Set.");
		System.out.println("C. unmodifiableCollection() is defined in Collection class.");
		System.out.println("D. None of the mentioned");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=44;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 45
	public boolean q45(){
		System.out.println("Which of these is static variable defined in Collections?");
		System.out.println("A. EMPTY_SET");
		System.out.println("B. EMPTY_LIST");
		System.out.println("C. EMPTY_MAP");
		System.out.println("D. All of the mentioned");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='d';
		int question_number=45;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 46
	public boolean q46(){
		System.out.println("Which of these method can be used to make the main thread to be executed last among all the threads?");
		System.out.println("A. stop()");
		System.out.println("B. sleep()");
		System.out.println("C. join()");
		System.out.println("D. call()");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=46;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 47
	public boolean q47(){
		System.out.println("Which of these method is used to find out that a thread is still running or not?");
		System.out.println("A. run()");
		System.out.println("B. Alive()");
		System.out.println("C. isAlive()");
		System.out.println("D. checkRun()");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=47;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 48
	public boolean q48(){
		System.out.println("What is the default value of priority variable MIN_PRIORITY AND MAX_PRIORITY?");
		System.out.println("A. 0 & 256");
		System.out.println("B. 0 & 1");
		System.out.println("C. 1 & 10");
		System.out.println("D. 1 & 256");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=48;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 49
	public boolean q49(){
		System.out.println("Which of these method is used to explicitly set the priority of a thread?");
		System.out.println("A. set()");
		System.out.println("B. make()");
		System.out.println("C. setPriority()");
		System.out.println("D. makePriority()");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='c';
		int question_number=49;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}

	//question 50
	public boolean q50(){
		System.out.println("Which of these method is used to implement Runnable interface?");
		System.out.println("A. stop()");
		System.out.println("B. run()");
		System.out.println("C. runThread()");
		System.out.println("D. stopThread()");
		//taking input answer and making it lower
		ans = input.next().charAt(0);
		ans = Character.toLowerCase(ans);

		//right_ans
		char right_ans='b';
		int question_number=50;

		//checking
		try{
			return JavaQuestions.check(right_ans,question_number);
		}	
		catch(MyException ex){
			System.out.println(ex.getMessage());
			return false;
		}		
		catch(Exception e){
			System.out.println("your input was not valid");
			return false;
		}
	}
}	
