package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4333 extends IconPanel {
   public Animation field21149 = new Animation(500, 200, Direction.FORWARDS);

   public Class4333(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void draw(float var1) {
      GL11.glAlphaFunc(518, 0.1F);
      float var4 = MathUtils.lerp(1.0F - this.field21149.calcPercent(), 0.9, 0.0, 0.9, 0.0);
      float var5 = (float)this.getWidth() * var4 / 2.0F;
      float var6 = (float)(this.getHeight() + 10) * var4 / 2.0F;
      RenderUtil.method11418(
         (float)this.method13271() + var5,
         (float)this.method13272() + var6,
         (float)(this.method13271() + this.getWidth()) - var5,
         (float)(this.method13272() + this.getHeight()) - var6
      );
      if (var4 != 0.0F) {
         RenderUtil.method11424(
            (float)this.x, (float)this.y, (float)this.width, (float)this.height, ColorUtils.applyAlpha(-2500135, 0.9F)
         );
      } else {
         RenderUtil.drawRect(
            (float)this.x,
            (float)this.y,
            (float)(this.width - 1),
            (float)(this.height - 1),
            3.0F,
            ColorUtils.applyAlpha(-2500135, 0.9F)
         );
      }

      ClientResource var7 = !this.field20891.equals("Sigma") ? ClassicDecryption.regular25 : ClassicDecryption.regular28;
      if (!this.field20891.equals("Sigma")) {
         RenderUtil.drawString(
            var7,
            (float)this.x + (float)(this.getWidth() - var7.method23942(this.field20891)) / 2.0F,
            (float)(this.y + 18),
            this.field20891,
            -16777216
         );
      } else {
         RenderUtil.drawString(
            var7,
            (float)this.x + (float)(this.getWidth() - var7.method23942(this.field20891)) / 2.0F,
            (float)(this.y + 10),
            this.field20891,
            -13619152
         );
      }

      super.draw(var1);
      RenderUtil.endScissor();
   }
}
