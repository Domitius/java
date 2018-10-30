/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author burrisg
 */
public abstract class Animal {
    int age;
    String color;
    
    Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }
    
    public void display() {
        System.out.printf("Age: %s%nColor: %s%n", this.age, this.color);
    }
    
    public abstract void speak();
}
