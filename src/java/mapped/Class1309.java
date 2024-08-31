package mapped;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.StringTextComponent;

public class Class1309 extends Screen {
   public Class1309() {
      super(new StringTextComponent("Jello Options"));
   }

   @Override
   public boolean isPauseScreen() {
      return true;
   }
}
