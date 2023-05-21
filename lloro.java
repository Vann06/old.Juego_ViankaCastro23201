import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lloro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lloro extends Malitos
{
    /**
     * Act - do whatever the lloro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    public lloro(boolean upAndDown)
    {
        upDown = upAndDown;
    }
    public void act()
    {
        moveAround();
        enemigoPega();
    }
    public void enemigoPega()
    {
         if(hitWalls())
        {
            speed = -speed;
        } 
    }
    public void moveAround()
    {
        int x = getX();
        int y = getY();
        if(upDown)
        {
            setLocation(x,y + speed);
        }
        else if(!upDown)
        {
            setLocation(x + speed, y);
        }
      
    }
    
}
