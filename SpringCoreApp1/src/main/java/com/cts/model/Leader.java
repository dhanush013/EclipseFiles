package com.cts.model;

public class Leader {
	
	private int leaderId;
	private String leaderName;
	private String leaderLocation;
	private Speech speech;
	
	public void leaderInit() {
	
		leaderId=1231;
		leaderName="Ram Kumar";
		leaderLocation="Kanyakumari";
		speech.setSpeechId(111);
		speech.setDuration(200);
		speech.setSpeechName("Corruption");
		
		System.out.println("Leader Init Called");
	}
	
	public void leaderDestroy() {
		System.out.println("Leader Destroy Called");
	}
	
	public int getLeaderId() {
		return leaderId;
	}
	public void setLeaderId(int leaderId) {
		this.leaderId = leaderId;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public String getLeaderLocation() {
		return leaderLocation;
	}
	public void setLeaderLocation(String leaderLocation) {
		this.leaderLocation = leaderLocation;
	}
	public Speech getSpeech() {
		return speech;
	}
	public void setSpeech(Speech speech) {
		this.speech = speech;
	}
	
	@Override
	public String toString() {
		return "Leader [leaderId=" + leaderId + ", leaderName=" + leaderName + ", leaderLocation=" + leaderLocation
				+ ", speech=" + speech + "]";
	}

}
