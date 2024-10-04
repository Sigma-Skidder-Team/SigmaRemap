package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import lol.ClientColors;
import org.lwjgl.opengl.GL11;

public class Class4245 extends ButtonPanel {
   private static String[] field20596;
   public final Class2060 field20597;
   public boolean field20598;
   public Animation field20599;

   public Class4245(IconPanel var1, String var2, int var3, int var4, Class2060 var5) {
      super(var1, var2, var3, var4, 18, 18);
      this.field20597 = var5;
      this.field20599 = new Animation(250, 250);
      this.field20599.changeDirection(Direction.BACKWARDS);
   }

   @Override
   public void draw(float var1) {
      if (this.field20598 && var1 == 1.0F) {
         this.field20599.changeDirection(Direction.FORWARDS);
      }

      int var4 = (int)(EasingFunctions.easeInOutCustomBack(this.field20599.calcPercent(), 0.0F, 1.0F, 1.0F, 7.0F) * 3.0F);
      RenderUtil.method11438(
         (float)(this.xA + this.widthA / 2),
         (float)(this.yA + this.heightA / 2),
         25.0F,
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.025F * var1 * this.field20599.calcPercent())
      );
      RenderUtil.method11438(
         (float)(this.xA + this.widthA / 2),
         (float)(this.yA + this.heightA / 2),
         23.0F,
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.05F * var1 * this.field20599.calcPercent())
      );
      RenderUtil.method11438(
         (float)(this.xA + this.widthA / 2),
         (float)(this.yA + this.heightA / 2),
         (float)(18 + var4),
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * this.field20599.calcPercent())
      );
      RenderUtil.method11438(
         (float)(this.xA + this.widthA / 2),
         (float)(this.yA + this.heightA / 2),
         (float)(18 - var4),
         MultiUtilities.applyAlpha(this.field20597.field13428, var1)
      );
      GL11.glPushMatrix();
      super.method13226(var1);
      GL11.glPopMatrix();
   }
}
