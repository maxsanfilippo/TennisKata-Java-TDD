package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

public class TennisGame
{
	public static final String FIFTEEN_ALL = "Fifteen - all";
	public static final String LOVE_FIFTEEN = "Love - Fifteen";
	public static final String FIFTEEN_LOVE = "Fifteen - Love";
	public static final String LOVE_ALL = "Love - all";
	
	
	private String score;
	private int serverCount;
	private int receiverCount;
	private String serverScore;
	private String receiverScore;
	
	public TennisGame()
	{
		this.score =  LOVE_ALL;
		serverCount = 0;
		receiverCount = 0;
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
			serverScore = "Love";
			break;
		case 1:
			serverScore = "Fifteen";
			break;
		case 2:
			serverScore = "Thirteen";
			break;
		case 3:
			serverScore = "Forty";	
			break;
		}
		
		switch (receiverCount)
		{
		case 0:
			receiverScore = "Love";
			break;
		case 1:
			receiverScore = "Fifteen";
			break;
		case 2:
			receiverScore = "Thirteen";
			break;
		case 3:
			receiverScore = "Forty";
			break;
		}
		
		if (serverScore == receiverScore)
			score = receiverScore + " - all";
		else 
			score = serverScore + " - " + receiverScore;
	}

	

}
