package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;

public class Class4284 extends Class4278 {
   private static String[] field20767;
   public final int field20768;

   public Class4284(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20768 = var5;
   }

   @Override
   public void draw(float partialTicks) {
      if (this.getWidthA() != 0) {
         this.method13225();
         float var4 = 1.0F - Math.min(1.0F, Math.max((float) this.getWidthA() / (float) this.field20768, 0.0F));
         RenderUtil.renderBackgroundBox(
               (float) this.xA, (float) this.yA, (float) this.field20768, (float) this.heightA,
               MultiUtilities.applyAlpha(-3254955, partialTicks));
         super.draw(partialTicks * (1.0F - var4));
         RenderUtil.drawImage(
               0.0F, 0.0F, 20.0F, (float) this.heightA, ResourceList.shadowRightPNG,
               MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), var4 * partialTicks));
      }
   }
}
