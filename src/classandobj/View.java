package classandobj;

import java.util.Scanner;

public class View {

	public View() {

		boolean lp=true;
		Scanner sc=new Scanner(System.in);
		StudentController sco=new StudentController();
		while(lp)
		{
		//System.out.println("menu\n1.add\n2.update\n3.delete\n4.show\n5.search\n0.exit");
		System.out.println("-------------|Menu|-------------");
		System.out.println("|\t   1) Add record\t\t     |");
		System.out.println("|\t   2) Udate record\t     |");
		System.out.println("|\t   3) Delete record\t     |");
		System.out.println("|\t   4) Show record\t     |");
		System.out.println("|\t   5) Search record\t     |");
		System.out.println("|\t   0) Exit\t\t\t\t     |");
		System.out.println("-------------------------------------");
		
		System.out.print("Enter your choice : ");
		int c=Integer.parseInt(sc.nextLine());
		
		switch (c) {
		case 1:
			sco.addStudent();
			break;
		case 2:
		    sco.updateStudent();
			break;
		case 3:
		    sco.delStudent();
			break;
		case 4:
			sco.show();
			break;
		case 5:
		    sco.searchStudent();
			break;
		case 0:
			lp=false;
			System.out.println("THANK YOU FOR USING OUR SYSTEM");
			break;

		default:
			System.out.println("Wrong input!");
			break;
		}
		}
		
	}
	
	

}
