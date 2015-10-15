package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame frame;
	private Frame bonus;
	private int sumOfFrames = 0;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		for (int i = 0; i < frames.size(); i++) {
			sumOfFrames += frames.get(i).score();		
		}
		
		return sumOfFrames;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
