package testp2;

public class Sport {
	
	private String sportType;

	public Sport(String sportType)
	{
		this.sportType = sportType;
	}
	
	public void setSportType(String sportType) { this.sportType = sportType; }
	public String getSportType() { return sportType; }
	
	@Override
	public String toString()
	{
		return "List of " + sportType + " games";
	}
	
}