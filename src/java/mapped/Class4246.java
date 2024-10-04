package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import lol.ClientColors;

public class Class4246 extends ButtonPanel {
   private Class4277 field20600;
   private Animation field20601 = new Animation(125, 125);

   public Class4246(Class4277 var1, int var2) {
      super(var1, "sliderButton", 0, 0, var2, var2, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.getColor));
      this.field20601.changeDirection(Direction.BACKWARDS);
      this.method13215(true);
      this.field20886 = true;
      this.field20600 = var1;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      float var5 = this.field20600.method13138();
      float var6 = (float)this.getXA() / (float)(this.icoPanel.getWidthA() - this.getWidthA());
      if (!this.method13212() && !this.method13298() && !this.method13216()) {
         this.field20601.changeDirection(Direction.BACKWARDS);
      } else {
         this.field20601.changeDirection(Direction.FORWARDS);
      }

      this.field20600.method13139(var6);
   }

   @Override
   public void draw(float var1) {
      if (!this.isHovered()) {
         float var10000 = 0.3F;
      } else if (!this.method13216()) {
         if (!this.method13212()) {
            Math.max(var1 * this.field20584, 0.0F);
         } else {
            float var8 = 1.5F;
         }
      } else {
         float var9 = 0.0F;
      }

      byte var5 = 5;
      float var6 = (float)this.getWidthA();
      RenderUtil.drawRoundedRect(
         (float)(this.getXA() + var5),
         (float)(this.getYA() + var5),
         (float)(this.getWidthA() - var5 * 2),
         (float)(this.getHeightA() - var5 * 2),
         10.0F,
         var1 * 0.8F
      );
      RenderUtil.method11438(
         (float)(this.getXA() + this.getWidthA() / 2),
         (float)(this.getYA() + this.getWidthA() / 2),
         var6,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
      );
      if (this.getTypedText() == null) {
      }

      ClientResource var7 = ResourceRegistry.JelloLightFont12;
      super.method13226(var1);
   }
}
