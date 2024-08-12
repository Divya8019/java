package Module4;
public class AuctionSystem {
    public static void main(String[] args) {
        // Create an auction item
        AuctionItem item = new AuctionItem("Antique Vase");

        // Create bidders
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

        // Bidders subscribe to auction item notifications
        item.subscribe(bidder1);
        item.subscribe(bidder2);
        item.subscribe(bidder3);

        // Notify bidders of various auction events
        item.availability();
        item.startBidding();
        
        // Unsubscribe one bidder
        item.unsubscribe(bidder2);
        
        item.endBidding();
    }
}

