// This program is copyright VUW.
// You are granted permission by VUW to use it to construct your answer to a 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Code for 13DTC Assignment Cartoon Strip
 * Name: Heather Harper
 * Username: HARPERHE
 * Email: heather.harper@student.onslow.school.nz
 */

import ecs100.*;

/** RunCartoonStrip   */
public class RunCartoonStrip{
    public static void main(String[] arguments){
        CartoonStrip cs = new CartoonStrip();
        UI.addButton("Clear", UI::clearGraphics );
        UI.addButton("Tell Story", cs::tellStory );
        UI.addButton("Quit", UI::quit );
        UI.setDivider(0);       // Expand the graphics area
    }

}
