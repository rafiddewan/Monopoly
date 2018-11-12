package com.company;

public class IncomeTaxSquare extends Square {
    private int maximumTax;

    public IncomeTaxSquare(int maxTax)
    {
        super("Income Tax", maxTax);
        this.maximumTax = 200;
    }
    @Override
    public void landOn(Player p) throws Exception {
        p.setLocation(this);
        if(p.netWorth() * 0.1 < maximumTax) p.decreaseCash(p.netWorth() / 10);
        else p.decreaseCash(maximumTax);
    }
}
