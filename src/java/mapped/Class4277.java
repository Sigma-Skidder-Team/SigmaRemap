package mapped;

import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.ClientColors;

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
      return (float) Math.round((double) var8 * Math.pow(10.0, (double) var4)) / (float) Math.pow(10.0, (double) var4);
   }

   public Class4277(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13136();
   }

   public Class4277(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
      this.method13136();
   }

   public Class4277(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7,
         String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.method13136();
   }

   public Class4277(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7,
         String var8, TrueTypeFont var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
      this.method13136();
   }

   private void method13136() {
      this.addToList(this.field20734 = new Class4246(this, this.getHeightA()));
      this.field20732 = -1.0F;
      this.field20735 = new Animation(114, 114, Animation.Direction.BACKWARDS);
   }

   @Override
   public void updatePanelDimensions(int newHeight, int newWidth) {
      this.field20735
            .changeDirection(
                  !this.method13298() && !this.field20734.method13298() && !this.method13212()
                        && !this.field20734.method13216()
                              ? Animation.Direction.BACKWARDS
                              : Animation.Direction.FORWARDS);
      super.updatePanelDimensions(newHeight, newWidth);
   }

   @Override
   public void draw(float partialTicks) {
      byte var4 = 3;
      byte var5 = 6;
      int var6 = this.getHeightA() / 4;
      int var7 = this.getWidthA() - this.field20734.getWidthA() / 2 - 3;
      int var8 = this.getXA() + this.field20734.getWidthA() / 4 + 3;
      int var9 = this.getYA() + this.getHeightA() / 2 - var6 / 2;
      int var10 = this.field20734.getXA() + this.field20734.getWidthA() / 2 - 6;
      RenderUtil.drawRect(
            (float) var8, (float) var9, (float) var10, (float) var6, (float) (var6 / 2),
            MultiUtilities.applyAlpha(this.textColor.method19405(), partialTicks * partialTicks * partialTicks));
      RenderUtil.drawRect(
            (float) (var8 + var10),
            (float) var9,
            (float) (var7 - var10),
            (float) var6,
            (float) (var6 / 2),
            MultiUtilities.applyAlpha(MultiUtilities.method17692(this.textColor.method19405(), 0.8F),
                  partialTicks * partialTicks * partialTicks));
      if (this.getTypedText() != null) {
         int var11 = Math.max(0, 9 - this.field20734.getXA());
         RenderUtil.drawString(
               ResourceRegistry.JelloLightFont14,
               (float) (var8 - ResourceRegistry.JelloLightFont14.getWidth(this.getTypedText()) - 10 - var11),
               (float) (var9 - 5),
               this.getTypedText(),
               MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(),
                     0.5F * this.field20735.calcPercent() * partialTicks));
      }

      super.draw(partialTicks);
   }

   @Override
   public boolean onClick(int mouseX, int mouseY, int mouseButton) {
      if (!super.onClick(mouseX, mouseY, mouseButton)) {
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
   public void onScrolling(float scroll) {
      if (!this.method13298() && !this.field20734.method13298()) {
      }

      super.onScrolling(scroll);
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
      this.field20734.setXA((int) ((float) (this.getWidthA() - this.field20734.getWidthA()) * var1 + 0.5F));
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
