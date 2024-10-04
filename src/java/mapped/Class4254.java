package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import lol.ClientColors;
import lol.Texture;
import org.lwjgl.opengl.GL11;

public class Class4254 extends Class4247 {
   private static String[] field20629;
   public Animation field20630 = new Animation(300, 300, Direction.BACKWARDS);
   public Texture field20631;

   public Class4254(IconPanel var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20631 = var7;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.method13298() && (double)this.field20630.calcPercent() < 0.1) {
         this.field20630.changeDirection(Direction.FORWARDS);
      } else if (!this.method13298() && this.field20630.calcPercent() == 1.0F) {
         this.field20630.changeDirection(Direction.BACKWARDS);
      }
   }

   @Override
   public void draw(float var1) {
      float var4 = MathUtils.lerp(this.field20630.calcPercent(), 0.68, 2.32, 0.06, 0.48);
      if (this.field20630.getDirection() == Direction.BACKWARDS) {
         var4 = MathUtils.lerp(this.field20630.calcPercent(), 0.81, 0.38, 0.32, -1.53);
      }

      this.drawBackground((int)(-25.0F * var4));
      this.method13225();
      RenderUtil.method11455((float)(this.xA + 20), (float)this.yA, 100.0F, 100.0F, this.field20631);
      int var5 = this.xA + 12 - (ClassicDecryption.regular20.getStringWidth(this.field20891) - this.widthA) / 2;
      int var6 = this.yA + 102;
      GL11.glAlphaFunc(516, 0.1F);
      RenderUtil.drawString(ClassicDecryption.regular20, (float)var5, (float)(var6 + 1), this.field20891, MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.5F));
      RenderUtil.drawString(ClassicDecryption.regular20, (float)var5, (float)var6, this.field20891, ClientColors.LIGHT_GREYISH_BLUE.getColor);
      GL11.glAlphaFunc(519, 0.0F);
      super.method13226(var1);
   }
}
