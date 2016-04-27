package oop_project2;

public class Team extends NFLTeam {
	
	public Team(String city, String teamName, String conference, String location) {
		
		super(city, teamName, conference, location);
	}
	
	public String getCity() { return super.getCity(); }
	public String getTeamName() { return super.getTeamName(); }
	public String getConference() { return super.getConferece(); }
	public String getLocation() { return super.getLocation(); }
	
	
	
	@Override
	public String toString()
	{
		return "The " + getCity() + " " + getTeamName() +  " from " + getConference() + " " + getLocation();
	}
}
