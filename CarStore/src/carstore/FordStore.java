/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class FordStore implements CarStore
{
    @Override
    public Car orderCar(String item) 
    {
        Car car = null;
        PartAbstractFactory partFactory = new FordPartFactory();
        
        if (item.equals("Ford"))
        {
            car = new FordFactory(partFactory);
            car.setBrand("Ford Car");
        }
        else
            System.out.println("There is just one Ford model at the time");
        return (car);
    }
    
}
