package com.dlq.ntil;

public class TransCode {
	
	
	public String transGB_ISO(String str)
	{
		try{		
			str=new String(str.getBytes("GB2312"),"ISO-8859-1");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return  str;
	}
	
	public String transISO_GB(String str)
	{
		try{		
			str=new String(str.getBytes("ISO-8859-1"),"UTF8");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return  str;
		
	}

}
