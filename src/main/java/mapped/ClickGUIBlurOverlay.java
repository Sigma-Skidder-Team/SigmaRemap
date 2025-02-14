package mapped;

import com.mentalfrostbyte.jello.gui.screens.JelloClickGUI;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import net.minecraft.client.Minecraft;

public class ClickGUIBlurOverlay extends Class4278 {
   private static String[] field21277;
   public final JelloClickGUI field21278;

   public ClickGUIBlurOverlay(JelloClickGUI var1, CustomGuiScreen var2, String var3) {
      super(var2, var3, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight(), false);
      this.field21278 = var1;
   }

   @Override
   public void onClick3(int mouseX, int mouseY, int mouseButton) {
      super.onClick3(mouseX, mouseY, mouseButton);
   }
}
