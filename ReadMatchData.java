package testp2;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadMatchData {
	
	//Read MLS file
	String mlsFile = "/home/jlcas/workspace/TestP2/src/mls.txt";
	private ArrayList<MatchData> mlsList;
	int count = 0;
	
	ReadMatchData()
	{
		readMLS();
	}

	public void readMLS()
	{
		try{
			//Read text from mls file
			//System.out.println("Attempting mlsFile read");
			FileReader fileReader = new FileReader(mlsFile);
			
			//Wrap fileReader in BufferReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			mlsFile = bufferedReader.readLine();
			mlsList = new ArrayList<>();
					
			while(mlsFile != null)
			{
				//Assign variable data from MLS file
				String[] mlsData = mlsFile.split(", ");
				String teamName1 = mlsData[0];
				String tmpscore1 = mlsData[1];
				String teamName2 = mlsData[2];
				String tmpscore2 = mlsData[3];
				String matchWeekday = mlsData[4];
				String matchMnth = mlsData[5];
				String matchDay = mlsData[6];
				String matchYear = mlsData[7];
				
				int score1 = Integer.parseInt(tmpscore1.toString());
				int score2 = Integer.parseInt(tmpscore2.toString());
				
				//Create MatchData object
				MatchData mlsMatch = new MatchData("MLS", teamName1, teamName2, matchWeekday, matchMnth, 
						matchDay, matchYear, score1, score2);
				
				//Add to mlsList arrayList
				mlsList.add(mlsMatch);
				count++;
				mlsFile = bufferedReader.readLine();
			}		
			
			bufferedReader.close();			
			
		}catch(FileNotFoundException ex) { System.out.println("File not found"); }
		catch(IOException ex) { System.out.println("I/O error"); }
	}
	
	public void viewMatchDataMLS()
	{
		System.out.println(mlsList.get(0).getSportType());
		for(int i = 0; i < mlsList.size(); i++)
		{
			//System.out.println(mlsList.get(i).toString());
			System.out.println(mlsList.get(i).getTeamName1() + " " + mlsList.get(i).getScore1());
			
		}
	}

}
