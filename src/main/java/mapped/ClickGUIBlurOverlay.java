package mapped;

import com.mentalfrostbyte.jello.gui.screens.JelloClickGUI;
import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import net.minecraft.client.Minecraft;

public class ClickGUIBlurOverlay extends Widget2 {
   private static String[] field21277;
   public final JelloClickGUI field21278;

   public ClickGUIBlurOverlay(JelloClickGUI var1, GuiComponent var2, String var3) {
      super(var2, var3, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight(), false);
      this.field21278 = var1;
   }

   @Override
   public void onMouseClick(int mouseX, int mouseY, int mouseButton) {
      super.onMouseClick(mouseX, mouseY, mouseButton);
   }
}
