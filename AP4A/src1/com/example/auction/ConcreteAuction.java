package com.example.auction;

public class ConcreteAuction extends Auction {

    private String itemName;

    @Override
    public void startAuction() {
        notifyBidders("Auction started for: " + itemName);
    }

    @Override
    public void endAuction() {
        notifyBidders("Auction ended for: " + itemName);
    }

    @Override
    public void newItemAvailable(String itemName) {
        this.itemName = itemName;
        notifyBidders("New item available: " + itemName);
    }
}
