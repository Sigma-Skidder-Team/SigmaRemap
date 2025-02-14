package mapped;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;

public class Bird extends Screen {

   public Bird(ITextComponent title) {
      super(title);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
