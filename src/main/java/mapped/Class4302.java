package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;

public class Class4302 extends Widget2 {
   private static String[] field20844;

   public Class4302(GuiComponent var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   @Override
   public void draw(float partialTicks) {
      if (this.isVisible()) {
         RenderUtil.drawImage(
               (float) (this.xA + 30),
               (float) (this.yA + 30),
               187.0F,
               36.0F,
               ResourceList.gemPNG,
               MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), partialTicks));
      }
   }
}
