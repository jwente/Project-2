package oop_project2;

import java.util.ArrayList;

public class searchByConference {
	
	//This static method can be called without creating an object, but requires 
	//a teamList arrayList that is created in NFLData class
	public static String searchConf(String conferenceIn, ArrayList<Team> teamList)
	{
			
		String conference = conferenceIn;
		ArrayList<Team> confList;
		
		confList = teamList;
		
		String result = conferenceIn + " Teams\n";
		
		if(conference == "NFC" || conference == "AFC") //search the list for NFC or AFC
			for(int i = 0; i < confList.size(); i++)
			{		
				if(confList.get(i).getConference().contains(conference))
				{
					result += (confList.get(i).getCity() + " " + confList.get(i).getTeamName() + "\n");
				}
			}
		return result;
	}
}
