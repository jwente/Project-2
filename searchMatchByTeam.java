package oop_project2;

import java.util.ArrayList;

public class searchMatchByTeam {
	
	public static String team(String teamName, ArrayList<MatchData> matchList)
	{
		String matchTeam = "";
		
		for(int i = 0; i < matchList.size(); i++)
		{	
			if(matchList.get(i).getTeamName1().contains(teamName) || matchList.get(i).getTeamName2().contains(teamName))
			{
				{
					matchTeam += matchList.get(i).getDateWeekday() + " " + matchList.get(i).getDateMonth() + ", " + 
							matchList.get(i).getDateDay() + "\n";
					matchTeam += matchList.get(i).getTeamName1() + " " + matchList.get(i).getScore1() + " " +
							matchList.get(i).getScore2() + " " + matchList.get(i).getTeamName2() +" \n\n";
				}
			}
		}
		
		return matchTeam;		
	}
}
