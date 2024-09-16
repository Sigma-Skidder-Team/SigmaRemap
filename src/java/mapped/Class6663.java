package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import net.minecraft.client.Minecraft;

public class Class6663 implements Class6664 {
   private static String[] field29234;

   @Override
   public void method20320(IconPanel var1, IconPanel var2) {
      var1.setXA(0);
      var1.setYA(0);
      if (var2 == null) {
         var1.setWidthA(Minecraft.getInstance().mainWindow.getWidth());
         var1.setHeightA(Minecraft.getInstance().mainWindow.getHeight());
      } else {
         var1.setWidthA(var2.getWidthA());
         var1.setHeightA(var2.getHeightA());
      }
   }
}
