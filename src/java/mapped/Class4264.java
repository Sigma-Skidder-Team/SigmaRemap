package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;

import java.awt.Color;

public class Class4264 extends Class4247 {
   private static String[] field20602;
   private float field20679;
   public boolean field20680 = false;

   public Class4264(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, float var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20679 = var7;
   }

   @Override
   public void method13028(int var1, int var2) {
      int var5 = this.getHeightO() - this.method13271();
      if (this.field20680) {
         this.method13097((float)var5 / (float)this.getWidthA());
      }

      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      for (int var4 = 0; var4 < this.widthA; var4++) {
         float var5 = (float)var4 / (float)this.widthA;
         RenderUtil.renderBackgroundBox(
            (float)(this.xA + var4),
            (float)this.yA,
            1.0F,
            (float)this.heightA,
            MultiUtilities.applyAlpha(Color.HSBtoRGB(var5, 1.0F, 1.0F), var1)
         );
      }

      RenderUtil.method11428(
         (float)this.getXA(),
         (float)this.getYA(),
         (float)(this.getXA() + this.getWidthA()),
         (float)(this.getYA() + this.getHeightA()),
         MultiUtilities.applyAlpha(ClientColors.MID_GREY.color, 0.5F * var1)
      );
      Class4252.method13052(
         this.xA + Math.round((float)this.widthA * this.field20679) + 1, this.yA + 4, Color.HSBtoRGB(this.field20679, 1.0F, 1.0F), var1
      );
      super.draw(var1);
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      this.field20680 = true;
      return super.method13078(var1, var2, var3);
   }

   @Override
   public void method13095(int var1, int var2, int var3) {
      this.field20680 = false;
   }

   public float method13096() {
      return this.field20679;
   }

   public void method13097(float var1) {
      this.method13098(var1, true);
   }

   public void method13098(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field20679;
      this.field20679 = var1;
      if (var2 && var5 != var1) {
         this.method13037();
      }
   }
}
