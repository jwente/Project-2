package oop_project2;

public abstract class NFLRoster {
	
	private String num;
	private String LName;
	private String FName;
	private String pos;
	private String city;
	private String teamName;
	private String conference;
	private String location;
	
	NFLRoster()
	{
		num = "10";
		LName = "Last Name";
		FName = "First Name";
		pos = "Position";
		city = "City";
		teamName = "Team Name";
		conference = "Conference";
		location = "Location";
	}
	
	//Constructor
	NFLRoster(String num, String LName, String FName, String pos, 
			String city, String teamName, String conference, String location)
	{
		this.num = num;
		this.LName = LName;
		this.FName = FName;
		this.pos = pos;
		this.city = city;
		this.teamName = teamName;
		this.conference = conference;
		this.location = location;
	}
	
	//Getters
	public String getNum() { return num; } 
	public String getLName() { return LName; }
	public String getFName() { return FName; }
	public String getPos() { return pos; }
	public String getCity() { return city; }
	public String getTeamName() { return teamName; }
	public String getConference() { return conference; }
	public String getLocation() { return location; }
	
	public String toString()
	{
		return city +" "+ teamName +" "+ num +" "+ LName +" "+ FName +" "+ pos;  
	}
	
	
}
