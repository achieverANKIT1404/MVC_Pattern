package classandobj;

import java.util.Scanner;

public class StudentController {
	
	Student s[];
	Scanner sc;
	int del=0;
	
	
	public StudentController() {
		sc=new Scanner(System.in);
	}


	public void addStudent()
	{
		System.out.println();
		System.out.print("Enter Number of Students : ");
		int n=Integer.parseInt(sc.nextLine());		
		s=new Student[n];
		
		System.out.println();
		
		
		System.out.println("\t    -::Add Section::-\n");
		
		for(int i=0;i<s.length;i++)
		{	
			System.out.println();
			
			System.out.println("Student "+(i+1)+" record\n-------------------------------");
			
			System.out.print("Enter roll number : ");
			
			int roll=Integer.parseInt(sc.nextLine());
			
			System.out.println();
			
			System.out.print("Enter name : ");
			
			String name=sc.nextLine();
			
			System.out.println();
			
			System.out.print("Enter result : ");
			
			double result=Double.parseDouble(sc.nextLine());
			
			System.out.println();
			
			System.out.print("Enter address : ");
			
			String addr = sc.nextLine();
			
			System.out.println();
			
	       System.out.print("Enter city : ");
			
			String city = sc.nextLine();
			
			System.out.println();
			
	        System.out.print("Enter pincode : ");
			
			String pin = sc.nextLine();
			
			System.out.println();
			
			s[i]=new Student(roll, name, result, addr, city, pin);
		}
		System.out.println();
		System.out.println("Student record added succesfully....!\n");
		
	}
	
	public void delStudent()
	{
		String NULL = null;
		boolean flag = true;
		
		System.out.println();
		
		System.out.println("\t    -::Delete Section::-\n");
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("Enter roll number to delete record : ");
		
		int uroll = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<s.length;i++)
		{
		      if(uroll==s[i].getRoll())
		      {
		    	  flag=true;
		    	  
		    	  System.out.println();
		    	  
		    	  System.out.println("--------|Menu|---------");
		    	  System.out.println("|\t      1) Yes\t\t|");
		    	  System.out.println("|\t      2) No\t\t|");
		    	  System.out.println("----------------------------\n");
		    	  
		    	  System.out.print("Do you really wan't to delete record : ");
		    	  
		    	  int cho = Integer.parseInt(sc.nextLine());
		    	 
		    	  if(cho==1)
		    	  {
		    		  s[i].roll=0;
		    		  s[i].name=NULL;
		    		  s[i].addr=NULL;
		    		  s[i].city=NULL;
		    		  s[i].pin=NULL;
		    		  s[i].result=0;
		    		  
		    		  System.out.println();
		    		  
		    		  System.out.println("Record deleted succesfully..\n");
		    	  }
		    	  else if(cho==2)
		    	  {
		    		  flag=false;
		    		  System.out.println("Exit");  
		    	  }	    
		      }
		}
		del = s.length-1;
	}	

	public void show()
	{
        System.out.println();
		
		System.out.println("\t    -::Show Section::-\n");
		
		System.out.println("Student records..\n----------------------------------------------------------------------------");
		
		System.out.println("Roll \t Name \t    Result \t  Address\t  City\t  Pincode");
	
		System.out.println("----------------------------------------------------------------------------\n");
		
		for(int i=0;i<s.length-del;i++)
		{
			System.out.print(s[i].toString());
			
			System.out.println();
		}
		del--;
		System.out.println("-------------------------------------------------------------------------\n");
	}

	public void updateStudent() {
	    
        System.out.println();
		
		System.out.println("\t    -::Update Section::-\n");
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("Enter roll number to update record : ");
		
		int uroll=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<s.length;i++)
		{
			if(uroll==s[i].getRoll())
			{
				System.out.println();
				
				System.out.print("Enter new name : ");
				
				s[i].setName(sc.nextLine());
				
				System.out.println("Name updated succesfully..!\n");
				
				System.out.print("Enter new address : ");
				
				s[i].setAddr(sc.nextLine());
				
				System.out.println("Address updated succesfully..!\n");
				
				System.out.print("Enter new city : ");
				
				s[i].setCity(sc.nextLine());
				
				System.out.println("City updated succesfully..!\n");
				
				System.out.print("Enter new pincode : ");
				
				s[i].setPin(sc.nextLine());
				
				System.out.println("Pincode updated succesfully..!\n");
				
				System.out.print("Enter new result : ");
				
				s[i].setResult(Double.parseDouble(sc.nextLine()));
				
				System.out.println("Result updated succesfully..!\n");
			}
			else if(uroll!=s[i].getRoll())
			{
				System.out.println("Invalid roll..");
			}
		}
		
	   show();
		
	}
	
	public void searchStudent()
	{
        System.out.println();
		
		System.out.println("\t    -::Search Section::-\n");
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("Enter roll number to search record : ");
		
		int uroll = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<s.length;i++)
		{
			if(uroll==s[i].getRoll())
		   {
			System.out.println();
			
			System.out.println("----------------------------------------------------------------------------");
			
			System.out.println("Roll \t Name \t    Result \t  Address\t  City\t  Pincode\n----------------------------------------------------------------------------\n");
			
			System.out.print(s[i].getName()+"\t  "+s[i].getResult()+"\t  "+s[i].getAddr()+"\t  "+s[i].getCity()+"\t  "+s[i].getPin()+"\n");
		   }
		}
		System.out.println("----------------------------------------------------------------------------");
	}

}
