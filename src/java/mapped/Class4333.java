package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
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
      float var5 = (float)this.method13267() * var4 / 2.0F;
      float var6 = (float)(this.method13269() + 10) * var4 / 2.0F;
      RenderUtil.method11418(
         (float)this.method13271() + var5,
         (float)this.method13272() + var6,
         (float)(this.method13271() + this.method13267()) - var5,
         (float)(this.method13272() + this.method13269()) - var6
      );
      if (var4 != 0.0F) {
         RenderUtil.method11424(
            (float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, ColorUtils.applyAlpha(-2500135, 0.9F)
         );
      } else {
         RenderUtil.method11475(
            (float)this.field20895,
            (float)this.field20896,
            (float)(this.field20897 - 1),
            (float)(this.field20898 - 1),
            3.0F,
            ColorUtils.applyAlpha(-2500135, 0.9F)
         );
      }

      ClientResource var7 = !this.field20891.equals("Sigma") ? ClassicDecryption.regular25 : ClassicDecryption.regular28;
      if (!this.field20891.equals("Sigma")) {
         RenderUtil.drawString(
            var7,
            (float)this.field20895 + (float)(this.method13267() - var7.method23942(this.field20891)) / 2.0F,
            (float)(this.field20896 + 18),
            this.field20891,
            -16777216
         );
      } else {
         RenderUtil.drawString(
            var7,
            (float)this.field20895 + (float)(this.method13267() - var7.method23942(this.field20891)) / 2.0F,
            (float)(this.field20896 + 10),
            this.field20891,
            -13619152
         );
      }

      super.draw(var1);
      RenderUtil.endScissor();
   }
}
