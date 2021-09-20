import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        turnAtEdge();
        delayUp();
        turnToCrab();
    }
    //Janky implementation for adding delay to actions.
    private int actDelay = 100;
    private void delayUp()
    {
     actDelay++;
         if (actDelay == 100)
        {
            actDelay = 0;
        }
    }
    //Turns lobster to Crab
    private void turnToCrab()
    {
        if (actDelay == 80)
        {
            Actor Crab = getWorld().getObjects(Knight.class).get(0);
            turnTowards(Crab.getX(), Crab.getY());
        }
    }
    //Turns lobster at edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
             turn(50);   
        }
    }
}
