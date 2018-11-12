package com.company;

public class PropertySquare extends Square {

    private int price;
    private int rent;
    private Player owner;

    public PropertySquare(String board, int number, int price, int rent)
    {
        super(board, number);
        this.price = price;
        this.rent = rent;
        this.owner = null;
    }

    @Override
    public void landOn(Player p) throws Exception {
        p.setLocation(this);
        if(owner == null && price < p.netWorth())
        {
            p.decreaseCash(price - rent);
            owner = p;
        }
        else if(owner != null)
        {
            if(rent > p.netWorth())
            {
                p.decreaseCash(p.netWorth());
            }
            else{
                p.decreaseCash(rent);
            }
        }
    }
}