package testp2;

public class MainP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sportType = "MLS";
		String teamName1 = "Chicago Fire";
		String teamName2 = "Toronto FC";
		String dateWeekday = "Friday";
		String dateMonth = "March";
		String dateDay = "3";
		String dateYear = "2015";
		int score1 = 3;
		int score2 = 5;
		
		MatchData match1 = new MatchData(sportType, teamName1, teamName2, dateWeekday, dateMonth, dateDay, dateYear, score1, score2);

		System.out.println(match1.toString());
	}
}
