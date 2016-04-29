package oop_project2;


public class P2Test {

	//Create an NFLData object
	static NFLData teamData = new NFLData();
	
	public static void main(String[] args) {		
		//String fileName = "./src/oop_project2/nflteams.txt";
		
		//View team information
		System.out.println(teamData.viewTeams());
		System.out.println(teamData.searchConference("AFC"));
		System.out.println(teamData.searchConference("NFC"));
		System.out.println(teamData.searchDivision("NFC", "West"));
		System.out.println(teamData.searchDivision("NFC", "East"));
		System.out.println(teamData.viewTeamRoster("Bears"));
		System.out.println(teamData.viewTeamRoster("Cowboys"));
		System.out.println(teamData.listPlayer("Romo", "Cowboys"));
		System.out.println(teamData.listPlayer("Brady", "Cowboys"));
		
		System.out.println(teamData.readMatchData()); //lists all match results for all weeks
		System.out.println(teamData.viewMatchWeek("Week 5"));
		
		System.out.println(teamData.viewMatchByTeam("Falcons"));
		System.out.println(teamData.viewMatchByTeam("Cowboys"));
		
		System.out.println("View H2H");
		System.out.println(teamData.viewH2H("Patriots", "Dolphins"));
		System.out.println(teamData.viewH2H("Dolphins", "Patriots"));
		//Haven't tested this fully
		//System.out.println(teamData.getTeamImage("Cowboys"));
	}
}
	


