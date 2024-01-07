package phonebookApp;
import java.util.*;
import java.util.regex.*;
public class mainclass
{
	static boolean validationPhno(String num)
	{
		Pattern p1=Pattern.compile("[6789]{1}[0-9]{9}");
		Matcher m1=p1.matcher(num);
		return m1.find();
	}
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   ArrayList l1=new ArrayList();
	   boolean b=true;
	   while(b)
	   {
		      System.out.println("======Welcome to phone contact book=======");
			  System.out.println("Enter the option to perform the operation !!!!!");
			  System.out.println("Press 1 for storing the contact ");
			  System.out.println("Press 2 for searcing the contact ");
			  System.out.println("Press 3 for deleting the contact ");
			  System.out.println("Press 4 to continue ");
			  System.out.println("Press 5 to exit from the app");
			  System.out.println("===========================================");
			  int n=sc.nextInt();
			  if(n==1)
			  {
				  System.out.println("Enter the name of the person: ");
				  String name=sc.next();
				  System.out.println("Enter the phone number of the person: ");
				  long number=sc.nextLong();
				  String s1=String.valueOf(number);
				  boolean f= validationPhno(s1);
				  if(f)
				  {
					  pbook p1=new pbook(name,number);
					  l1.add(p1);
					  System.out.println("The contact saved successfully !!! ");
				  }
				  else
				  {
					  System.out.println("Sorry please provide the number in the correct format ");
				  }
               }
			  else if(n==2)
			  {
				  System.out.println("Enter the name of the person: ");
				  String n1=sc.next();
				  int i=0;
				  for(Object o1:l1)
				  {
			          pbook p2=(pbook)o1;
					  if(n1.equals(p2.name))
					  {
						  i++;
						  System.out.println("Number: "+p2.number);
					  }
				  }
				  if(i==0)
				  {
					  System.out.println("Sorry the name you provided doesn't exist in my database");
				  }
				  
			  }
			  else if(n==3)
			  {
				  System.out.println("Enter the name of the person to delete the contact: ");
				  String n2=sc.next();
				  Iterator<Object> iterator =l1.iterator();
				 
				  while (iterator.hasNext())
				  {
				        pbook p3 = (pbook) iterator.next();
				        if (n2.equals(p3.name)) {
				            iterator.remove();
				            System.out.println("The contact removed successfully!!! ");
				            break;
				        }
				  } 
			  }
			  else if(n==4)
			  {
			     
			  }
			  else if(n==5)
			  {
				  b=false;
			  }
	   }
   }
}

