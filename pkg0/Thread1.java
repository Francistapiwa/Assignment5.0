/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5.pkg0;

/**
 *
 * @author tapiw
 */
class Thread1 extends Thread {

    @Override
    public void run() {
        FilePlayer fp = new FilePlayer();
        try {
            fp.play("C:/sounds/do.wav");
            Thread.sleep(1000);
            fp.play("C:/sounds/mi.wav");
            Thread.sleep(2000);
            fp.play("C:/sounds/sol.wav");
            Thread.sleep(2000);
            fp.play("C:/sounds/la.wav");
            Thread.sleep(2000);
            fp.play("C:/sounds/do-octave.wav");
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}
