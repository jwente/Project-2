package oop_project2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

//Use this class to create object of NFLData type in main
public class NFLData implements Results {

	//Declare ArrayList of Team objects, this is viewable by other methods
	private ArrayList<Team> teamList;
	
	NFLData()
	{
		String file = "./src/oop_project2/nflteams/nflteams.txt";
		
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
			
			//System.out.println((searchByConference.searchConf("NFC", teamList)).toString());
			//System.out.println((searchByDivision.searchDiv("NFC", "East", teamList)).toString());
			
		}catch(FileNotFoundException ex) { System.out.println("File not found"); }
		catch(IOException ex) { System.out.println("I/O error"); }
		
	}
	
	//********************************************************************************************
	//This method will create a TeamRoster object based on User's input
	//It then creates a string with the roster called rosterResult and returns it to calling method
	private String readTeamRoster(String teamNameIn) {
		String dir = "./src/oop_project2/teamRosters/";
		String teamRoster = dir+teamNameIn; //get path for team roster file
		String rosterResult = teamNameIn + " Roster:\n"; //Add a "header" to roster list
		TeamRoster roster = null; //Initialize TeamRoster object
				
		try{
			//Read text from file
			//System.out.println("Reading team file: " + teamRoster);
			FileReader fileReader = new FileReader(teamRoster);
			
			//Wrap fileReader in BufferReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//Read the team roster file
			teamRoster = bufferedReader.readLine();		
			
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
					if(teamList.get(i).getTeamName().contains(teamNameIn))
					{	
						String city = teamList.get(i).getCity();
						String teamName = teamNameIn;
						String conference = teamList.get(i).getConference();
						String location = teamList.get(i).getLocation();
						
						//Create TeamRoster object
						roster = new TeamRoster(num, LName, FName, pos, city, teamName, conference, location);
								
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
	}
	
	public TeamImage getTeamImage(String teamName)
	{
		String dir = "./src/oop_project2/teamIcons/";
		String teamImgPath = dir+teamName;
		TeamImage teamImg = new TeamImage(teamImgPath);
		return teamImg; 
	}

	//**********************************************************************************************
	//The functions viewTeams, searchConference, searchDivision, viewTeamRoster all return a string
	//and can be called from the Main class
	//**********************************************************************************************

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
	}
		
	//***********************************************************************************************
	public String searchConference(String conference)
	{
		//System.out.println((searchByConference.searchConf(conference, teamList)).toString());
		//Call searchByConference method with conference and teamList parameters
		//Return result as a string
		String result = searchByConference.searchConf(conference, teamList).toString();
		return result;
	}
	
	//***********************************************************************************************
	public String searchDivision(String conference, String location)
	{
		//System.out.println((searchByDivision.searchDiv("NFC", "East", teamList)).toString());
		//Call searchByDivision method with conference, location and teamList parameters
		//Return result as a string
		String result = searchByDivision.searchDiv(conference, location.toString(), teamList);
		return result;
	}
	
	//***********************************************************************************************
	public String viewTeamRoster(String teamNameIn)
	{
		//Call method readTeamRoster with teamNameIn as parameter
		//Return string to calling function
		return readTeamRoster(teamNameIn);	
	}
	
	
}
