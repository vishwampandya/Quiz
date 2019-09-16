import questions.JavaQuestions; //my library
import java.util.*; 
import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.Method;

class JavaTest{
	String name;
	int marks,maxQuestions;

	//to initialize name
	JavaTest(String name,int maxQuestions){
		this();
		this.name = name;
		this.maxQuestions = maxQuestions;
	}

	//to give instructions
	JavaTest(){
		System.out.println("_________________Instructions_________________");
		System.out.println("# Enter only a , b , c , d for answer choice.");					
		System.out.println("# There is no time limit.");	
		System.out.println("# Each questions carries one marks.");
		System.out.println("# There is no negative marking.");
		System.out.println("______________________________________________\n");
		
	}

	//starting test
	void start(){
		JavaQuestions javaQ = new JavaQuestions();
		
		
		Method method ;
		int max=50;     //number of questions that I have in my pacakge.
		//int max=2 ;//for now
		int min=1,count=0;
		int random;
		boolean answer;
		
		

		//without repeatations calling random methods from JavaQuestions package
		ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i=min; i<=max; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            for (int i=1; i<=maxQuestions; i++) {
                random = (list.get(i));
                

                try{
                	System.out.print(i+") ");//to print question number
                	method= JavaQuestions.class.getDeclaredMethod("q"+random);
        			 Object value = method.invoke(javaQ);//taken value as object as method.invoke(javaQ) is object type
        			 answer = (boolean)value;  
        			if(answer){
        				count++; //to calucate marks
        			}
				
        		}
        		catch(Exception e){
					System.out.println("exception occured\n"+e);
				}	
            }
            this.marks=count;
            
	}
	//getting result 
	void result(){
		System.out.println(name+" your score is : "+marks+" out of "+maxQuestions);
	}

}

