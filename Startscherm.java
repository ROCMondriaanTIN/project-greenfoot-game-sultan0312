import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscherm extends World
{

    /**
     * Constructor for objects of class Startscherm.
     * 
     */
    public Startscherm()
    {
        super(1100, 880, 1, false);
        this.setBackground("Start.png");
        Level1Button lb= new Level1Button();
        addObject(lb,100, 500);
        //Level2Button 2b= new Level2Button();
        //addObject(2b, 200,500);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level2Button level2Button = new Level2Button();
        addObject(level2Button,282,507);
    }
}
