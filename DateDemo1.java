package com.cts.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo1 {
	public static  void main(String []args)
	{
		//LocalDate date=LocalDate.now();
		//System.out.println("todays date"+date); 
		
		
	//	LocalDate date=LocalDate.now();
	//	int day=date.getDayOfMonth();
	//	int month=date.getMonthValue();
	//	int year=date.getYear();
		
	//	System.out.println("Year : %d , Month : %d , Day : %d \t %n",year,month,day);

		
	//	LocalDate birthday=LocalDate.of(1998,01,03);
	//	System.out.println("birthday is"+birthday);

		
//		LocalDate date=LocalDate.now();
//       LocalDate birthday=LocalDate.of(2020,01,14);
//       System.out.println("birthday"+);
       
       
  //     if(date.equals(birthday))
//    	   System.out.println("todays date and birthday are same");
//       else
//    	   System.out.println("both are different");
//       {
    	
        LocalTime current=LocalTime.now();
		LocalTime newTime=current.plusHours(2);
		System.out.println("New  time is :"+newTime);
       
       
       
       
       
       
       }
	
	}
	
	
