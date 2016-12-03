package com.psl.main;

import java.sql.Timestamp;
import java.util.Date;




public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt =new Date();
		
		long timep=dt.getTime();
		
		Date dt2=new Date(timep);
		System.out.println(dt+"    "+dt2);
		System.out.println(" dt After Dt2 "+dt.after(dt2));
		System.out.println(" dt before Dt2 "+dt.before(dt2));
		System.out.println(" dt compare Dt2 "+dt.compareTo(dt2));
		System.out.println(" dt TimeStamp  "+dt.getTime());
		
		long Changetime=(dt.getTime()+250000);
		dt.setTime(Changetime);
		System.out.println(dt);
		
	}

}
