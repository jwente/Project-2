package oop_project2;

import java.util.ArrayList;

public class searchTeamWins {
	public static String teamWin(String teamName1, ArrayList<MatchData> matchList)
	{
		String teamWinResult = "";
		
		for(int i = 0; i < matchList.size(); i++)
		{		
			if(matchList.get(i).getTeamName1().contains(teamName1) && matchList.get(i).getScore1() > matchList.get(i).getScore2() 
					|| matchList.get(i).getTeamName2().contains(teamName1) && matchList.get(i).getScore2() > matchList.get(i).getScore1()) 
			{
				{
					teamWinResult += matchList.get(i).getDateWeekday() + " " + matchList.get(i).getDateMonth() + ", " + 
							matchList.get(i).getDateDay() + "\n";
					teamWinResult += matchList.get(i).getTeamName1() + " " + matchList.get(i).getScore1() + " " +
							matchList.get(i).getScore2() + " " + matchList.get(i).getTeamName2() +" \n\n";
				}
			}
		}
		if(teamWinResult == "")
			return "No data found for " + teamName1 + "\n";
		
		else return teamWinResult;		
	}
}
