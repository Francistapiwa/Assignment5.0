/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment5.pkg0;

/**
 *
 * @author tapiw
 */


    /**
     * @param args the command line arguments
     */
  public class ThreadsInJava {
//Mainthread
  
    public static void main(String[] args) {
        // TODO code application logic here
        Thread1 t1 = new Thread1();
        t1.start();
        
        Thread2 t2 = new Thread2();
        t2.start();
    }
    
}
