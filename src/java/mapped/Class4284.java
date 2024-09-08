package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

public class Class4284 extends Class4278 {
   private static String[] field20767;
   public final int field20768;

   public Class4284(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20768 = var5;
   }

   @Override
   public void draw(float var1) {
      if (this.method13267() != 0) {
         this.method13225();
         float var4 = 1.0F - Math.min(1.0F, Math.max((float)this.method13267() / (float)this.field20768, 0.0F));
         RenderUtil.method11424(
            (float)this.field20895, (float)this.field20896, (float)this.field20768, (float)this.field20898, ColorUtils.applyAlpha(-3254955, var1)
         );
         super.draw(var1 * (1.0F - var4));
         RenderUtil.method11449(
            0.0F, 0.0F, 20.0F, (float)this.field20898, ResourcesDecrypter.shadowRightPNG, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var4 * var1)
         );
      }
   }
}
