package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.ClientColors;

public class ModuleSettingUI extends Class4247 {
   public Animation animation1;
   public Animation animation;
   public int y;
   public int x;
   public int width;
   public int height;
   public Class4343 field20668;
   public final Module module;
   public boolean field20671 = false;

   public ModuleSettingUI(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.width = 500;
      this.height = (int) Math.min(600.0F, (float) var6 * 0.7F);
      this.x = (var5 - this.width) / 2;
      this.y = (var6 - this.height) / 2 + 20;
      this.module = var7;
      byte var10 = 10;
      byte var11 = 59;
      this.addToList(
            this.field20668 = new Class4343(
                  this, "mods", this.x + var10, this.y + var11, this.width - var10 * 2, this.height - var11 - var10,
                  var7));
      this.animation1 = new Animation(200, 120);
      this.animation = new Animation(240, 200);
      this.method13300(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      if (this.method13212()
            && (var1 < this.x || var2 < this.y || var1 > this.x + this.width || var2 > this.y + this.height)) {
         this.field20671 = true;
      }

      this.animation1.changeDirection(this.field20671 ? Direction.BACKWARDS : Direction.FORWARDS);
      this.animation.changeDirection(this.field20671 ? Direction.BACKWARDS : Direction.FORWARDS);
      super.method13028(var1, var2);
   }

   private boolean method13084(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().contains(var1.toLowerCase()) : true;
   }

   private boolean method13085(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().startsWith(var1.toLowerCase()) : true;
   }

   @Override
   public void draw(float var1) {
      var1 = this.animation1.calcPercent();
      float var4 = EasingFunctions.easeOutBack(var1, 0.0F, 1.0F, 1.0F);
      if (this.field20671) {
         var4 = QuadraticEasing.easeOutQuad(var1, 0.0F, 1.0F, 1.0F);
      }

      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      RenderUtil.drawRect(
            (float) this.xA,
            (float) this.yA,
            (float) this.widthA,
            (float) this.heightA,
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), 0.45F * var1));
      super.method13224();
      RenderUtil.drawRect(
            (float) this.x,
            (float) this.y,
            (float) this.width,
            (float) this.height,
            10.0F,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), var1));
      RenderUtil.drawString(
            ResourceRegistry.JelloMediumFont40,
            (float) this.x,
            (float) (this.y - 60),
            this.module.getName(),
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), var1));
      byte var5 = 30;
      RenderUtil.startScissor((float) this.x, (float) this.y, (float) (this.width - 30), (float) this.height);
      RenderUtil.drawString(
            ResourceRegistry.JelloLightFont20,
            (float) (var5 + this.x),
            (float) (var5 + this.y),
            this.module.getDescription(),
            MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), var1 * 0.7F));
      RenderUtil.endScissor();
      super.draw(var1);
   }
}
