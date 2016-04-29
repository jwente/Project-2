package oop_project2;

import java.util.ArrayList;

public class searchTeamLoses {
	public static String teamLoses(String teamName1, ArrayList<MatchData> matchList)
	{
		String teamLoseResult = "";
		
		for(int i = 0; i < matchList.size(); i++)
		{		
			if(matchList.get(i).getTeamName1().contains(teamName1) && matchList.get(i).getScore1() < matchList.get(i).getScore2() 
					|| matchList.get(i).getTeamName2().contains(teamName1) && matchList.get(i).getScore2() < matchList.get(i).getScore1()) 
			{
				{
					teamLoseResult += matchList.get(i).getDateWeekday() + " " + matchList.get(i).getDateMonth() + ", " + 
							matchList.get(i).getDateDay() + "\n";
					teamLoseResult += matchList.get(i).getTeamName1() + " " + matchList.get(i).getScore1() + " " +
							matchList.get(i).getScore2() + " " + matchList.get(i).getTeamName2() +" \n\n";
				}
			}
		}
		if(teamLoseResult == "")
			return "No loses found for " + teamName1 + "\n";
		
		else return teamLoseResult;		
	}
}
