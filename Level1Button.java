import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1Button extends Mover
{
    public Level1Button()
    {
    setImage("switchYellow.png");    
    }
    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
       {
           Greenfoot.setWorld(new Level1());
       }
    }    
}
