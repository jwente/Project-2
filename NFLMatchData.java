package oop_project2;

public abstract class NFLMatchData {
	private String teamName1;
	private String teamName2;
	private String dateWeekday;
	private String dateMonth;
	private String dateDay;
	private String dateYear;
	private int score1;
	private int score2;
	private String matchWeek;
	
	NFLMatchData() {};
	
	NFLMatchData(String teamName1, String teamName2, String dateWeekday, String dateMonth, 
			String dateDay, String dateYear, int score1, int score2, String matchWeek)
	{
		this.teamName1 = teamName1;
		this.teamName2 = teamName2;
		this.dateWeekday = dateWeekday;
		this.dateMonth = dateMonth;
		this.dateDay = dateDay;
		this.dateYear = dateYear;
		this.score1 = score1;
		this.score2 = score2;
		this.matchWeek = matchWeek;
	}
	
	public void setTeamName1(String teamName1) { this.teamName1 = teamName1; }
	public void setTeamName2(String teamName2) { this.teamName2 = teamName2; }
	public void setDateWeekday(String dateWeekday) {this.dateWeekday = dateWeekday; }
	public void setDateMonth(String dateMonth) { this.dateMonth = dateMonth; }
	public void setDateDay(String dateDay) { this.dateDay = dateDay; }
	public void setDateYear(String dateYear) { this.dateYear = dateYear; }
	public void setScore1(int score1) { this.score1 = score1; }
	public void setScore2(int score2) { this.score2 = score2; }
	public void setmatchWeek(String matchWeek) { this.matchWeek = matchWeek; }
	
	public String getTeamName1() { return teamName1; }
	public String getTeamName2() { return teamName2; }
	public String getDateWeekday() { return dateWeekday; }
	public String getDateMonth() { return dateMonth; }
	public String getDateDay() { return dateDay; }
	public String getDateYear() { return dateYear; }
	public int getScore1() { return score1; }
	public int getScore2() { return score2; }
	public String getMatchWeek() { return matchWeek; }
	
	@Override
	public String toString()
	{
		String matchData = matchWeek + "\n";
		return matchData + getDateWeekday() + " " + getDateMonth() +
				" " + getDateDay() + ", " + getDateYear() + " \n" +
				getTeamName1() + " " + getScore1() + " | " + getTeamName2() + " " + getScore2() + "\n\n";
	}
	

}
