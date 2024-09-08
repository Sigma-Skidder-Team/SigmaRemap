package mapped;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;

public class ClickGui extends Screen {
   private static String[] field6212;

   public ClickGui(ITextComponent var1) {
      super(var1);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
