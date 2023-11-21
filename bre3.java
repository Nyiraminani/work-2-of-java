public class Breakcyuzuzo2 {

   public static void main(String args[]){
	int var;
	for (var =110; var>=15; var --)
	{
	    System.out.println("var: "+var);
	    if (var==99)
	    {
	         break;
	    }
	 }
	 System.out.println("Out of for-loop");
   }
}