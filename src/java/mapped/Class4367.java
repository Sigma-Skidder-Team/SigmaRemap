package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;

import java.awt.Color;

public class Class4367 extends Class4247 {
   private static String[] field20602;
   public float field21347;
   private float field21348 = 0.0F;
   private float field21349 = 1.0F;
   public boolean field21350 = false;

   public Class4367(IconPanel var1, String var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21347 = var7;
      this.field21348 = var8;
      this.field21349 = var9;
   }

   public void method13678(float var1) {
      this.field21347 = var1;
   }

   @Override
   public void method13028(int var1, int var2) {
      if (this.field21350) {
         int var5 = this.method13309() - this.method13271();
         this.method13680((float)var5 / (float)this.getWidthA());
         int var6 = this.method13310() - this.method13272();
         this.method13683(1.0F - (float)var6 / (float)this.getHeightA());
      }

      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      int var4 = MultiUtilities.applyAlpha(Color.HSBtoRGB(this.field21347, 0.0F, 1.0F), var1);
      int var5 = MultiUtilities.applyAlpha(Color.HSBtoRGB(this.field21347, 1.0F, 1.0F), var1);
      int var6 = MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1);
      RenderUtil.method11415(this);
      RenderUtil.method11432(
         this.getXA(), this.getYA(), this.getXA() + this.getWidthA(), this.getYA() + this.getHeightA(), var4, var5, var5, var4
      );
      RenderUtil.method11432(
         this.getXA(),
         this.getYA(),
         this.getXA() + this.getWidthA(),
         this.getYA() + this.getHeightA(),
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.0F),
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.0F),
         var6,
         var6
      );
      Class4252.method13052(
         this.xA + Math.round((float)this.widthA * this.method13679()),
         this.yA + Math.round((float)this.heightA * (1.0F - this.method13682())),
         Color.HSBtoRGB(this.field21347, this.field21348, this.field21349),
         var1
      );
      RenderUtil.method11428(
         (float)this.getXA(),
         (float)this.getYA(),
         (float)(this.getXA() + this.getWidthA()),
         (float)(this.getYA() + this.getHeightA()),
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.25F * var1)
      );
      RenderUtil.endScissor();
      super.draw(var1);
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      this.field21350 = true;
      return super.method13078(var1, var2, var3);
   }

   @Override
   public void method13095(int var1, int var2, int var3) {
      this.field21350 = false;
   }

   public float method13679() {
      return this.field21348;
   }

   public void method13680(float var1) {
      this.method13681(var1, true);
   }

   public void method13681(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field21348;
      this.field21348 = var1;
      if (var2 && var5 != var1) {
         this.method13037();
      }
   }

   public float method13682() {
      return this.field21349;
   }

   public void method13683(float var1) {
      this.method13684(var1, true);
   }

   public void method13684(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field21349;
      this.field21349 = var1;
      if (var2 && var5 != var1) {
         this.method13037();
      }
   }

   public int method13685() {
      return Color.HSBtoRGB(this.field21347, this.field21348, this.field21349);
   }
}
