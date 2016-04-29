package oop_project2;


public class P2Test {

	//Create an NFLData object
	static NFLData teamData = new NFLData();
	
	public static void main(String[] args) {		
		//String fileName = "./src/oop_project2/nflteams.txt";
		
		//View team information
		System.out.println("View all teams");
		System.out.println(teamData.viewTeams());
		
		System.out.println("Search by conference");
		System.out.println(teamData.searchConference("AFC"));
		System.out.println(teamData.searchConference("NFC"));
		
		System.out.println("Search by division");
		System.out.println(teamData.searchDivision("NFC", "West"));
		System.out.println(teamData.searchDivision("NFC", "East"));
		
		System.out.println("View team roster");
		System.out.println(teamData.viewTeamRoster("Bears"));
		System.out.println(teamData.viewTeamRoster("Cowboys"));
		
		System.out.println("List player data");
		System.out.println(teamData.listPlayer("Romo", "Cowboys"));
		System.out.println(teamData.listPlayer("Brady", "Patriots"));
		
		System.out.println("List all match results");
		//System.out.println(teamData.readMatchData()); //lists all match results for all weeks
		
		System.out.println("List match results by week");
		System.out.println(teamData.viewMatchWeek("Week 5"));
		
		System.out.println("View single team's match data");
		System.out.println(teamData.viewMatchByTeam("Falcons"));
		System.out.println(teamData.viewMatchByTeam("Cowboys"));
		
		System.out.println("View Head to Head (team vs team)");
		System.out.println(teamData.viewH2H("Patriots", "Dolphins"));
		System.out.println(teamData.viewH2H("Panthers", "Eagles"));
		
		System.out.println("View specific team wins");
		System.out.println(teamData.viewTeamWins("Panthers"));
		
		System.out.println("View specific team loses");
		System.out.println(teamData.viewTeamLoses("Titans"));
		
		//Haven't tested this fully
		//System.out.println(teamData.getTeamImage("Cowboys"));
	}
}
	


