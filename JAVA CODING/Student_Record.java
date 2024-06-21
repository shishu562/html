package Java_Program;
import java.util.Scanner;

class Student{
    String name;
    String enroll;
    float per;
    char grade;
    
    void acceptData(){
    Scanner sk=new Scanner(System.in);
    System.out.println("Enter Name : ");
    name=sk.nextLine();
    System.out.println("Enter Enrollment No : ");
    enroll=sk.nextLine();
    System.out.println("Enter Grade :");
    grade=sk.next().charAt(0);
    System.out.println("Enter Percentage :" );
    per=sk.nextFloat();
    
    }
    void showData(){
    System.out.println("Name : " +name);
    System.out.println("Enrollment No :" +enroll);
    System.out.println("Percentage : " +per);
    System.out.println("Grade : " +grade);
    
    }
    
    public static void main(String args[]){
    Student s=new Student();
    s.acceptData();
    s.showData();
    }
    }