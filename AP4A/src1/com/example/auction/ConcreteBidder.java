package com.example.auction;

public class ConcreteBidder implements Bidder {
    private String name;

    public ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}