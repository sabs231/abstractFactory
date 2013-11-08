/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class NissanPartFactory implements PartAbstractFactory
{
    @Override
    public Tire createTire() 
    {
        return (new NissanTire());
    }

    @Override
    public Engine createEngine() 
    {
        return (new NissanEngine());
    }

    @Override
    public Window createWindow() 
    {
        return (new NissanWindow());
    }

    @Override
    public Chassis createChassis() 
    {
        return (new NissanChassis());
    }
    
}
