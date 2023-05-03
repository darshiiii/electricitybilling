import java.util.Scanner;
import java.io.*;

class bill
{

	double bill_amt,ccode,present_reading,previous_reading,comsumption_unit,category,type,rate,phase,FPPPA,Total_Energy_Without_GovtDuty,govt_duty,Net_bill_amt;
	String name;
	Scanner sc=new Scanner(System.in);
	
	void input()
	{
		
		
		System.out.println("Enter Name of Customer :");
		name=sc.next();

		System.out.println("Enter customer id :");
		ccode=sc.nextDouble();
		
		System.out.println("Enter Present reading : ");
		present_reading=sc.nextDouble();
		
	
		
		System.out.println("Enter Previous reading : ");
		previous_reading=sc.nextDouble();
		
		
		System.out.println("\n1.RGP\n2.GLP\n3.BPL\n4.Non-RGP \n\n Enter your Category : ");
		
		category=sc.nextDouble();
		
		
		
		System.out.println("\n1.Single phase\n2.Three phase \n\nEnter Your phase : ");
		phase=sc.nextDouble();
		
		
		
		
		System.out.println("\n1.Residential\n2.Commercial\n3.Indutrial\n4.Religious\n5.Hostel\n\n Enter your Type : ");
		type=sc.nextDouble();
		
	}
	
	void calculate()
	{
		comsumption_unit=present_reading-previous_reading;
		
		
		if(category==1)
		{
			if(phase==1)
			{
				if(comsumption_unit<=50)
				{
					
					bill_amt=(comsumption_unit*3.2)+25;
					
					
				}
				else if(comsumption_unit>50 && comsumption_unit<=200)
				{
					
					bill_amt=(comsumption_unit*3.95)+25;
					
				}
				else
				{
					
					bill_amt=(comsumption_unit*5)+25;
					
					
				}
			}
			else if(phase==2)
			{
				if(comsumption_unit<=50)
				{
					
					bill_amt=(comsumption_unit*3.2)+65;
					
					
				}
				else if(comsumption_unit>50 && comsumption_unit<=200)
				{
					
					bill_amt=(comsumption_unit*3.95)+65;
					
				}
				else
				{
					
					bill_amt=(comsumption_unit*5)+65;
					
				}
			}
		}
		else if(category==2)
		{
			if(phase==1)
			{
				if(comsumption_unit<=200)
				{
					
					bill_amt=(comsumption_unit*4.1)+30;
					
				}
				else
				{
					bill_amt=(comsumption_unit*4.8)+30;
					
				}
			}
			else if(phase==2)
			{
				if(comsumption_unit<=200)
				{
					
					bill_amt=(comsumption_unit*4.1)+70;
					
				}
				else
				{
					
					bill_amt=(comsumption_unit*4.8)+70;
					
				}
			}
		}
		
		else if(category==3)
		{
			if(comsumption_unit<=50)
			{
				
				
				bill_amt=(comsumption_unit*1.5)+5;
				
			}
			else if(comsumption_unit>50 && comsumption_unit<=200)
			{
				bill_amt=(comsumption_unit*3.95)+5;
				
			}
			else
			{
				
				bill_amt=(comsumption_unit*5)+5;
				
			}
		}
		
		
		FPPPA=bill_amt*0.261;
		int Fixed_ch=280;
	
	
	
		Total_Energy_Without_GovtDuty=bill_amt+FPPPA+Fixed_ch;
		
		if(type==1)
		{
			
			govt_duty=Total_Energy_Without_GovtDuty*0.15;
			
		}
		else if(type==2)
		{
			
			govt_duty=Total_Energy_Without_GovtDuty*0.20;
		}
		else if(type==3)
		{
			govt_duty=Total_Energy_Without_GovtDuty*0.10;
		}
		else if(type==4)
		{
			
			govt_duty=Total_Energy_Without_GovtDuty*0.15;
		}
		else if(type==5)
		{
			
			govt_duty=Total_Energy_Without_GovtDuty*0.1125;
		}
		
		
		Net_bill_amt=Total_Energy_Without_GovtDuty+govt_duty;
	}
	
	void display()
	{
		try
		{
			
			FileWriter file=new FileWriter("electricitybill.txt");
			BufferedWriter buff=new BufferedWriter(file);
			
			
			
		
		
	
		System.out.println("______________________________________________________________________");
		
		System.out.println("Customer Name  is : "+name);
		buff.write("______________________________________________________________________");
		buff.newLine();
		buff.write("Customer Name = "+name);
		buff.newLine();
		
		
		System.out.println("______________________________________________________________________");
		
		System.out.println("Customer Id is : "+ccode);
		buff.write("______________________________________________________________________");
		buff.newLine();
		buff.write("CUstomer ID = "+ccode);
		buff.newLine();
		
		System.out.println("______________________________________________________________________");
		
		System.out.println("Comsumption unit is : "+comsumption_unit);
		buff.write("______________________________________________________________________");
		buff.newLine();
		buff.write("Comsumption unit is = "+comsumption_unit);
		buff.newLine();
		
		System.out.println("______________________________________________________________________");
		
		if(category==1)
		{
			if(phase==1)
			{
				if(comsumption_unit<=50)
				{
					System.out.println("Category=RGP");
					System.out.println("Single Phase");
					System.out.println("rate=3.2");
					System.out.println("Monthy Fixed Charges = 25.00");
					
					
					
				}
				else if(comsumption_unit>50 && comsumption_unit<=200)
				{
					System.out.println("Category=RGP");
					System.out.println("Single Phase");
					System.out.println("rate=3.95");
					System.out.println("Monthy Fixed Charges = 25.00");
				
					
				}
				else
				{
					System.out.println("Category=RGP");
					System.out.println("Single Phase");
					System.out.println("rate=5.00");
					System.out.println("Monthy Fixed Charges = 25.00");
					
					
					
				}
			}
			else if(phase==2)
			{
				if(comsumption_unit<=50)
				{
					System.out.println("Category=RGP");
					System.out.println("Three Phase");
					System.out.println("rate=3.20");
					System.out.println("Monthy Fixed Charges = 65.00");
					
					
					
				}
				else if(comsumption_unit>50 && comsumption_unit<=200)
				{
					System.out.println("Category=RGP");
					System.out.println("Three Phase");
					System.out.println("rate=3.95");
					System.out.println("Monthy Fixed Charges = 65.00");
				
					
				}
				else
				{
					System.out.println("Category=RGP");
					System.out.println("Three Phase");
					System.out.println("rate=5.00");
					System.out.println("Monthy Fixed Charges = 65.00");
					
					
				}
			}
		}
		else if(category==2)
		{
			if(phase==1)
			{
				if(comsumption_unit<=200)
				{
					System.out.println("Category=GLP");
					System.out.println("Single Phase");
					System.out.println("rate=4.10");
					System.out.println("Monthy Fixed Charges = 30.00");
					
					
				}
				else
				{
					System.out.println("Category=GLP");
					System.out.println("Single Phase");
					System.out.println("rate=4.80");
					System.out.println("Monthy Fixed Charges = 30.00");
					
					
				}
			}
			else if(phase==2)
			{
				if(comsumption_unit<=200)
				{
					System.out.println("Category=GLP");
					System.out.println("Three Phase");
					System.out.println("rate=4.10");
					System.out.println("Monthy Fixed Charges = 70.00");
					
					
				}
				else
				{
					System.out.println("Category=GLP");
					System.out.println("Three Phase");
					System.out.println("rate=4.80");
					System.out.println("Monthy Fixed Charges = 70.00");
					
					
				}
			}
		}
		
		else if(category==3)
		{
			if(comsumption_unit<=50)
			{
				
				System.out.println("Category=BPL");
				System.out.println("No Phase");
				System.out.println("rate=1.50");
				System.out.println("Monthy Fixed Charges = 5.00");
			
				
			}
			else if(comsumption_unit>50 && comsumption_unit<=200)
			{
				System.out.println("Category=BPL");
				System.out.println("No Phase");
				System.out.println("rate=3.95");
				System.out.println("Monthy Fixed Charges = 5.00");
				
			}
			else
			{
				System.out.println("Category=BPL");
				System.out.println("No Phase");
				System.out.println("rate=5.00");
				System.out.println("Monthy Fixed Charges = 5.00");
				
			}
		}
		
		
		
		System.out.println("Bill Amount is : "+bill_amt);
		buff.write("______________________________________________________________________");
		buff.newLine();
		buff.write("Bill Amount is = "+bill_amt);
		buff.newLine();
		
		
		System.out.println("______________________________________________________________________");
		
		System.out.println("FPPPA(Fuel and power purchase price Adjustment) is : "+FPPPA);
		buff.write("______________________________________________________________________");
		buff.newLine();
		buff.write("FPPPA(Fuel and power purchase price Adjustment) is = "+FPPPA);
		buff.newLine();
		
		
		System.out.println("______________________________________________________________________");
		
		
		System.out.println("Total Energy Without Govt Duty is : "+Total_Energy_Without_GovtDuty);
		buff.write("______________________________________________________________________");
		buff.newLine();
		buff.write("Total Energy Without Govt Duty is = "+Total_Energy_Without_GovtDuty);
		buff.newLine();
		
		System.out.println("______________________________________________________________________");
		
		
		if(type==1)
		{
			System.out.println("Govn. Duty is 15% in Residential And Approved Institution");
			
			
		}
		else if(type==2)
		{
			System.out.println("Govn. Duty is 20% in Commercial");
			
		}
		else if(type==3)
		{
			System.out.println("Govn. Duty is 10% in Industrial");
			
		}
		else if(type==4)
		{
			System.out.println("Govn. Duty is 15% in Religious Place");
			
		}
		else if(type==5)
		{
			System.out.println("Govn. Duty is 11.25% in Hostel");
			
		}
		
		
		System.out.println("Government Duty  is : "+govt_duty);
		buff.write("______________________________________________________________________");
		buff.newLine();
		buff.write("Government Duty  is = "+govt_duty);
		buff.newLine();
		
		
		System.out.println("______________________________________________________________________");
		
		System.out.println("Net Bill Amount is : "+Net_bill_amt);
		buff.write("______________________________________________________________________");
		buff.newLine();
		buff.write("Net Bill Amount is = "+Net_bill_amt);
		buff.newLine();
		buff.write("______________________________________________________________________");
		
		System.out.println("______________________________________________________________________");
		buff.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
	}
}	
	
	public class bill_main
	{
		public static void main(String args[]) 
		{
			
		bill obj=new bill();
		obj.input();
		obj.calculate();
		obj.display();
		
		}
	}