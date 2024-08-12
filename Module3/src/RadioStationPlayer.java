
public class RadioStationPlayer {
	    public void tuneToStation(String frequency) {
	        System.out.println("Tuning in to radio station: " + frequency);
	    }
	}

	class RadioStationAdapter implements MusicSource {
	    private RadioStationPlayer radioStationPlayer;
	    private String frequency;

	    public RadioStationAdapter(String frequency) {
	        this.radioStationPlayer = new RadioStationPlayer();
	        this.frequency = frequency;
	    }

	    @Override
	    public void play() {
	        radioStationPlayer.tuneToStation(frequency);
	    }
	}



