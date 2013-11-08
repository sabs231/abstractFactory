/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public interface PartAbstractFactory 
{
    public abstract Tire createTire();
    public abstract Engine createEngine();
    public abstract Window createWindow();
    public abstract Chassis createChassis();
}
