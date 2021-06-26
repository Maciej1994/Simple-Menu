package com.example.kafeteriacoffee;

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final Drink[] drinks = {
            new Drink("Latte","Caffè latte is a milk coffee that boasts a silky layer of foam as a real highlight to the drink.", R.drawable.coffee1),
            new Drink("Cappuccino","A cappuccino is a coffee-based drink made primarily from espresso and milk.", R.drawable.coffee2),
            new Drink("Espresso","Espresso is a full-flavored, concentrated form of coffee that is served in shots.", R.drawable.coffee3)
    };

}
