package project;

	public class TV implements Device {
	    private boolean on = false;
	    private int volume = 30;

	    @Override
	    public void turnOn() {
	        on = true;
	        System.out.println("TV is turned on.");
	    }

	    @Override
	    public void turnOff() {
	        on = false;
	        System.out.println("TV is turned off.");
	    }

	    @Override
	    public void setVolume(int volume) {
	        if (on) {
	            this.volume = volume;
	            System.out.println("TV volume set to " + this.volume);
	        } else {
	            System.out.println("TV is off. Cannot set volume.");
	        }
	    }

	    @Override
	    public boolean isOn() {
	        return on;
	    }
	}



