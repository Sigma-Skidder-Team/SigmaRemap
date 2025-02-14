package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import net.minecraft.client.Minecraft;

public class Class6667 implements IWidthSetter {
   private static String[] field29237;

   @Override
   public void setWidth(CustomGuiScreen var1, CustomGuiScreen var2) {
      var1.setYA(0);
      if (var2 == null) {
         var1.setHeightA(Minecraft.getInstance().mainWindow.getHeight());
      } else {
         var1.setHeightA(var2.getHeightA());
      }
   }
}
