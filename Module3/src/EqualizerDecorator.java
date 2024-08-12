

	public class EqualizerDecorator extends MusicSourceDecorator {
	    public EqualizerDecorator(MusicSource decoratedMusicSource) {
	        super(decoratedMusicSource);
	    }

	    @Override
	    public void play() {
	        super.play();
	        setEqualizer();
	    }

	    private void setEqualizer() {
	        System.out.println("Equalizer settings applied.");
	    }
	}



