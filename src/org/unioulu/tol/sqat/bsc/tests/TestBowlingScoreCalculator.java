package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	
	private Frame testFrame;

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

}
