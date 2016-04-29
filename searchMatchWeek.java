package oop_project2;

import java.util.ArrayList;

public class searchMatchWeek {
	
	public static String viewWeek(String matchWeek, ArrayList<MatchData> matchList)
	{
		String weekResult = "";
		
		for(int i = 0; i < matchList.size(); i++)
		{	
			if(matchList.get(i).getMatchWeek().contains(matchWeek))
			{
				weekResult += matchList.get(i).getTeamName1() + " " + matchList.get(i).getScore1() + " " +
						matchList.get(i).getScore2() + " " + matchList.get(i).getTeamName2() + " | ";
			}
		}
		
		return weekResult;
		
	}

}
