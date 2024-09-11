package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class ModuleSettingUI extends Class4247 {
   public Animation field20661;
   public Animation field20662;
   public int field20663;
   public int field20664;
   public int field20665;
   public int field20666;
   public String field20667;
   public Class4343 field20668;
   public final Module field20669;
   public Texture field20670;
   public boolean field20671 = false;

   public ModuleSettingUI(IconPanel var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20665 = 500;
      this.field20666 = (int)Math.min(600.0F, (float)var6 * 0.7F);
      this.field20664 = (var5 - this.field20665) / 2;
      this.field20663 = (var6 - this.field20666) / 2 + 20;
      this.field20669 = var7;
      byte var10 = 10;
      byte var11 = 59;
      this.addToList(
         this.field20668 = new Class4343(
            this, "mods", this.field20664 + var10, this.field20663 + var11, this.field20665 - var10 * 2, this.field20666 - var11 - var10, var7
         )
      );
      this.field20661 = new Animation(200, 120);
      this.field20662 = new Animation(240, 200);
      this.method13300(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      if (this.method13212()
         && (var1 < this.field20664 || var2 < this.field20663 || var1 > this.field20664 + this.field20665 || var2 > this.field20663 + this.field20666)) {
         this.field20671 = true;
      }

      this.field20661.changeDirection(this.field20671 ? Direction.BACKWARDS : Direction.FORWARDS);
      this.field20662.changeDirection(this.field20671 ? Direction.BACKWARDS : Direction.FORWARDS);
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
      var1 = this.field20661.calcPercent();
      float var4 = Class9747.method38214(var1, 0.0F, 1.0F, 1.0F);
      if (this.field20671) {
         var4 = Class9782.method38557(var1, 0.0F, 1.0F, 1.0F);
      }

      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      RenderUtil.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.45F * var1)
      );
      super.method13224();
      RenderUtil.method11475(
         (float)this.field20664,
         (float)this.field20663,
         (float)this.field20665,
         (float)this.field20666,
         10.0F,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      RenderUtil.drawString(
         ResourceRegistry.JelloMediumFont40,
         (float)this.field20664,
         (float)(this.field20663 - 60),
         this.field20669.getName(),
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      byte var5 = 30;
      RenderUtil.method11419((float)this.field20664, (float)this.field20663, (float)(this.field20665 - 30), (float)this.field20666);
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont20,
         (float)(var5 + this.field20664),
         (float)(var5 + this.field20663),
         this.field20669.getDescription(),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1 * 0.7F)
      );
      RenderUtil.endScissor();
      super.draw(var1);
   }
}
