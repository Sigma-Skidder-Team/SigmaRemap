package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;

import java.util.Date;

public class Class4253 extends Class4247 {
   public float field20623;
   public Class6984 field20624;
   public Date field20625;
   public int field20626;
   public Date field20627;
   public Class4263 field20628;

   public Class4253(IconPanel var1, String var2, int var3, int var4, int var5, int var6, Class6984 var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.addToList(this.field20628 = new Class4263(this, "delete", 200, 20, 20, 20));
      this.field20628.doThis((var1x, var2x) -> {
         this.field20625 = new Date();
         this.method13037();
      });
      this.field20624 = var7;
      this.field20626 = var8;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   public void method13056() {
      this.setHeight(0);
      this.field20627 = new Date();
   }

   @Override
   public void draw(float var1) {
      if (this.field20627 != null) {
         float var4 = Animation.method25322(this.field20627, 150.0F);
         var4 = QuadraticEasing.easeOutQuad(var4, 0.0F, 1.0F, 1.0F);
         this.setHeight((int)(55.0F * var4));
         if (var4 == 1.0F) {
            this.field20627 = null;
         }
      }

      if (this.field20625 != null) {
         float var6 = Animation.method25322(this.field20625, 180.0F);
         var6 = QuadraticEasing.easeOutQuad(var6, 0.0F, 1.0F, 1.0F);
         this.setHeight((int)(55.0F * (1.0F - var6)));
         if (var6 == 1.0F) {
            this.field20625 = null;
         }
      }

      RenderUtil.method11421(this.x, this.y, this.x + this.width, this.y + this.height, true);
      RenderUtil.drawString(
         ResourceRegistry.RegularFont20,
         (float)(this.x + 25),
         (float)this.y + (float)this.height / 2.0F - 17.5F,
         this.field20624.method21596(),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.6F * var1)
      );
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont12,
         (float)(this.x + 25),
         (float)this.y + (float)this.height / 2.0F + 7.5F,
         this.field20624.method21597(),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.6F * var1)
      );
      this.field20628.setY((int)((float)this.height / 2.0F - 7.5F));
      super.draw(var1);
      RenderUtil.endScissor();
   }
}
