
import java.util.*;

class DoubleLinkedList
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		LinkedList<String> ll =new LinkedList<String>();
		int choice,pos;
		int flag=0;
		System.out.println("1. INSERT	2.DELETE	3.DISPLAY	4.EXIT");
		do
		 {
			 System.out.println("ENTER YOUR CHOISE.");
			 choice =s.nextInt();
			 switch(choice)
			  {
				  case 1 : if(ll.size()==0)
				           {
				            System.out.println("ENTER THE NUMBER.");
							ll.add(s.next());
					  	   }
						   else
						   {
                            System.out.println("ENTER THE POSITION TO BE INSERTED");
                            pos=s.nextInt();
                             if(pos>ll.size())
                             {
								System.out.println("NOT POSSIBLE IN THE GIVEN POSITION");
							 }
							 else
							 {
                             System.out.println("ENTER THE NUMBER.");
							 ll.add(pos-1,s.next());
						     }
						   }
				            break;
				            
				  case 2 : if(ll.size()==0)
							System.out.println("LIST IS EMPTY.");
						   else
						   {
							  System.out.println("ENTER ELEMENT TO BE DELETED");
							  String a =s.next();
							  if(ll.contains(a))
							   {
								   ll.remove(a);
							   }
							  else
							   {
								  System.out.println("LIST DOES NOT CONTAIN THE GIVEN ELEMENT"); 
							   }  
						   }
						   break;
				
				  case 3: if(ll.size()!=0)
							 { 
								Iterator i = ll.iterator ();
								while(i.hasNext())
								 {
									  System.out.println(i.next());
								 } 
							 }
						  else
							 {
								 System.out.println("THE GIVEN LIST IS EMPTY");
							 }
							break;
							
				  case 4:	flag=1;	
				            break;
				            
				  default :    System.out.println("INVALID INPUT.");
				   		              
			  }
		 }while(flag==0); 
	}
}
