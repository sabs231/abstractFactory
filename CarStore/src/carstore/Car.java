/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public abstract class Car 
{
    protected String brand;
    protected Engine engine;
    protected Chassis chassis;
    protected Tire tire;
    protected Window window;
    
    public abstract void createCar();

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
