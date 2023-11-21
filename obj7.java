package objectPrograms; 
public class Marks 
{ 
 
   String subject1; 
   int sub1Marks; 
   String subject2; 
   int sub2Marks; 

 
   public static void main(String[] args) 
   { 

     Marks mk = new Marks(); 


     mk.subject1 = "database"; 
     mk.sub1Marks = 80; 
     mk.subject2 = "economics"; 
     mk.sub2Marks = 50; 

 
     int totalMarks = 80 + 50; 


     System.out.println("Marks in database:" +mk.sub1Marks); 
     System.out.println("Marks in economics:" +mk.sub2Marks); 
     System.out.println("Total Marks: " +totalMarks); 
    } 
 }