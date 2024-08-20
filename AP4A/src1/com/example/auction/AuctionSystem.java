package com.example.auction;

public class AuctionSystem {
    public static void main(String[] args) {
        Auction auction = new ConcreteAuction();

        Bidder bidder1 = new ConcreteBidder("Alice");
        Bidder bidder2 = new ConcreteBidder("Bob");

        auction.subscribe(bidder1);
        auction.subscribe(bidder2);

        auction.newItemAvailable("Antique Vase");
        auction.startAuction();

        auction.unsubscribe(bidder2);

        auction.endAuction();
    }
}
