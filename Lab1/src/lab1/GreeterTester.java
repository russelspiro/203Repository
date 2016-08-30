/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ruspiro
 */
public class GreeterTester {
    public static void main(String[] args)
   {
      Lab1Greeter worldGreeter = new Lab1Greeter("World");
      String greeting = worldGreeter.sayHello();
      System.out.println(greeting);
   }
    
}
