package oop_project2;

public abstract class NFLTeam {
	
	private final String city;
	protected final String teamName;
	private final String conference;
	private final String location;
	
	NFLTeam() {
		teamName = "";
		city = "";
		conference = "";
		location = "";
	}
	
	//Constructor
	public NFLTeam(String city, String teamName, String conference, String division)
	{
		this.teamName = teamName;
		this.city = city;
		this.conference = conference;
		this.location = division;
	}
	
	//Getters
	public String getCity() { return city; }
	public String getTeamName() { return teamName; }
	public String getConferece() { return conference; }
	public String getLocation() { return location; }
	
	@Override
	public String toString()
	{
		return "Team Name: " + teamName + "Location " + city + 
				" Conference: " + conference + "Division: " + location;
	}
}
