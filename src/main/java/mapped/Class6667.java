package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import net.minecraft.client.Minecraft;

public class Class6667 implements WidthSetter {
   private static String[] field29237;

   @Override
   public void setWidth(GuiComponent var1, GuiComponent var2) {
      var1.setYA(0);
      if (var2 == null) {
         var1.setHeightA(Minecraft.getInstance().mainWindow.getHeight());
      } else {
         var1.setHeightA(var2.getHeightA());
      }
   }
}
