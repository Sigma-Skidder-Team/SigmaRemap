package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;

public class Class4371 extends Class4247 {
   private static String[] field20602;
   public int field21365 = -16711936;

   public Class4371(IconPanel var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21365 = var7;
   }

   @Override
   public void draw(float var1) {
      RenderUtil.method11438(
         (float)this.field20895 + (float)this.field20897 / 2.0F,
         (float)this.field20896 + (float)this.field20897 / 2.0F,
         (float)this.field20897,
         ColorUtils.applyAlpha(ColorUtils.method17690(this.field21365, ClientColors.DEEP_TEAL.getColor, 0.8F), var1)
      );
      RenderUtil.method11438(
         (float)this.field20895 + (float)this.field20897 / 2.0F,
         (float)this.field20896 + (float)this.field20897 / 2.0F,
         (float)(this.field20897 - 2),
         ColorUtils.applyAlpha(this.field21365, var1)
      );
      if (this.method13212()) {
         RenderUtil.method11438(
            (float)this.field20895 + (float)this.field20897 / 2.0F,
            (float)this.field20896 + (float)this.field20897 / 2.0F,
            (float)(this.field20897 - 2),
            ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1 * 0.2F)
         );
      }

      super.draw(var1);
   }
}
