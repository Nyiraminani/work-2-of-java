public class ContinueExample {

   public static void main(String args[]){
	for (int j=1; j<=10; j++)
	{
           if (j==10)
           {
	      continue;
	   }

           System.out.print(j+" ");
	}
   }
}