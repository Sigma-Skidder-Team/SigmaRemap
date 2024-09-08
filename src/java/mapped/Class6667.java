package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import net.minecraft.client.Minecraft;

public class Class6667 implements Class6664 {
   private static String[] field29237;

   @Override
   public void method20320(IconPanel var1, IconPanel var2) {
      var1.method13266(0);
      if (var2 == null) {
         var1.method13270(Minecraft.getInstance().mainWindow.getHeight());
      } else {
         var1.method13270(var2.method13269());
      }
   }
}
