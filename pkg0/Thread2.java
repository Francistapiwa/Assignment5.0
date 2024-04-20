/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5.pkg0;

/**
 *
 * @author tapiw
 */
class Thread2 extends Thread {
  @Override
       public void run() {
           FilePlayer fp = new FilePlayer();
        try {
            Thread.sleep(2000);
            fp.play("C:/sounds/re.wav");
            Thread.sleep(2000);
            fp.play("C:/sounds/fa.wav");
            Thread.sleep(2000);
            fp.play("C:/sounds/si.wav");
            Thread.sleep(2000);
        } catch (Exception e){
       }
}
}
