import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private int numOfWorms = 8;
    public void act()
    {
        checkKeyPress();
        onCollision();
    }
    //Checks for user key presses so the user can turn the crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+3);
        }
         if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3,getY());
        }
         if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3,getY());
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
                Greenfoot.setWorld(new WinScreen());
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
    }
}


