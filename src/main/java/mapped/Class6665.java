package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;

public class Class6665 implements WidthSetter {
   private static String[] field29235;

   @Override
   public void setWidth(GuiComponent var1, GuiComponent var2) {
      int var5 = 0;
      int var6 = 0;

      for (GuiComponent var8 : var1.method13241()) {
         if (var8.getXA() + var8.getWidthA() > var5) {
            var5 = var8.getXA() + var8.getWidthA();
         }

         if (var8.getYA() + var8.getHeightA() > var6) {
            var6 = var8.getYA() + var8.getHeightA();
         }
      }

      var1.setWidthA(var5);
      var1.setHeightA(var6);
   }
}
