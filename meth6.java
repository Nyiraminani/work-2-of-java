public class InstanceMethodExample  
{  
public static void main(String [] args)  
{ 
InstanceMethodExample obj = new InstanceMethodExample();  
  
System.out.println("The sum is: "+obj.add(100, 50));  
}  
int s;  
 
public int add(int a, int b)  
{  
s = a+b;  
 
return s;  
}  
}