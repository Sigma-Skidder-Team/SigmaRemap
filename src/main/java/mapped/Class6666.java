package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import net.minecraft.client.Minecraft;

public class Class6666 implements WidthSetter {

   @Override
   public void setWidth(GuiComponent var1, GuiComponent var2) {
      var1.setXA(0);
      if (var2 == null) {
         var1.setWidthA(Minecraft.getInstance().mainWindow.getWidth());
      } else {
         var1.setWidthA(var2.getWidthA());
      }
   }
}
