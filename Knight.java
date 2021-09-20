import greenfoot.*;

/**
 * This class defines a Knight. Knights live on the beach.
 */
public class Knight extends Actor
{
    private int numOfWorms = 8;
   
    public Knight()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 400, image.getHeight() - 400);
        setImage(image);
    }
    public void act()
    {
        checkKeyPress();
        onCollision();
    }
    //Checks for user key presses so the user can turn the Knight
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+4);
        }
         if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4,getY());
        }
         if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4,getY());
        }
    }
    //Checks for collisions with other objects
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            numOfWorms--;          
            // *** Winning the game *******************
            if(numOfWorms == 0)
            {
                Greenfoot.setWorld(new Winscreen());
               Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
            // *****************************************
        }
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
        if(isTouching(SpikeWall.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    
    }
}

