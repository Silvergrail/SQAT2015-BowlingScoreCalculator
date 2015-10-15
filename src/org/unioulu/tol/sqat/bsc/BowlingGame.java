package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

//finish:13:37
public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	public List<Frame> frames = new ArrayList<Frame>();
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
	
	public List<Frame> getFramesList() {
		return frames;		
	}
}
