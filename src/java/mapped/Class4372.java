package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import net.minecraft.item.ItemStack;

public class Class4372 extends Class4247 {
   private static String[] field20602;
   public ItemStack field21366;
   public boolean field21367;

   public Class4372(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ItemStack var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21366 = var7;
   }

   @Override
   public void draw(float var1) {
      byte var4 = 5;
      if (this.method13700() || this.method13298()) {
         RenderUtil.method11464(
            (float)this.x,
            (float)this.y,
            (float)this.width,
            (float)this.height,
            14.0F,
            !this.method13700() ? 0.3F * var1 : 0.8F * var1
         );
      }

      RenderUtil.method11479(this.field21366, this.x + var4, this.y + var4, this.width - var4 * 2, this.height - var4 * 2);
      super.draw(var1);
   }

   public boolean method13700() {
      return this.field21367;
   }

   public void method13701(boolean var1) {
      this.method13702(var1, true);
   }

   public void method13702(boolean var1, boolean var2) {
      if (var1 != this.method13700()) {
         this.field21367 = var1;
         this.method13037();
      }
   }

   @Override
   public void method13089(int var1, int var2, int var3) {
      this.method13702(!this.field21367, true);
   }
}
