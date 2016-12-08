package com.shafiz;
import java.util.Scanner;

public class DayFinder {
	int[] year={100,800,1500,2100,2800,3500,4200,4900,200,900,1600,2200,
			2900,3600,4300,5000,300,1000,1700,2300,3000,3700,4400,400,1100,1800,2400,
			3100,3800,4500,500,1200,2500,3200,3900,4600,600,1300,1900,2600,3300,4000,4700,
			700,1400,2000,2700,3400,4100,4800
	};
			
	int[] yearValue={5,5,5,5,5,5,5,5,4,4,4,4,4,4,4,4,3,3,3,3,3,3,3,2,2,2,2,2,2,2,
			1,1,1,1,1,1,0,0,0,0,0,0,0,6,6,6,6,6,6,6
	};
	
	String [] monthName={"JAN","LIPJAN","FEB","LIPFEB","MAR","NOV","APR","JULY","MAY",
			"JUNE","AUG","SEP","DEC"};
	int [] monthValue = {1,0,4,3,4,4,0,0,2,5,3,6,6};
	
	String[] dayName={"SUNDAY","MONDAY","TUESDAY","WEDNESSDAY","THRUSDAY","FRIDAY","SATURDAY"};
	int[] dayCrossValue={1,2,3,4,5,6,0};
	
	
	
	//creating some necessary variables
	int getYear;
	int getYearValue;
	int getDifferenceValue;
	int getDivideValue;
	int getDate;
	String getMonthName;
	int getMonthValue;
	int dayValue;
	int finalDayValue;
	String day;

	private Scanner scanner;
	
	
	void findDay(){
		System.out.println("----Hey, don't worry! I am going to find your day----\n\n");
		System.out.println("-------------Please enter the valid info-------------\n\n");
		scanner = new Scanner(System.in);
		System.out.print("Enter year : ");
		getYear=scanner.nextInt();
		
		
		for(int i=0;i<year.length;i++){
			if(getYear>year[i] && getYear<(year[i]+100)){
				getYearValue=yearValue[i];
				getDifferenceValue=getYear-year[i];
				getDivideValue=(int)(getDifferenceValue/4);
			}//ends if
		}//ends for
		
		//getting date value
		
		System.out.print("Enter date : ");
		getDate = scanner.nextInt();
		
		//getting monthName
		
		System.out.print("Enter month name : ");
		getMonthName=scanner.next();
		
		getMonthName=getMonthName.toUpperCase();
		
		for(int j=0;j<monthName.length;j++){
			if(getMonthName.equals(monthName[j])){
				getMonthValue = monthValue[j];
			}//ends if
		}//ends for
		
		
		dayValue=getYearValue+getDifferenceValue+getDivideValue+getDate+getMonthValue;
		finalDayValue=dayValue%7;
		
		
		for(int k=0;k<dayCrossValue.length;k++){
			if(finalDayValue==dayCrossValue[k]){
				day=dayName[k];
				System.out.println("Hey,genious....it's : "+day);
			}//ends if
		}//ends for
	}//ends main
}//ends class
