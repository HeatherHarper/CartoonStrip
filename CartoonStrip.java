// This program is copyright VUW.
// You are granted permission by VUW to use it to construct your answer to a 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Code for 13DTC Assignment Cartoon Strip
 * Name: Heather Harper
 * Username: HARPERHE
 * Email: heather.harper@student.onslow.school.nz
 */

import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** Program to create simple animated cartoon strips using the
 *  CartoonCharacter class.  
 */

public class CartoonStrip{

    /** tellStory creates two cartoon characters on the window.
     *  Then animates them according to a fixed script by calling a series
     *  of methods on the characters.
     */
    public void tellStory(){
        /*# YOUR CODE HERE */
        //part 1
        UI.drawImage("img\\part1backdrop.png", 0, 0, 500, 500);
        CartoonCharacter casey = new CartoonCharacter(100, 170, "casey");
        CartoonCharacter alice = new CartoonCharacter(300, 170, "alice");
        alice.lookLeft();
        UI.sleep(500);
        alice.speak("Yay! we're on a boat");
        
        //part 2        
        UI.drawImage("img\\part2backdrop.png", 0, 0, 500, 500);
        alice.draw();
        casey.draw();
        casey.frown();
        casey.speak("is that a storm?");
        alice.erase();
        
        //part 3
        UI.drawImage("img\\part3backdrop.png", 0, 0, 500, 500);
        casey.draw();
        casey.speak("Ahhh!");
        for (int i = 0; i<5; i++) {
            casey.erase();
            casey.changePosition(30, -40);
            casey.draw();
            UI.sleep(400);
            casey.erase();
            casey.changePosition(30, 40);
            casey.draw();
        }  
        
        //part 4
        UI.drawImage("img\\part4backdrop.png", 0, 0, 500, 500);
        casey.changePosition(-100, 150);
        casey.lookLeft();
        UI.sleep(500);
        casey.lookRight();
        UI.sleep(500);
        casey.lookLeft();
        casey.smile();
        UI.sleep(1000);
        casey.speak("hmm");
        casey.speak("It appears I've been marrooned");
    }

    // methods to draw objects for story
    /**
     * Draws a boat
     */
    private void drawBoat(){
        UI.setLineWidth(7);
        UI.setColor(Color.blue);
        UI.fillArc(50, 150, 400, 100, 180, 180);
        UI.drawLine(425, 200, 425, 50);
        //UI.drawPolygon([425, 425, 550], [50, 150, 150], 3);
        
        //reset UI stuff for use in other classes
        //UI.setLineWidth(1);
        //UI.setColor(Color.black);
    }
}

