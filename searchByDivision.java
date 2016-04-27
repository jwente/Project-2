package oop_project2;

import java.util.ArrayList;

public class searchByDivision {
	
	//This static method can be called without creating an object, but requires 
	//a teamList arrayList that is created in NFLData class
	public static String searchDiv(String conferenceIn, String locationIn, ArrayList<Team> teamList)
	{
			
		String conference = conferenceIn;
		String location = locationIn;
		ArrayList<Team> confList;
		
		confList = teamList;
		
		String result = "";
		
		if(conference == "NFC" || conference == "AFC") //search the list for NFC or AFC
			for(int i = 0; i < confList.size(); i++)
			{
				if(confList.get(i).getConference().contains(conference) && confList.get(i).getLocation().contains(location))
				{
					result += (confList.get(i).getConference() + " " + confList.get(i).getLocation() + " " + 
							confList.get(i).getCity() + " " + confList.get(i).getTeamName() + "\n");
				}
			}
		return result;
	}
}
