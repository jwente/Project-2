package project_2;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadMatchData {
	
	//Read MLS file
	//String mlsFile = "/home/jlcas/workspace/TestP2/src/mls.txt";
	String mlsFile = "./src/mls.txt";
	String mlbFile = "./src/mlb.txt";
	String nbaFile = "./src/nba.txt";
	String nflFile = "./src/nfl.txt";
	
	private ArrayList<MatchData> mlsList;
	private ArrayList<MatchData> mlbList;
	private ArrayList<MatchData> nbaList;
	private ArrayList<MatchData> nflList;
	
	int count = 0;
	
	ReadMatchData()
	{
		readMLS();
		readMLB();
		readNBA();
		readNFL();
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
	
	private void readMLB() {

		try{
			//Read text from mls file
			//System.out.println("Attempting mlsFile read");
			FileReader fileReader = new FileReader(mlbFile);
			
			//Wrap fileReader in BufferReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			mlbFile = bufferedReader.readLine();
			mlbList = new ArrayList<>();
					
			while(mlbFile != null)
			{
				//Assign variable data from MLS file
				String[] mlbData = mlbFile.split(", ");
				String teamName1 = mlbData[0];
				String tmpscore1 = mlbData[1];
				String teamName2 = mlbData[2];
				String tmpscore2 = mlbData[3];
				String matchWeekday = mlbData[4];
				String matchMnth = mlbData[5];
				String matchDay = mlbData[6];
				String matchYear = mlbData[7];
				
				int score1 = Integer.parseInt(tmpscore1.toString());
				int score2 = Integer.parseInt(tmpscore2.toString());
				
				//Create MatchData object
				MatchData mlbMatch = new MatchData("MLB", teamName1, teamName2, matchWeekday, matchMnth, 
						matchDay, matchYear, score1, score2);
				
				//Add to mlsList arrayList
				mlbList.add(mlbMatch);
				count++;
				mlbFile = bufferedReader.readLine();
			}		
			
			bufferedReader.close();			
			
		}catch(FileNotFoundException ex) { System.out.println("File not found"); }
		catch(IOException ex) { System.out.println("I/O error"); }
	}
	
	private void readNBA() {

		try{
			//Read text from mls file
			//System.out.println("Attempting mlsFile read");
			FileReader fileReader = new FileReader(nbaFile);
			
			//Wrap fileReader in BufferReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			nbaFile = bufferedReader.readLine();
			nbaList = new ArrayList<>();
					
			while(nbaFile != null)
			{
				//Assign variable data from MLS file
				String[] nbaData = nbaFile.split(", ");
				String teamName1 = nbaData[0];
				String tmpscore1 = nbaData[1];
				String teamName2 = nbaData[2];
				String tmpscore2 = nbaData[3];
				String matchWeekday = nbaData[4];
				String matchMnth = nbaData[5];
				String matchDay = nbaData[6];
				String matchYear = nbaData[7];
				
				int score1 = Integer.parseInt(tmpscore1.toString());
				int score2 = Integer.parseInt(tmpscore2.toString());
				
				//Create MatchData object
				MatchData nbaMatch = new MatchData("NBA", teamName1, teamName2, matchWeekday, matchMnth, 
						matchDay, matchYear, score1, score2);
				
				//Add to mlsList arrayList
				nbaList.add(nbaMatch);
				count++;
				nbaFile = bufferedReader.readLine();
			}		
			
			bufferedReader.close();			
			
		}catch(FileNotFoundException ex) { System.out.println("File not found"); }
		catch(IOException ex) { System.out.println("I/O error"); }
	}
	
	private void readNFL() {

		try{
			//Read text from mls file
			//System.out.println("Attempting mlsFile read");
			FileReader fileReader = new FileReader(nflFile);
			
			//Wrap fileReader in BufferReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			nflFile = bufferedReader.readLine();
			nflList = new ArrayList<>();
					
			while(nflFile != null)
			{
				//Assign variable data from MLS file
				String[] nflData = nflFile.split(", ");
				String teamName1 = nflData[0];
				String tmpscore1 = nflData[1];
				String teamName2 = nflData[2];
				String tmpscore2 = nflData[3];
				String matchWeekday = nflData[4];
				String matchMnth = nflData[5];
				String matchDay = nflData[6];
				String matchYear = nflData[7];
				
				int score1 = Integer.parseInt(tmpscore1.toString());
				int score2 = Integer.parseInt(tmpscore2.toString());
				
				//Create MatchData object
				MatchData nflMatch = new MatchData("NFL", teamName1, teamName2, matchWeekday, matchMnth, 
						matchDay, matchYear, score1, score2);
				
				//Add to mlsList arrayList
				nflList.add(nflMatch);
				count++;
				nflFile = bufferedReader.readLine();
			}		
			
			bufferedReader.close();			
			
		}catch(FileNotFoundException ex) { System.out.println("File not found"); }
		catch(IOException ex) { System.out.println("I/O error"); }
	}
	
	public String viewMatchDataMLS()
	{
		String result = "";
		
		//result = mlsList.get(0).getSportType();
		
		//Iterate through mlsList Array List and concatenate all mls contents into String result
		for(int i = 0; i < mlsList.size(); i++)
		{
			result += (mlsList.get(i).toString());
			//result += (mlsList.get(i).getTeamName1() + " " + mlsList.get(i).getScore1());
			
		}
		
		return result;
	}
	
	public String viewMatchDataMLB()
	{
		String result = "";
				
		for(int i = 0; i < mlbList.size(); i++)
		{
			result += (mlbList.get(i).toString());
			
		}
		return result;
	}
	
	public String viewMatchDataNBA()
	{
		String result = "";
				
		for(int i = 0; i < nbaList.size(); i++)
		{
			result += (nbaList.get(i).toString());			
		}
		return result;
	}
	
	public String viewMatchDataNFL()
	{
		String result = "";
				
		for(int i = 0; i < nflList.size(); i++)
		{
			result += (nflList.get(i).toString());			
		}
		return result;
	}
	
	/*
	public void viewMatchDataMLS()
	{
		
		System.out.println(mlsList.get(0).getSportType());
		for(int i = 0; i < mlsList.size(); i++)
		{
			//System.out.println(mlsList.get(i).toString());
			System.out.println(mlsList.get(i).getTeamName1() + " " + mlsList.get(i).getScore1());
			
		}
	}*/

}
