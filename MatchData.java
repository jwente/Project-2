package oop_project2;

public class MatchData extends NFLMatchData {
	
	MatchData(String teamName1, String teamName2, String dateWeekday, String dateMonth, String dateDay, String dateYear,
			int score1, int score2, String matchWeek) 
	{
		super(teamName1, teamName2, dateWeekday, dateMonth, dateDay, dateYear, score1, score2, matchWeek);
	}
	
	public String getTeamName1() { return super.getTeamName1(); }
	public String getTeamName2() { return super.getTeamName2(); }
	public String getDateWeekday() { return super.getDateWeekday(); }
	public String getDateMonth() { return super.getDateMonth(); }
	public String getDateDay() { return super.getDateDay(); }
	public String getDateYear() { return super.getDateYear(); }
	public int getScore1() { return super.getScore1(); }
	public int getScore2() { return super.getScore2(); }
		
	@Override
	public String toString()
	{
		String matchData = getMatchWeek() + "\n";
		return matchData + getDateWeekday() + " " + getDateMonth() +
				" " + getDateDay() + ", " + getDateYear() + " \n" +
				getTeamName1() + " " + getScore1() + " | " + getTeamName2() + " " + getScore2() + "\n\n";
	}
}	


