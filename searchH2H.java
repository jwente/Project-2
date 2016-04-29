package oop_project2;

import java.util.ArrayList;

public class searchH2H {
	public static String teamsH2H(String teamName1, String teamName2, ArrayList<MatchData> matchList)
	{
		String h2hResult = "";
		
		for(int i = 0; i < matchList.size(); i++)
		{	
			if(matchList.get(i).getTeamName1().contains(teamName1) && matchList.get(i).getTeamName2().contains(teamName2) ||
					matchList.get(i).getTeamName1().contains(teamName2) && matchList.get(i).getTeamName2().contains(teamName1))
			{
				{
					h2hResult += matchList.get(i).getDateWeekday() + " " + matchList.get(i).getDateMonth() + ", " + 
							matchList.get(i).getDateDay() + "\n";
					h2hResult += matchList.get(i).getTeamName1() + " " + matchList.get(i).getScore1() + " " +
							matchList.get(i).getScore2() + " " + matchList.get(i).getTeamName2() +" \n\n";
				}
			}
		}
		if(h2hResult == "")
			return "No data found for " + teamName1 + " vs " + teamName2;
		
		else return h2hResult;		
	}
}
