
	public class OnlineStreamingPlayer {
	    public void stream(String url) {
	        System.out.println("Streaming music from: " + url);
	    }
	}

	 class OnlineStreamingAdapter implements MusicSource {
	    private OnlineStreamingPlayer onlineStreamingPlayer;
	    private String url;

	    public OnlineStreamingAdapter(String url) {
	        this.onlineStreamingPlayer = new OnlineStreamingPlayer();
	        this.url = url;
	    }

	    @Override
	    public void play() {
	        onlineStreamingPlayer.stream(url);
	    }
	}



