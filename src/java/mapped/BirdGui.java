package mapped;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;

public class BirdGui extends Screen {

   public BirdGui(ITextComponent title) {
      super(title);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
