
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public String activeWorld = "";

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }
    @Override
    public void act() 
    {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        
        for (Actor WaterTile: getObjectsInRange(50, WaterTile.class))
        {
        if (activeWorld == "MyWorld" && WaterTile!= null && WaterTile instanceof WaterTile) {
                //getworld().removeObject(this);
                    setLocation(204, 3433);
                    return;
            }
        break;
        }
            for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }
        public void handleInput() 
       {
        if (Greenfoot.isKeyDown("w")) 
        {
            velocityY = -12;
        }

        if (Greenfoot.isKeyDown("a"))
		{
            velocityX = -9;
        } 
        else if (Greenfoot.isKeyDown("d")) 
		{
            velocityX = 9;
        }
       }
    
    public int getWidth() 
    {
        return getImage().getWidth();
    }

    public int getHeight()
    {
        return getImage().getHeight();
    }

}
