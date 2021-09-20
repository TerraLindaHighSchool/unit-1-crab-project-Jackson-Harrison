import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpikeWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpikeWall extends Actor
{
    /**
     * Act - do whatever the SpikeWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public SpikeWall()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() + 40, image.getHeight() +50);
        setImage(image);
        turn (getRandomNumber(0,360));
    }

}
