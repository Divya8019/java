package Module4;


	 class Bidder implements Observer {
	    private String bidderName;

	    public Bidder(String bidderName) {
	        this.bidderName = bidderName;
	    }

	    @Override
	    public void update(String eventType, String item) {
	        System.out.println("Hello " + bidderName + ", " + eventType + " for item: " + item);
	    }

	    public String getBidderName() {
	        return bidderName;
	    }
	}



