import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Checkpoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkpoint extends Mover
{
    public Checkpoint()
    {
    setImage("flagYellow1.png");    
    getImage().scale(70,70);
    }
    public void act() 
    {
        applyVelocity();
    }    
}
