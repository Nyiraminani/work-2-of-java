package objectPrograms; 
public class Rectangle 
{ 
   int length; 
   int breadth; 

 
   void perValue(int l, int b)
   { 

 
      length = l; 
      breadth = b; 
   } 
  void calculate()
  { 
    int perimeter = 2 * (length + breadth); 
    System.out.println("Perimeter of rectangle: " +perimeter); 
  } 
 public static void main(String[] args)
 {

    Rectangle rt = new Rectangle();


    rt.perValue(20, 30); 

 
   rt.calculate();


    Rectangle rt2 = new Rectangle(); 
     rt2.perValue(50, 50); 
     rt2.calculate(); 
   } 
 }