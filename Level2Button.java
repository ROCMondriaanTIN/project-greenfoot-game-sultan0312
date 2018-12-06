import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Button extends Mover
{
    public Level2Button()
    {
    setImage("switchBlue.png");    
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
       {
           Greenfoot.setWorld(new Level2());
       }
    }    
}
