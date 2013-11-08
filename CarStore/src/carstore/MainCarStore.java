/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class MainCarStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Car ford;
        Car nissan;
        CarStore fordStore = new FordStore();
        CarStore nissanStore = new NissanStore();
        
        System.out.println("Welcome to the Multiple car store");
        ford = fordStore.orderCar("Ford");
        nissan = nissanStore.orderCar("Nissan");
        ford.createCar();
        nissan.createCar();
    }
}
