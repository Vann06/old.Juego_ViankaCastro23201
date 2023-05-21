import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Malitos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Malitos extends Movers
{
    int speed = 4;
    /**
     * Act - do whatever the Malitos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
    }
     public boolean hitWalls()
    {
        if(isTouching(Walls.class))
        {
            return true;
        } 
        else
        {
            return false;
        }
        
    }
    public void esquinas()
    {
        int x = getX();
        int y = getY();
        int worldWidth = getWorld().getWidth()-1;
        int worldHeight = getWorld().getHeight()-1;
        if(x >= worldWidth)
        {
            setLocation(0, y);
        }
        if(x <= 0)
        {
            setLocation(worldWidth - 1, y);
        }
        if(y >= worldHeight)
        {
            setLocation(x, 1);
        }
        if(y <= 0)
        {
            setLocation(x, worldHeight -1);
        }
    }
}
