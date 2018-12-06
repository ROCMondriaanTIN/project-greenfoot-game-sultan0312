import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class BruineMuntTeller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BruineMuntTeller extends Mover
{
    Hero hero;
    public void act() 
    {
        List<Hero> heroList = this.getWorld().getObjects(Hero.class);
        Hero myHero = heroList.get(0);
       int munt=myHero.getBruinMunt(); 
        setImage(new GreenfootImage("Muntjes: "+munt,24,Color.BLACK,null));
    }    
}
