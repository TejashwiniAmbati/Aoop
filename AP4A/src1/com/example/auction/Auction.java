package com.example.auction;

import java.util.ArrayList;
import java.util.List;

public abstract class Auction {
    private List<Bidder> bidders = new ArrayList<>();

    public void subscribe(Bidder bidder) {
        bidders.add(bidder);
        System.out.println(bidder.getName() + " has subscribed.");
    }

    public void unsubscribe(Bidder bidder) {
        bidders.remove(bidder);
        System.out.println(bidder.getName() + " has unsubscribed.");
    }

    protected void notifyBidders(String message) {
        for (Bidder bidder : bidders) {
            bidder.update(message);
        }
    }

    public abstract void startAuction();
    public abstract void endAuction();
    public abstract void newItemAvailable(String itemName);
}