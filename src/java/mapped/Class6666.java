package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import net.minecraft.client.Minecraft;

public class Class6666 implements Class6664 {

   @Override
   public void method20320(CustomGuiScreen var1, CustomGuiScreen var2) {
      var1.setXA(0);
      if (var2 == null) {
         var1.setWidthA(Minecraft.getInstance().mainWindow.getWidth());
      } else {
         var1.setWidthA(var2.getWidthA());
      }
   }
}
