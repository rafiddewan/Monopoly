package com.company;

public abstract class Square {

    private String name;
    private int number;

    /**
     *
     * @param name
     * @param number
     */
    public Square(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    /**
     *
     * @return int
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    public abstract void landOn(Player p) throws Exception;
}
