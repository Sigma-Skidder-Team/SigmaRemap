package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;

public class Class4263 extends Class4247 {
   private static String[] field20677;
   public float field20678;

   public Class4263(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field20678 = this.field20678 + (!this.method13298() ? -0.14F : 0.14F);
      this.field20678 = Math.min(Math.max(0.0F, this.field20678), 1.0F);
   }

   @Override
   public void draw(float var1) {
      RenderUtil.method11438(
         (float)(this.x + this.width / 2),
         (float)(this.y + this.height / 2),
         (float)this.width,
         ColorUtils.applyAlpha(ClientColors.PALE_YELLOW.getColor, (0.5F + this.field20678 * 0.3F + (!this.field20909 ? 0.0F : 0.2F)) * var1)
      );
      RenderUtil.method11424(
         (float)(this.x + (this.width - 10) / 2),
         (float)(this.y + this.height / 2 - 1),
         10.0F,
         2.0F,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.75F * var1)
      );
      super.draw(var1);
   }
}
