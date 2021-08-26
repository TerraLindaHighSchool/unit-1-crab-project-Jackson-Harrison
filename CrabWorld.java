import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,179,213);
        Lobster lobster = new Lobster();
        addObject(lobster,436,489);
        Worm worm = new Worm();
        addObject(worm,424,64);
        Worm worm2 = new Worm();
        addObject(worm2,288,296);
        Worm worm3 = new Worm();
        addObject(worm3,437,235);
        Worm worm4 = new Worm();
        addObject(worm4,277,482);
        Worm worm5 = new Worm();
        addObject(worm5,115,406);
        Worm worm6 = new Worm();
        addObject(worm6,58,240);
        Worm worm7 = new Worm();
        addObject(worm7,187,92);
        Worm worm8 = new Worm();
        addObject(worm8,464,429);
    }
}