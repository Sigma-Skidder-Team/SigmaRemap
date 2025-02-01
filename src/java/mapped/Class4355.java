package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.ClientColors;
import net.minecraft.util.math.vector.Vector3i;

public class Class4355 extends Class4247 {
   public int field21288;
   public final Animation field21289;
   public final Animation field21290;
   public String field21291;
   public Vector3i field21292;
   public int field21293;
   public int field21294;

   public Class4355(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, String var7,
         Vector3i var8, int var9) {
      super(var1, var2, var3, var4, var5, var6, true);
      this.field21288 = var4;
      this.field21289 = new Animation(114, 114);
      this.field21290 = new Animation(200, 200);
      this.field21290.changeDirection(Direction.BACKWARDS);
      this.field21291 = var7;
      this.field21292 = var8;
      this.field21293 = var9;
      this.field21294 = var6;
      this.field20883 = true;
   }

   @Override
   public void updatePanelDimensions(int newHeight, int newWidth) {
      super.updatePanelDimensions(newHeight, newWidth);
      this.field21289.changeDirection(!this.method13216() ? Direction.BACKWARDS : Direction.FORWARDS);
      boolean var5 = this.method13216() || newHeight > this.method13271() + this.getWidthA() - 62;
      this.method13215(var5);
      if (this.field21290.getDirection() == Direction.FORWARDS) {
         this.method13215(false);
         this.setXA(Math.round(
               (float) this.getWidthA() * QuadraticEasing.easeInQuad(this.field21290.calcPercent(), 0.0F, 1.0F, 1.0F)));
         if (this.field21290.calcPercent() == 1.0F) {
            this.method13037();
         }
      }
   }

   public void method13608() {
      this.field21290.changeDirection(Direction.FORWARDS);
   }

   @Override
   public void draw(float partialTicks) {
      RenderUtil.renderBackgroundBox(
            (float) this.xA,
            (float) this.yA,
            (float) this.widthA,
            (float) this.heightA,
            MultiUtilities.applyAlpha(MultiUtilities.method17691(ClientColors.LIGHT_GREYISH_BLUE.getColor(), 0.03F),
                  this.field21289.calcPercent()));
      RenderUtil.drawString(
            ResourceRegistry.JelloLightFont20,
            (float) (this.xA + 68),
            (float) (this.yA + 14),
            this.field21291,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.8F));
      RenderUtil.drawString(
            ResourceRegistry.JelloLightFont14,
            (float) (this.xA + 68),
            (float) (this.yA + 38),
            "x:" + this.field21292.getX() + " z:" + this.field21292.getZ(),
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.5F));
      byte var4 = 27;
      int var5 = this.widthA - 43;
      float var6 = !this.method13216() ? 0.2F : 0.4F;
      RenderUtil.renderBackgroundBox(
            (float) (this.xA + var5), (float) (this.yA + var4), 20.0F, 2.0F,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), var6));
      RenderUtil.renderBackgroundBox(
            (float) (this.xA + var5), (float) (this.yA + var4 + 5), 20.0F, 2.0F,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), var6));
      RenderUtil.renderBackgroundBox(
            (float) (this.xA + var5), (float) (this.yA + var4 + 10), 20.0F, 2.0F,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), var6));
      RenderUtil.method11438(
            (float) (this.xA + 35),
            (float) (this.yA + this.heightA / 2),
            20.0F,
            MultiUtilities.method17690(this.field21293, ClientColors.DEEP_TEAL.getColor(), 0.9F));
      RenderUtil.method11438((float) (this.xA + 35), (float) (this.yA + this.heightA / 2), 17.0F, this.field21293);
      RenderUtil.drawRoundedRect(
            (float) this.xA, (float) this.yA, (float) this.widthA, (float) this.heightA, 14.0F,
            partialTicks * 0.2F * this.field21289.calcPercent());
      super.draw(partialTicks);
   }
}
