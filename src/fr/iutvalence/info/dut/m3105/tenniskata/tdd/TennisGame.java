package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{
	public static final String FIFTEEN_ALL = "Fifteen - all";
	public static final String LOVE_FIFTEEN = "Love - fifteen";
	public static final String FIFTEEN_LOVE = "Fifteen - love";
	public static final String LOVE_ALL = "Love - all";
	
	
	private String score;
	private int serverCount=0;
	private int receiverCount=0;
	private String serverScore;
	private String receiverScore;
	
	public TennisGame()
	{
		this.score =  LOVE_ALL;
	}
	
	public void serverScores()
	{
		serverCount += 1;
	}
	
	public void receiverScores() 
	{
		receiverCount += 1;
	}
	
	
	public String getScore() 
	{
		this.calculScore();
		return this.score;
	}

	private void calculScore() 
	{
		switch (serverCount)
		{
		case 0:
			serverScore = "LOVE";
		case 1:
			serverScore = "Fifteen";
		case 2:
			serverScore = "Thirteen";
		case 3:
			serverScore
		}
			//TODO : calculer tous les scores possibles	
	}

	

}
