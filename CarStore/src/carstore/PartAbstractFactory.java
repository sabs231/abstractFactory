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
    public abstract void createTire();
    public abstract void createEngine();
    public abstract void createWindow();
    public abstract void createChassis();
}
