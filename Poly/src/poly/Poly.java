/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;
import java.util.ArrayList;
/**
 *
 * @author burrisg
 */
public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Polymorphism & Inherit
        
        Lion lion = new Lion(6, "Yellow");
        Dog dog = new Dog(7, "White");    
        Fish fish = new Fish(100, "Orange");
                
        ArrayList<Animal> arrayAnimal = new ArrayList<Animal>();
        
        arrayAnimal.add(lion);
        arrayAnimal.add(dog);
        arrayAnimal.add(fish);
        
        for (int i = 0; i < arrayAnimal.size(); i++) {
            arrayAnimal.get(i).display();
            allSpeak(arrayAnimal.get(i));
        }
    }
  
    public static void allSpeak(Animal animal) {
        animal.speak();
    }
}