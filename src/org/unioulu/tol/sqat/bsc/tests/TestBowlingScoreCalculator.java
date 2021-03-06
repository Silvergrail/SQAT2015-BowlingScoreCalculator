package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	
	private Frame testFrame;

	private BowlingGame testBowlingGame;
	
/*	@Before 
	public void setGame() {
		testBowlingGame.addFrame(new Frame(1, 5));
		testBowlingGame.addFrame(new Frame(3, 6));
		testBowlingGame.addFrame(new Frame(7, 2));
		testBowlingGame.addFrame(new Frame(3, 6));
		testBowlingGame.addFrame(new Frame(4, 4));
		testBowlingGame.addFrame(new Frame(5, 3));
		testBowlingGame.addFrame(new Frame(3, 3));
		testBowlingGame.addFrame(new Frame(4, 5));
		testBowlingGame.addFrame(new Frame(8, 1));
		testBowlingGame.addFrame(new Frame(2, 6));	
	}*/

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testFrameIsComposedOfTwoThrowsScoresAre2And4() {	
		testFrame = new Frame(2,4);			
	}
	
	@Test
	public void testComputeScoreOfFrames() {
		testFrame = new Frame(2,6);
		assertEquals(8, testFrame.score());			
	}
	
	@Test
	public void testAddingToAnGameArray() {
		
		BowlingGame testBowlingGame = new BowlingGame();
		
		List<Frame> frames = new ArrayList<Frame>();
		
		testFrame = new Frame (1, 5);
		testBowlingGame.frames.add(testFrame);
		assertEquals("[1, 5]", testBowlingGame.frames);
		
	}
	
	
	@Test
	public void testComputeScoreOfTenFrames() {
		
		BowlingGame testBowlingGame = new BowlingGame();
		
		List<Frame> frames = new ArrayList<Frame>();
		
		testBowlingGame.frames.add(new Frame(1, 5));
		testBowlingGame.frames.add(new Frame(3, 6));
		testBowlingGame.frames.add(new Frame(7, 2));
		testBowlingGame.frames.add(new Frame(3, 6));
		testBowlingGame.frames.add(new Frame(4, 4));
		testBowlingGame.frames.add(new Frame(5, 3));
		testBowlingGame.frames.add(new Frame(3, 3));
		testBowlingGame.frames.add(new Frame(4, 5));
		testBowlingGame.frames.add(new Frame(8, 1));
		testBowlingGame.frames.add(new Frame(2, 6));
		

		
		
		assertEquals(81, testBowlingGame.score());
	}
	
	@Test
	public void testIsStrike() {
		testFrame = new Frame(10, 0);
		assertEquals(true, testFrame.isStrike());
		
	}

}
