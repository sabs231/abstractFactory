/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class NissanFactory extends Car 
{
    private PartAbstractFactory partFactory;
    
    public NissanFactory(PartAbstractFactory parts)
    {
        partFactory = parts;
    }
    
    @Override
    public void createCar() 
    {
        System.out.println("Constructing " + brand + "...");
        engine = partFactory.createEngine();
        chassis = partFactory.createChassis();
        tire = partFactory.createTire();
        window = partFactory.createWindow();
    }
    
}
