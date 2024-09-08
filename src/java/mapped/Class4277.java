package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class Class4277 extends Class4247 {
   private static String[] field20602;
   private float field20732;
   private float field20733;
   private Class4246 field20734;
   private Animation field20735;

   public static float method13134(float var0, float var1, float var2) {
      return (var2 - var0) / (var1 - var0);
   }

   public static float method13135(float var0, float var1, float var2, float var3, int var4) {
      float var7 = Math.abs(var2 - var1) / var3;
      float var8 = var1 + var0 * var7 * var3;
      return (float)Math.round((double)var8 * Math.pow(10.0, (double)var4)) / (float)Math.pow(10.0, (double)var4);
   }

   public Class4277(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13136();
   }

   public Class4277(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
      this.method13136();
   }

   public Class4277(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.method13136();
   }

   public Class4277(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, ClientResource var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
      this.method13136();
   }

   private void method13136() {
      this.addToList(this.field20734 = new Class4246(this, this.method13269()));
      this.field20732 = -1.0F;
      this.field20735 = new Animation(114, 114, Direction.BACKWARDS);
   }

   @Override
   public void method13028(int var1, int var2) {
      this.field20735
         .changeDirection(
            !this.method13298() && !this.field20734.method13298() && !this.method13212() && !this.field20734.method13216()
               ? Direction.BACKWARDS
               : Direction.FORWARDS
         );
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      byte var4 = 3;
      byte var5 = 6;
      int var6 = this.method13269() / 4;
      int var7 = this.method13267() - this.field20734.method13267() / 2 - 3;
      int var8 = this.method13263() + this.field20734.method13267() / 4 + 3;
      int var9 = this.method13265() + this.method13269() / 2 - var6 / 2;
      int var10 = this.field20734.method13263() + this.field20734.method13267() / 2 - 6;
      RenderUtil.method11475(
         (float)var8, (float)var9, (float)var10, (float)var6, (float)(var6 / 2), ColorUtils.applyAlpha(this.field20914.method19405(), var1 * var1 * var1)
      );
      RenderUtil.method11475(
         (float)(var8 + var10),
         (float)var9,
         (float)(var7 - var10),
         (float)var6,
         (float)(var6 / 2),
         ColorUtils.applyAlpha(ColorUtils.method17692(this.field20914.method19405(), 0.8F), var1 * var1 * var1)
      );
      if (this.method13303() != null) {
         int var11 = Math.max(0, 9 - this.field20734.method13263());
         RenderUtil.drawString(
            ResourceRegistry.JelloLightFont14,
            (float)(var8 - ResourceRegistry.JelloLightFont14.method23942(this.method13303()) - 10 - var11),
            (float)(var9 - 5),
            this.method13303(),
            ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.5F * this.field20735.calcPercent() * var1)
         );
      }

      super.draw(var1);
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      if (!super.method13078(var1, var2, var3)) {
         this.field20734.method13217(true);
         return false;
      } else {
         return true;
      }
   }

   public Class4246 method13137() {
      return this.field20734;
   }

   @Override
   public void method13079(float var1) {
      if (!this.method13298() && !this.field20734.method13298()) {
      }

      super.method13079(var1);
   }

   public float method13138() {
      return this.field20733;
   }

   public void method13139(float var1) {
      this.method13140(var1, true);
   }

   public void method13140(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field20733;
      this.field20733 = var1;
      this.field20734.method13264((int)((float)(this.method13267() - this.field20734.method13267()) * var1 + 0.5F));
      if (var2 && var5 != var1) {
         this.method13037();
      }
   }

   public boolean method13141() {
      return this.field20732 >= 0.0F && this.field20732 <= 1.0F;
   }

   public float method13142() {
      return this.field20732;
   }

   public void method13143(float var1) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      this.field20732 = var1;
   }
}
