import java.io.*;
import java.util.Scanner;
class Quiz{
        public static void main(String args[])
               
        {
	System.out.println("welcome to quiz");
                  int  total=5;
                  int obtained=0;
                  float percentage;
	System.out.println("1].Who invented Java Programming?\n 1. Guido van Rossum\n 2. James Gosling\n 3. Dennis Ritchie\n 4. Bjarne Stroustrup");
                  int num1;
                  System.out.println("enter your option:");
                  Scanner s1 = new Scanner(System.in);
                  num1=s1.nextInt();
                  if(num1==2)
                 {
                         System.out.println("the answer is correct");  
                         obtained+=1  ;       
                 }
                  else
                 {
	        System.out.println("the answer is wrong \n the correct answer is option2. James Gosling");
                          obtained+=0;
                 } 
         

                 System.out.println("\n2].Which one ofthe following is not a Java feature?\n 1. Object-oriented\n 2. Use of pointers\n 3. Portable\n 4. Dynamic and Extensible");
                 int num2;
                 
                 System.out.println("enter your option:");
                 Scanner s2 = new Scanner(System.in);
                  num2=s2.nextInt();
                  if(num2==2)
                 {
                         System.out.println("the answer is correct"); 
                          obtained+=1;          
                 }
                  else
                 {
	        System.out.println("the answer is wrong \n the correct answer is option2. Use of pointers");
                         obtained+=0;
                 } 





                 System.out.println("\n3]What is the extension of java code files?\n  1.  .js\n 2.  .txt\n 3.  .class\n 4. .java.");
                 int num3;
                 
                 System.out.println("enter your option:");
                 Scanner s3 = new Scanner(System.in);
                  num3=s3.nextInt();
                  if(num3==4)
                 {
                         System.out.println("the answer is correct");
                          obtained+=1;
             
                 }
                  else
                 {
	        System.out.println("the answer is wrong \n the correct answer is option4. .java");
                         obtained+=0;
                 } 
               

                 System.out.println("\n4].Which environment variable is used to set the java path?\n 1. MAVEN_Path\n 2. javaPATH\n 3. JAVA\n 4. JAVA_HOME");
                 int num4;
                 
                 System.out.println("enter your option:");
                 Scanner s4 = new Scanner(System.in);
                  num4=s4.nextInt();
                  if(num4==4)
                 {
                         System.out.println("the answer is correct");
                         obtained+=1;           
                 }
                  else
                 {
	        System.out.println("the answer is wrong \n the correct answer is option4. JAVA_HOME");
                          obtained+=0;
                 } 

	System.out.println("\n5]Which of the following is not an OOPs concept in Java?\n  1. Polymorphism\n 2. Inheritance\n 3. Compilation\n 4. Encapsulation");
                  int num5;
                  System.out.println("enter your option:");
                  Scanner s5 = new Scanner(System.in);
                  num5=s5.nextInt();
                  if(num5==3)
                 {
                         System.out.println("the answer is correct");  
                         obtained+=1;         
                 }
                  else
                 {
	        System.out.println("the answer is wrong \n the correct answer is option3. Compilation");
                          obtained+=0;
                 }                  
                 System.out.println("you scored\t"+obtained+"\tout of\t"+total);
                 percentage = (obtained/total)*100;
                 System.out.println("your percentage is: "+percentage);
                 
                 
}
}
                  
