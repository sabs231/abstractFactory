/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class NissanStore implements CarStore
{
    @Override
    public Car orderCar(String item) 
    {
        Car car = null;
        PartAbstractFactory partFactory = new NissanPartFactory();
        
        if (item.equals("Nissan"))
        {
            car = new NissanFactory(partFactory);
            car.setBrand("Nissan Car");
        }
        else
            System.out.println("There is just one Nissan model");
        return (car);
    }
    
}
