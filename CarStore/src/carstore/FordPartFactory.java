/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class FordPartFactory implements PartAbstractFactory
{    
    @Override
    public Tire createTire() 
    {
        return (new FordTire());
    }

    @Override
    public Engine createEngine() 
    {
        return (new FordEngine());
    }

    @Override
    public Window createWindow() 
    {
        return (new FordWindow());
    }

    @Override
    public Chassis createChassis() 
    {
        return (new FordChassis());
    }
}
