package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import net.minecraft.client.Minecraft;

public class ClickGUIBlurOverlay extends Class4278 {
   private static String[] field21277;
   public final JelloClickGUI field21278;

   public ClickGUIBlurOverlay(JelloClickGUI var1, IconPanel var2, String var3) {
      super(var2, var3, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight(), false);
      this.field21278 = var1;
   }

   @Override
   public void method13089(int var1, int var2, int var3) {
      super.method13089(var1, var2, var3);
   }
}
