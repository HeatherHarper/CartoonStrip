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
        this.drawBoat();
        CartoonCharacter casey = new CartoonCharacter(100, 100, "casey");
        CartoonCharacter alice = new CartoonCharacter(300, 100, "alice");
        
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
        UI.drawPolygon([425,425;550], [50;150;150], 3);
        
        //reset UI stuff for use in other classes
        //UI.setLineWidth(1);
        //UI.setColor(Color.black);
    }
}

