package project;

	public class Radio implements Device {
	    private boolean on = false;
	    private int volume = 20;

	    @Override
	    public void turnOn() {
	        on = true;
	        System.out.println("Radio is turned on.");
	    }

	    @Override
	    public void turnOff() {
	        on = false;
	        System.out.println("Radio is turned off.");
	    }

	    @Override
	    public void setVolume(int volume) {
	        if (on) {
	            this.volume = volume;
	            System.out.println("Radio volume set to " + this.volume);
	        } else {
	            System.out.println("Radio is off. Cannot set volume.");
	        }
	    }

	    @Override
	    public boolean isOn() {
	        return on;
	    }
	}



