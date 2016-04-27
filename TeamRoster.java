package oop_project2;

public class TeamRoster extends NFLRoster {
	
	public TeamRoster(String num, String LName, String FName,String pos, String city, 
			String teamName, String conference, String location)
	{
		super(num, LName, FName, pos, city, teamName, conference, location);
	}
	
	public String getNum() { return super.getNum(); }
	public String getLName() { return super.getLName(); }
	public String getFName() { return super.getFName(); }
	public String getPos() { return super.getPos(); }
	public String getCity() { return super.getCity(); }
	public String getTeamName() { return super.getTeamName(); }
	public String getConference() { return super.getConference(); }
	public String getLocation() { return super.getLocation(); }
	
	@Override
	public String toString()
	{
		return (super.getPos() +" for the "+ super.getCity() +" "+ super.getTeamName() 
		+" number "+ super.getNum() +", "+ super.getFName() +" "+ super.getLName());
	}

}
