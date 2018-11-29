
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
    
    private int BruinMunt;
    
    int frame = 1;
    int animationTimer = 0;
    int animationTimerFrame = 10;
    int kleur = 1;
    int direction = 2;
    int doubleJump = 0;
    
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }
    public boolean opGrond() {
        Actor onder = getOneObjectAtOffset(0, getImage().getHeight() / 2, Tile.class);
        Tile tile = (Tile) onder;
        return tile != null && tile.isSolid == true;
        
    
    }
    @Override
    public void act() 
    {
        handleInput();
        getBruinMunt();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        for (Actor Spikes : getIntersectingObjects(Spikes.class)) { 
            if (Spikes!=null){
                getWorld().removeObject(this);
                return;
            }
        }
        for (Actor Lava : getIntersectingObjects(Lava.class)) { 
            if (Lava!=null){
                getWorld().removeObject(this);
                return;
            }
        }
        for (Actor Water : getIntersectingObjects(Water.class)) { 
            if (Water!=null){
                getWorld().removeObject(this);
                return;
            }
        }
        
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
    public void handleInput() {
             
        animateJump();
        animateStanding();
            if (keyUp() && velocityY == 0) {
                velocityY = -19;
                doubleJump ++;
            } else {
                doubleJump = 0;
            }
        if (keyLeft() && keyRight() == false) {
            velocityX = -12;
            direction = 1;
            if (animationTimer % animationTimerFrame == 0
                    && velocityY == 0) {
                animate();
            }
            animationTimer++;
        }
        if (keyRight() && keyLeft() == false) {
            velocityX = 12;
            direction = 2;
            if (animationTimer % animationTimerFrame == 0
                    && velocityY == 0) {
                animate();
            }
            animationTimer++;

        }
    }
    public void animate() {
        if (frame == 1) {
            setImage("alien" + kleur + "_walk" + direction + "1.png");
        } else if (frame == 2) {
            setImage("alien" + kleur + "_walk" + direction + "2.png");
            frame = 1;
            return;
        }
        frame++;
    }

    public void animateJump() {
        if (velocityY != 0) {
            setImage("alien" + kleur + "_jump" + direction + ".png");
        }
    }

    public void animateStanding() {
        if (!keyUp() && !keyLeft() && !keyRight()
                && velocityY == 0 || keyLeft() && keyRight() && !keyUp()) {
            setImage("alien" + kleur + "_stand" + direction + ".png");
        }
}
       public int getBruinMunt()
       {
        if(isTouching(BruinMunt.class))
        {
        removeTouching(BruinMunt.class);
        BruinMunt++;
        }
        return BruinMunt;
        }
    
    public int getWidth() 
    {
        return getImage().getWidth();
    }

    public int getHeight()
    {
        return getImage().getHeight();
    }
    public boolean keyUp() {
        boolean keyUp = Greenfoot.isKeyDown("up");
        return keyUp;
    }

    public boolean keyLeft() {
        boolean keyRight = Greenfoot.isKeyDown("left");
        return keyRight;
    }

    public boolean keyRight() {
        boolean keyRight = Greenfoot.isKeyDown("right");
        return keyRight;
    }
}
