package oop_project2;

import java.util.ArrayList;

public class searchMatchWeek {
	
	public static String viewWeek(String matchWeek, ArrayList<MatchData> matchListAbbr)
	{
		String weekResult = "";
		
		for(int i = 0; i < matchListAbbr.size(); i++)
		{	
			if(matchListAbbr.get(i).getMatchWeek().contains(matchWeek))
			{
				weekResult += matchListAbbr.get(i).getTeamName1() + " " + matchListAbbr.get(i).getScore1() + " " +
						matchListAbbr.get(i).getScore2() + " " + matchListAbbr.get(i).getTeamName2() + " | ";
			}
		}
		
		return weekResult;
		
	}

}
