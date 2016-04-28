package oop_project2;


public class P2Test {

	//Create an NFLData object
	static NFLData teamData = new NFLData();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String fileName = "./src/oop_project2/nflteams.txt";
		

		
		//View team information
		System.out.println(teamData.viewTeams());
		System.out.println(teamData.searchConference("NFC"));
		System.out.println(teamData.searchDivision("NFC", "East"));
		System.out.println(teamData.viewTeamRoster("Cowboys"));
		System.out.println(teamData.listPlayer("Romo", "Cowboys"));
		
		//Haven't tested this fully
		//System.out.println(teamData.getTeamImage("Cowboys"));

	}
}
	


