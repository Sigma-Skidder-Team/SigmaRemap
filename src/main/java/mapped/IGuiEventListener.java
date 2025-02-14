package mapped;
/**
 * Interface for handling various GUI events.
 */
public interface IGuiEventListener {

   /**
    * Called when a character is typed.
    *
    * @param typed The character that was typed.
    */
   void charTyped(char typed);

   /**
    * Called when a key is pressed.
    *
    * @param keyCode The key code that was pressed.
    */
   void keyPressed(int keyCode);

   /**
    * Called when a mouse button is clicked.
    *
    * @param mouseX The x-coordinate of the mouse click.
    * @param mouseY The y-coordinate of the mouse click.
    * @param mouseButton The button of the mouse that was clicked.
    * @return True if the event was handled, false otherwise.
    */
   boolean onClick(int mouseX, int mouseY, int mouseButton);

   /**
    * Called when a mouse button is clicked.
    *
    * @param mouseX The x-coordinate of the mouse click.
    * @param mouseY The y-coordinate of the mouse click.
    * @param mouseButton The button of the mouse that was clicked.
    */
   void onClick2(int mouseX, int mouseY, int mouseButton);

   /**
    * Called when a mouse button is clicked.
    *
    * @param mouseX The x-coordinate of the mouse click.
    * @param mouseY The y-coordinate of the mouse click.
    * @param mouseButton The button of the mouse that was clicked.
    */
   void onClick3(int mouseX, int mouseY, int mouseButton);

   /**
    * Called when the mouse wheel is used.
    *
    * @param scroll <= -1 is down, > -1 is up
    */
   void onScrolling(float scroll);
}
