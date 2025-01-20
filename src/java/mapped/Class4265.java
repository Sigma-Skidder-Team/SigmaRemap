package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.ClientColors;

public class Class4265 extends Class4247 {
   private static String[] field20681;
   private boolean field20682 = true;
   private Animation field20683 = new Animation(100, 100);

   public Class4265(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20682 = var7;
   }

   @Override
   public void draw(float var1) {
      this.field20683.changeDirection(!this.method13298() ? Direction.BACKWARDS : Direction.FORWARDS);
      var1 *= 0.09F + 0.25F * this.field20683.calcPercent() + (this.field20682 ? 0.0F : 0.2F);
      RenderUtil.renderBackgroundBox(
            (float) (this.xA + 10), (float) (this.yA + 16), 5.0F, 14.0F,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), var1));
      RenderUtil.renderBackgroundBox(
            (float) (this.xA + 17), (float) (this.yA + 10), 5.0F, 20.0F,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), var1));
      RenderUtil.renderBackgroundBox(
            (float) (this.xA + 24), (float) (this.yA + 20), 5.0F, 10.0F,
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), var1));
      super.draw(var1);
   }

   public void method13099(boolean var1) {
      this.field20682 = var1;
   }
}
