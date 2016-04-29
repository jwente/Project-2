package oop_project2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

//Use this class to create object of NFLData type in main
//Implements Results interface
public class NFLData implements Results {

	//Declare ArrayList of Team objects, this is viewable by other methods
	private ArrayList<Team> teamList;
	private ArrayList<TeamRoster> teamRosterList;
	private ArrayList<MatchData> nflMatchList;
	
	//Constructor
	NFLData()
	{
		String file = "./src/oop_project2/nflteams/nflteams.txt";
		readMatchData();
		//readTeamRoster1();
		
		try{
			//Read text from file
			//System.out.println("Reading file: " + file);
			FileReader fileReader = new FileReader(file);
			
			//Wrap fileReader in BufferReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			file = bufferedReader.readLine();
			teamList = new ArrayList<>();
								
			while(file != null)
			{
				//Assign variable data from file
				String[] nflData = file.split(", ");
				String city = nflData[0];
				String teamName = nflData[1];
				String conference = nflData[2];
				String location = nflData[3];
						
				//Create Team object
				Team team = new Team(city, teamName, conference, location);
				
				//Add to arrayList
				teamList.add(team);
		
				//Read next line from file
				file = bufferedReader.readLine();				
			}			
			bufferedReader.close();
			
		}catch(FileNotFoundException ex) { System.out.println("File not found"); }
		catch(IOException ex) { System.out.println("I/O error"); }
		
	} //end NFLData constructor
	//********************************************************************************************
	
	//********************************************************************************************
	//This method will create a TeamRoster object based on User's input
	//It then creates a string with the roster called rosterResult and returns it to calling method
	private String readTeamRoster(String teamNameIn) {
		
		String dir = "./src/oop_project2/teamRosters/";
		String teamRoster = dir+teamNameIn; //get path for team roster file
		String rosterResult = teamNameIn + " Roster:\n"; //Add a "header" to roster list
						
		try{
			//Read text from file
			//System.out.println("Reading team file: " + teamRoster);
			FileReader fileReader = new FileReader(teamRoster);
			
			//Wrap fileReader in BufferReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//Read the team roster file
			teamRoster = bufferedReader.readLine();		
			teamRosterList = new ArrayList<>();
			
			while(teamRoster != null)
			{
				//Assign variable data from file	
				String[] rosterData = teamRoster.split(", ");
				String num = rosterData[0];
				String LName = rosterData[1];
				String FName = rosterData[2];
				String pos = rosterData[3];	
												
				//Read the team roster file and create a new team roster object
				for(int i = 0; i < teamList.size(); i++)
				{
					//System.out.println("TeamNameIn: " + teamNameIn);
					if(teamList.get(i).getTeamName().contains(teamNameIn))
					{	
						String city = teamList.get(i).getCity();
						String teamName = teamNameIn;
						String conference = teamList.get(i).getConference();
						String location = teamList.get(i).getLocation();
											
						//Create TeamRoster object
						TeamRoster roster = new TeamRoster(num, LName, FName, pos, city, teamName, conference, location);
						teamRosterList.add(roster);		
						//Append roster list to rosterResult
						rosterResult += roster.getPos() + " " + roster.getNum() + " " + roster.getFName() 
							+ " " + roster.getLName() + "\n";
					}
				}	
				//Read next line in roster file
				teamRoster = bufferedReader.readLine();				
			}			
			bufferedReader.close();
		
		}catch(FileNotFoundException ex) { System.out.println("File not found"); }
			catch(IOException ex) { System.out.println("I/O error"); }
		
		//Return string rosterResult to calling method
		return rosterResult; 
	}//end readTeamRoster
	//********************************************************************************************
	
	//Method readMatchData reads the nflmatches.txt file and populates the variables
	//in the nflData array, creates an nflMatch MatchData object
	public String readMatchData()
	{
		
		String dir = "./src/oop_project2/matches/";
		String nflMatchFile = dir+"nflmatches.txt";
		String matchResult = "";
		
		try{
				//Read text from nflmatches.txt file
				//System.out.println("Attempting to read " + nflMatchFile);
				FileReader fileReader = new FileReader(nflMatchFile );
				
				//Wrap fileReader in BufferReader
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				nflMatchFile = bufferedReader.readLine();
				nflMatchList = new ArrayList<>();
						
				while(nflMatchFile != null)
				{
					//Assign variable data from MLS file
					String[] nflData = nflMatchFile.split(", ");
					String teamName1 = nflData[0];
					String tmpscore1 = nflData[1];
					String teamName2 = nflData[2];
					String tmpscore2 = nflData[3];
					String matchWeekday = nflData[4];
					String matchMnth = nflData[5];
					String matchDay = nflData[6];
					String matchYear = nflData[7];
					String matchWeek = nflData[8];
					
					int score1 = Integer.parseInt(tmpscore1.toString());
					int score2 = Integer.parseInt(tmpscore2.toString());
					
					//Create MatchData object
					MatchData nflMatch = new MatchData(teamName1, teamName2, matchWeekday, matchMnth, 
							matchDay, matchYear, score1, score2, matchWeek);
					
					//Append data to matchResult
					matchResult += nflMatch.toString();
					
					//Add nflMatch objects to nflMatchList ArrayList
					nflMatchList.add(nflMatch);
					
					//Read next line in nflMatchFile
					nflMatchFile = bufferedReader.readLine();
				}		
				
				bufferedReader.close();			
				
			}catch(FileNotFoundException ex) { System.out.println("File not found"); }
			catch(IOException ex) { System.out.println("I/O error"); }
		return matchResult; //return the match result string
	} //end ReadMatchData
	//**********************************************************************************************
	
	
	//**********************************************************************************************
	//The functions viewMatchWeek, viewTeams, searchConference, searchDivision, viewTeamRoster all 
	//return a string and can be called from the Main class
	//**********************************************************************************************
	
	//This function returns match results based on week specified by user for example 
	//from main class call: 
	//System.out.println(teamData.viewMatchWeek("Week 2"));
	public String viewMatchWeek(String week)
	{
		//Call method searchMatchWeek's static method viewWeek with week and array list parameters
		String weekResult = searchMatchWeek.viewWeek(week, nflMatchList).toString();
		return weekResult; 
	}// end viewMatchWeek
	//**********************************************************************************************	
	
	//viewMatchByTeam returns list of matches containing team name specified by user
	//From main class call:
	//System.out.println(teamData.viewMatchByTeam("Falcons"));
	public String viewMatchByTeam(String teamName)
	{
		//Returns list of matches containing specified team name
		return searchMatchByTeam.team(teamName, nflMatchList).toString();	
	}// end viewMatchByTeam
	//**********************************************************************************************
	
	//viewH2H returns matches containing team name 1 and team name 2 specified by user
	//From main class call:
	//System.out.println(teamData.viewH2H("Patriots", "Dolphins"));
	//System.out.println(teamData.viewH2H("Cowboys", "Patriots"));
	public String viewH2H(String teamName1, String teamName2)
	{
		return searchH2H.teamsH2H(teamName1, teamName2, nflMatchList).toString();
	}
	
	//**********************************************************************************************
	public String viewTeamWins(String teamName)
	{
		return searchTeamWins.teamWin(teamName, nflMatchList).toString();
	}
	
	//**********************************************************************************************
	public String viewTeamLoses(String teamName)
	{
		return searchTeamLoses.teamLoses(teamName, nflMatchList).toString();
	}
	//**********************************************************************************************
	
	//TeamImage method not tested
	public TeamImage getTeamImage(String teamName)
	{
		String dir = "./src/oop_project2/teamIcons/";
		String teamImgPath = dir+teamName;
		TeamImage teamImg = new TeamImage(teamImgPath);
		return teamImg; 
	}// end TeamImage
	//**********************************************************************************************
	
	//viewTeams method returns list of all teams read from nflteams.txt
	//Call from main: System.out.println(teamData.viewTeams());
	public String viewTeams() //Returns all teams
	{
		String result = "";
		//System.out.println("fileList size: " + teamList.size());

		@SuppressWarnings("rawtypes")
		Iterator iterator = teamList.iterator();
		while (iterator.hasNext()) 
		{
			
			//Append teams to result
			result += iterator.next() + "\n";
		}
		return result;
	}// end viewTeams
	//**********************************************************************************************	
	
	//searchConference returns a list of teams based on conference specified by user
	//For example call the method from main:
	//System.out.println(teamData.searchConference("AFC"));
	//System.out.println(teamData.searchConference("NFC"));	
	public String searchConference(String conference)
	{
		//System.out.println((searchByConference.searchConf(conference, teamList)).toString());
		//Call searchByConference method with conference and teamList parameters
		//Return result as a string
		String result = searchByConference.searchConf(conference, teamList).toString();
		return result;
	} //end searchConference
	//***********************************************************************************************
	
	//searchDivision returns a list of teams by division specified by user
	//For example call the method from main:
	//System.out.println(teamData.searchDivision("NFC", "West"));
	//System.out.println(teamData.searchDivision("NFC", "East"));	
	public String searchDivision(String conference, String location)
	{
		//System.out.println((searchByDivision.searchDiv("NFC", "East", teamList)).toString());
		//Call searchByDivision method with conference, location and teamList parameters
		//Return result as a string
		String result = searchByDivision.searchDiv(conference, location.toString(), teamList);
		return result;
	} //end searchDivision
	//***********************************************************************************************
	
	//viewTeamRoster returns list of players based on team name specified by user
	//For example call the method from main:
	//System.out.println(teamData.viewTeamRoster("Bears"));
	//System.out.println(teamData.viewTeamRoster("Cowboys"));
	public String viewTeamRoster(String teamNameIn)
	{
		//Call method readTeamRoster with teamNameIn as parameter
		//Return string to calling function
		return readTeamRoster(teamNameIn);	
	} //end viewTeamRoster
	//***********************************************************************************************
	
	//listPlayer method returns individual player information based on player last name and team name
	//For example call the method from main:
	//System.out.println(teamData.listPlayer("Romo", "Cowboys"));
	//System.out.println(teamData.listPlayer("Brady", "Cowboys"));
	public String listPlayer(String playerIn, String teamIn)
	{
		String playerFound = playerIn;
		boolean found = false;
		
		readTeamRoster(teamIn);
		
		for(int i = 0; i < teamRosterList.size(); i++)
		{
			//System.out.println(teamRosterList.get(i).getLName());
			if(teamRosterList.get(i).getLName().contains(playerIn))
			{
				playerFound = teamRosterList.get(i).getTeamName() + " " + teamRosterList.get(i).getPos() +" "+ teamRosterList.get(i).getFName() 
						+ " " + teamRosterList.get(i).getLName() + ", number " + teamRosterList.get(i).getNum();
				
				found = true;
			}
		}
		if(found == true) return playerFound + "\n";
		else return playerIn + " not found in " + teamIn + " roster \n";
	} //end listPlayer
	//***********************************************************************************************
	
}
