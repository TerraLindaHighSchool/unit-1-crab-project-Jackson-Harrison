import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private int numOfWorms = 8;
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    //Turns Crab at edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
             turn(50);   
        }
    }
    //Checks for user key presses so the user can turn the crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
         if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(10);
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


