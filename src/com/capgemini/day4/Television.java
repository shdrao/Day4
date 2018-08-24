package com.capgemini.day4;

public class Television {
	boolean state;
	int currentVolume;
	int currentChannel;

	public Television(boolean state, int currentVolume, int currentChannel) {
		this.state = state;
		this.currentVolume = currentVolume;
		this.currentChannel = currentChannel;
	}

	public int incVolume() {
		if (state == true)
			return currentVolume + 1;
		return currentVolume;
	}

	public int decVolume() {
		if (state == true)
			return currentVolume - 1;
		return currentVolume;
	}

	public int changeChannel(int newChannel) {
		if (state == true)
			return newChannel;
		return currentChannel;
	}

	public boolean turnOnOff() {

		return !state;
	}
}
