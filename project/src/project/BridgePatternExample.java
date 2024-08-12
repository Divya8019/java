package project;

public class BridgePatternExample {
	    public static void main(String[] args) {
	        // Create devices
	        Device tv = new TV();
	        Device radio = new Radio();

	        // Create remote controls
	        RemoteControl tvRemote = new RemoteControl(tv);
	        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(radio);

	        // Use the remote control with TV
	        tvRemote.turnOn();
	        tvRemote.setVolume(50);
	        tvRemote.turnOff();

	        // Use the advanced remote control with Radio
	        radioRemote.turnOn();
	        radioRemote.setVolume(30);
	        radioRemote.mute();
	        radioRemote.turnOff();
	    }
	}



