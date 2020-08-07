import java.lang.*;
import java.util.*;
class TimeTable
{
	public String q,w;
	Scanner s=new Scanner(System.in);
	public void timetable()
	{	
			System.out.println("ENTER SOURCE");
			q=s.next();
			System.out.println("ENTER DESTINATION");
			w=s.next();
			if(w.equals("ahmedabad"))
			{
				System.out.println("BUSSES ARE AVAILABLE FROM\t"+q+"\tTO\t"+w+"\t");
				System.out.println("BUS NO-:"+"\t DEPARTURE TIME\n");
				System.out.println("67"+"\t 10:47 AM\n");
				System.out.println("56"+"\t 12:47 PM\n");
				System.out.println("65"+"\t 1:47 PM\n");
				System.out.println("46"+"\t 2:47 PM\n");
				System.out.println("90"+"\t 7:54 PM\n");
				System.out.println("12"+"\t 9:47 PM\n");
				System.out.println("56"+"\t 12:47 AM\n");
			}
			else if(w.equals("pune"))
			{
				System.out.println("BUSSES ARE AVAILABLE FROM\t"+q+"\tTO\t"+w+"\t");
				System.out.println("BUS NO-:"+"\t DEPARTURE TIME\n");
				System.out.println("67"+"\t 10:47 AM\n");
				System.out.println("56"+"\t 12:47 PM\n");
				System.out.println("65"+"\t 1:47 PM\n");
				System.out.println("46"+"\t 2:47 PM\n");
				System.out.println("90"+"\t 7:54 PM\n");
				System.out.println("12"+"\t 9:47 PM\n");
				System.out.println("56"+"\t 12:47 AM\n");
			}
			else if(w.equals("nashik"))
			{
				System.out.println("BUSSES ARE AVAILABLE FROM\t"+q+"\tTO\t"+w+"\t");
				System.out.println("BUS NO-:"+"\t DEPARTURE TIME\n");
				System.out.println("67"+"\t 10:47 AM\n");
				System.out.println("56"+"\t 12:47 PM\n");
				System.out.println("65"+"\t 1:47 PM\n");
				System.out.println("46"+"\t 2:47 PM\n");
				System.out.println("90"+"\t 7:54 PM\n");
				System.out.println("12"+"\t 9:47 PM\n");
				System.out.println("56"+"\t 12:47 AM\n");
			}
			else if(w.equals("mumbai"))
			{
				System.out.println("BUSSES ARE AVAILABLE FROM\t"+q+"\tTO\t"+w+"\t");
				System.out.println("BUS NO-:"+"\t DEPARTURE TIME\n");
				System.out.println("67"+"\t 10:47 AM\n");
				System.out.println("56"+"\t 12:47 PM\n");
				System.out.println("65"+"\t 1:47 PM\n");
				System.out.println("46"+"\t 2:47 PM\n");
				System.out.println("90"+"\t 7:54 PM\n");
				System.out.println("12"+"\t 9:47 PM\n");
				System.out.println("56"+"\t 12:47 AM\n");
			}
			else
			{
				System.out.println("NO BUSSES ARE AVAILABE FROM"+q+"TO"+w);
			}
	}
}
class BookTick extends TimeTable
{public String n,so,des;
public int age,bso,soi;
		public void BookTicket()
		{
			System.out.println("ENTER YOUR NAME");
			n=s.next();
			System.out.println("ENTER YOUR AGE");
			age=s.nextInt();
			System.out.println("ENTER SOURCE");
			so=s.next();
			System.out.println("ENTER DESTINATION");
			des=s.next();
			System.out.println("BUSSES ARE AVAILABLE FROM\t"+so+"\tTO\t"+des);
			if(des.equals("ahmedabad"))
			{
				System.out.println("BUSSES ARE AVAILABLE FROM MUMBAI TO AHMEDABAD\n");
				System.out.println("BUS NO-:"+"\t DEPARTURE TIME\n");
				System.out.println("67"+"\t 10:47 AM\n");
				System.out.println("56"+"\t 12:47 PM\n");
				System.out.println("65"+"\t 1:47 PM\n");
				System.out.println("46"+"\t 2:47 PM\n");
				System.out.println("90"+"\t 7:54 PM\n");
				System.out.println("12"+"\t 9:47 PM\n");
				System.out.println("56"+"\t 12:47 AM\n");
			}
			else if(des.equals("pune"))
			{
				System.out.println("BUSSES ARE AVAILABLE FROM MUMBAI TO PUNE\n");
				System.out.println("BUS NO-:"+"\t DEPARTURE TIME\n");
				System.out.println("67"+"\t 10:47 AM\n");
				System.out.println("56"+"\t 12:47 PM\n");
				System.out.println("65"+"\t 1:47 PM\n");
				System.out.println("46"+"\t 2:47 PM\n");
				System.out.println("90"+"\t 7:54 PM\n");
				System.out.println("12"+"\t 9:47 PM\n");
				System.out.println("56"+"\t 12:47 AM\n");
			}
			else if(des.equals("nashik"))
			{
				System.out.println("BUSSES ARE AVAILABLE FROM MUMBAI TO NASHIK\n");
				System.out.println("BUS NO-:"+"\t DEPARTURE TIME\n");
				System.out.println("67"+"\t 10:47 AM\n");
				System.out.println("56"+"\t 12:47 PM\n");
				System.out.println("65"+"\t 1:47 PM\n");
				System.out.println("46"+"\t 2:47 PM\n");
				System.out.println("90"+"\t 7:54 PM\n");
				System.out.println("12"+"\t 9:47 PM\n");
				System.out.println("56"+"\t 12:47 AM\n");
			}
			else if(des.equals("mumbai"))
			{
				System.out.println("BUSSES ARE AVAILABLE FROM MUMBAI TO NASHIK\n");
				System.out.println("BUS NO-:"+"\t DEPARTURE TIME\n");
				System.out.println("67"+"\t 10:47 AM\n");
				System.out.println("56"+"\t 12:47 PM\n");
				System.out.println("65"+"\t 1:47 PM\n");
				System.out.println("46"+"\t 2:47 PM\n");
				System.out.println("90"+"\t 7:54 PM\n");
				System.out.println("12"+"\t 9:47 PM\n");
				System.out.println("56"+"\t 12:47 AM\n");
			}
			else
			{
				System.out.println("NO BUSSES ARE AVAILABE FROM"+so+"TO\t"+des);
			}
			System.out.println("ENTER THE BUS NO FROM ABOVE BUS TIMETABLE");
			bso=s.nextInt();
				if(bso==67||bso==56||bso==65||bso==46||bso==90||bso==12||bso==46)
				{
				System.out.println("SEATS ARE AVAILABLE SO ENTER YOUR SEAT NO TO BOOK BUS");
				soi=s.nextInt();
				if(soi<=31)
				{
					System.out.println("CONGRATULATIONS YOUR BUS NO\t"+bso+"IS BOOKED AT SEAT NO\t"+soi);
				}	
				else
				{
					System.out.println("Only 31 Seats Are Available");
				}
				}
				else
				{
					System.out.println("ENTER CORRRECT BUS NO TO BOOK");
				}
	}
}
class Cncl extends BookTick
{public static int cncl;String ty="2:47";
				void showbook()
				{
					System.out.println("SHOWING THE BOOKED TICKET DETAILS OF THE CUSTOMER................\n\n\n");
					System.out.println("NAME OF THE CUSTOMER IS-:"+n+"\n"+"AGE IS-:"+age+"\n"+"SOURCE-:"+so+"\n"+"DESTINATION-:"+des);
					System.out.println("DEPARTURE TIME-:"+ty+"\n"+"BUS NO-:"+bso+"\n"+"SEAT NO IS-:"+soi);
					System.out.println("HAPPY JOURNEY!!!");
				}	
	void Cancel()
				{
					System.out.println("ENTER BUS NO TO CANCEL THE BUS TICKET");
					cncl=s.nextInt();
					if(n==null&&age==0&&so==null&&des==null&&bso==0&&soi==0&&ty==null)
					{
						System.out.println("No Tickets has been booked");
					}
					if(cncl==bso)
					{
						System.out.println("YOUR TICKET IS CANCELLED SUCCESSFULLY YOUR MONEY WILL BE REFUNDED WITHIN 24 HOURS");
						n=null;age=0;so=null;des=null;bso=0;soi=0;ty=null;
					}
					else
					{
						System.out.println("THE BUS NO YOU HAVE ENTERED IS NOT BOOKED");
					}
				}
	void exit12()
	{
		System.exit(0);
	}
}
class Bus
{
	public static void main(String args[])
	{String qpp;
	Scanner p=new Scanner(System.in);
		Cncl c;
		c=new Cncl();
		int a;
		do{
		System.out.println("--------------------------------------------------------------------------------\n");
		System.out.println("\t\t\tWELCOME TO BUS MANAGEMENT SYSTEM\n");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("ENTER A CHOICE FROM\n1.ENTER 1 TO SEE THE TIMETABLE OF BUSSES\n2.ENTER 2 TO BOOK A BUS\n3.ENTER 3 TO SEE THE DETAILS OF BOOKED BUS TICKET\n4.ENTER 4 TO CANCEL THE BOOKED TICKET\n5.ENTER 5 TO EXIT FROM PROGRAM");
		a=p.nextInt();
		switch(a)
		{
			case 1:
			c.timetable();
			break;
			case 2:
			c.BookTicket();
			break;
			case 3:
			c.showbook();
			break;
			case 4:
			c.Cancel();
			break;
			case 5:
			c.exit12();
			default:
			System.out.println("ENTER CORRECT CHOICE");
		}
		System.out.println("ENTER YES TO CONTINUE");
		qpp=p.next();
	}while(qpp.equals("YES"));
	}
}