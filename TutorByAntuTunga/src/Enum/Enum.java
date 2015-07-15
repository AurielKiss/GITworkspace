package Enum;

public enum Enum {
	Petras("toks","10"),
	Jonas("vat","15"),
	Jurgis("gal","58"),
	Mykolas("gi","2"),
	Antaniuks("nzn","77"),
	Gytis("gg","1");
	
	private final String desc;
	private final String year;
	
	Enum(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
	

}
