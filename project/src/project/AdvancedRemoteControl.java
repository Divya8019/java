package project;

	public class AdvancedRemoteControl extends RemoteControl {

	    public AdvancedRemoteControl(Device device) {
	        super(device);
	    }

	    public void mute() {
	        System.out.println("Muting the device.");
	        device.setVolume(0);
	    }

	    // Additional operations can be added here.
	}


