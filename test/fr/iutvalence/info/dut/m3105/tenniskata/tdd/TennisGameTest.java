package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{

	@Test
	public void AnnonceScoreForNewGameShouldReturnNullForAllPlayers()
	{
		TennisGame tennisGame = new TennisGame();
		assertEquals(tennisGame.getScore(), TennisGame.LOVE_ALL);
	}
	
	@Test
	public void AnnonceScoreWhenServerScoredShouldReturn_Fifteen_love()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScores();
		assertEquals(tennisGame.getScore(), TennisGame.FIFTEEN_LOVE);
	}
	
	@Test
	public void AnnonceScoreWhenReceiverScoredShouldReturn_Love_fifteen()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverScores();
		assertEquals(tennisGame.getScore(), TennisGame.LOVE_FIFTEEN);
	}

	@Test
	public void AnnonceScoreWhenReceiverAndServerScoredShouldReturn_Fifteen_all()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverScores();
		tennisGame.serverScores();
		assertEquals(tennisGame.getScore(), TennisGame.FIFTEEN_ALL);
	}

	@Test
	public void AnnonceScoreWhateverWhoScoreAnyTimeShouldReturn_Fifteen_all()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverScores();
		tennisGame.serverScores();
		tennisGame.serverScores();
		tennisGame.serverScores();
		assertEquals(tennisGame.getScore(), "Fifteen - Forty");
	}
}
