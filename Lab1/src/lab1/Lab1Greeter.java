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
public class Lab1Greeter {
    /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Lab1Greeter(String aName)
   {
      name = aName;
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }

   private String name;
    
}
