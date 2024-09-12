package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import net.minecraft.client.Minecraft;

public class Class6663 implements Class6664 {
   private static String[] field29234;

   @Override
   public void method20320(IconPanel var1, IconPanel var2) {
      var1.setX(0);
      var1.setY(0);
      if (var2 == null) {
         var1.setWidth(Minecraft.getInstance().mainWindow.getWidth());
         var1.setHeight(Minecraft.getInstance().mainWindow.getHeight());
      } else {
         var1.setWidth(var2.getWidth());
         var1.setHeight(var2.getHeight());
      }
   }
}
