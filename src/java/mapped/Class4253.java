package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.animation.Animation;

import java.util.Date;

public class Class4253 extends Class4247 {
   public float field20623;
   public Class6984 field20624;
   public Date field20625;
   public int field20626;
   public Date field20627;
   public Class4263 field20628;

   public Class4253(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6984 var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13230(this.field20628 = new Class4263(this, "delete", 200, 20, 20, 20));
      this.field20628.method13251((var1x, var2x) -> {
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
      this.method13270(0);
      this.field20627 = new Date();
   }

   @Override
   public void method13027(float var1) {
      if (this.field20627 != null) {
         float var4 = Animation.method25322(this.field20627, 150.0F);
         var4 = Class9782.method38557(var4, 0.0F, 1.0F, 1.0F);
         this.method13270((int)(55.0F * var4));
         if (var4 == 1.0F) {
            this.field20627 = null;
         }
      }

      if (this.field20625 != null) {
         float var6 = Animation.method25322(this.field20625, 180.0F);
         var6 = Class9782.method38557(var6, 0.0F, 1.0F, 1.0F);
         this.method13270((int)(55.0F * (1.0F - var6)));
         if (var6 == 1.0F) {
            this.field20625 = null;
         }
      }

      Class3192.method11421(this.field20895, this.field20896, this.field20895 + this.field20897, this.field20896 + this.field20898, true);
      Class3192.method11439(
         ResourceRegistry.RegularFont20,
         (float)(this.field20895 + 25),
         (float)this.field20896 + (float)this.field20898 / 2.0F - 17.5F,
         this.field20624.method21596(),
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.6F * var1)
      );
      Class3192.method11439(
         ResourceRegistry.JelloLightFont12,
         (float)(this.field20895 + 25),
         (float)this.field20896 + (float)this.field20898 / 2.0F + 7.5F,
         this.field20624.method21597(),
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.6F * var1)
      );
      this.field20628.method13266((int)((float)this.field20898 / 2.0F - 7.5F));
      super.method13027(var1);
      Class3192.method11422();
   }
}
