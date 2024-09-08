package mapped;

public interface IGuiEventListener2 {
   default void mouseMoved(double var1, double var3) {
   }

   default boolean mouseClicked(double var1, double var3, int var5) {
      return false;
   }

   default boolean mouseReleased(double var1, double var3, int var5) {
      return false;
   }

   default boolean mouseDragged(double var1, double var3, int var5, double var6, double var8) {
      return false;
   }

   default boolean mouseScrolled(double var1, double var3, double var5) {
      return false;
   }

   default boolean keyPressed(int var1, int var2, int var3) {
      return false;
   }

   default boolean keyReleased(int var1, int var2, int var3) {
      return false;
   }

   default boolean charTyped(char var1, int var2) {
      return false;
   }

   default boolean changeFocus(boolean var1) {
      return false;
   }

   default boolean isMouseOver(double var1, double var3) {
      return false;
   }
}
