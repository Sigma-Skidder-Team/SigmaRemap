package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;

public class Class4273 extends Class4247 {
   public float field20709;
   public String field20710;

   public Class4273(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, ColorHelper.field27961, var7, false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field20709 = this.field20709 + (!this.method13298() ? -0.14F : 0.14F);
      this.field20709 = Math.min(Math.max(0.0F, this.field20709), 1.0F);
   }

   @Override
   public void draw(float var1) {
      if (this.getTypedText() != null) {
         this.method13225();
         boolean var10 = this.method13297();

          if (var10) {
            RenderUtil.drawRect(
               (float)this.xA,
               (float)this.yA,
               (float)(this.xA + this.widthA),
               (float)(this.yA + this.heightA),
               MultiUtilities.applyAlpha(-11890462, 1.0F)
            );
         }

         int var11 = 16;
         int var12 = 8;
         int var13 = ClientColors.DEEP_TEAL.color;
         if (var10) {
            var13 = ClientColors.LIGHT_GREYISH_BLUE.color;
         }

         RenderUtil.drawString(
            ResourceRegistry.JelloLightFont14,
            (float)(this.xA + var11 + 50),
            (float)(this.yA + var12 + 5),
            this.field20912,
            MultiUtilities.applyAlpha(var13, var1)
         );
         RenderUtil.drawString(
            ResourceRegistry.JelloLightFont12,
            (float)(this.xA + var11 + 50),
            (float)(this.yA + var12 + 19),
            this.field20710,
            MultiUtilities.applyAlpha(var13, var1 * 0.5F)
         );
         super.draw(var1);
      }
   }
}
