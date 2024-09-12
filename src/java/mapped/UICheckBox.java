package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class UICheckBox extends Class4247 {
   private static String[] field21368;
   public boolean field21369;
   public Animation field21370 = new Animation(70, 90);

   public UICheckBox(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   public boolean method13703() {
      return this.field21369;
   }

   public void method13704(boolean var1) {
      this.method13705(var1, true);
   }

   public void method13705(boolean var1, boolean var2) {
      if (var1 != this.method13703()) {
         this.field21369 = var1;
         this.field21370.changeDirection(!this.field21369 ? Direction.FORWARDS : Direction.BACKWARDS);
         if (var2) {
            this.method13037();
         }
      }
   }

   @Override
   public void draw(float var1) {
      float var4 = !this.method13212() ? 0.43F : 0.6F;
      RenderUtil.drawRect(
         (float)this.x,
         (float)this.y,
         (float)this.width,
         (float)this.height,
         10.0F,
         ColorUtils.applyAlpha(-4144960, var4 * this.field21370.calcPercent() * var1)
      );
      float var5 = (1.0F - this.field21370.calcPercent()) * var1;
      RenderUtil.drawRect(
         (float)this.x,
         (float)this.y,
         (float)this.width,
         (float)this.height,
         10.0F,
         ColorUtils.applyAlpha(ColorUtils.method17690(-14047489, ClientColors.DEEP_TEAL.getColor, !this.method13212() ? 1.0F : 0.9F), var5)
      );
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.getX() + this.getWidth() / 2), (float)(this.getY() + this.getHeight() / 2), 0.0F);
      GL11.glScalef(1.5F - 0.5F * var5, 1.5F - 0.5F * var5, 0.0F);
      GL11.glTranslatef((float)(-this.getX() - this.getWidth() / 2), (float)(-this.getY() - this.getHeight() / 2), 0.0F);
      RenderUtil.method11449(
         (float)this.x,
         (float)this.y,
         (float)this.width,
         (float)this.height,
         ResourcesDecrypter.checkPNG,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5)
      );
      GL11.glPopMatrix();
      var5 *= var5;
      super.draw(var1);
   }

   @Override
   public void method13089(int var1, int var2, int var3) {
      this.method13705(!this.field21369, true);
   }
}
