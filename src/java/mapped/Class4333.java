package mapped;

import org.newdawn.slick.TrueTypeFont;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4333 extends CustomGuiScreen {
   public Animation field21149 = new Animation(500, 200, Direction.FORWARDS);

   public Class4333(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void draw(float var1) {
      GL11.glAlphaFunc(518, 0.1F);
      float var4 = MathUtils.lerp(1.0F - this.field21149.calcPercent(), 0.9, 0.0, 0.9, 0.0);
      float var5 = (float)this.getWidthA() * var4 / 2.0F;
      float var6 = (float)(this.getHeightA() + 10) * var4 / 2.0F;
      RenderUtil.method11418(
         (float)this.method13271() + var5,
         (float)this.method13272() + var6,
         (float)(this.method13271() + this.getWidthA()) - var5,
         (float)(this.method13272() + this.getHeightA()) - var6
      );
      if (var4 != 0.0F) {
         RenderUtil.renderBackgroundBox(
            (float)this.xA, (float)this.yA, (float)this.widthA, (float)this.heightA, MultiUtilities.applyAlpha(-2500135, 0.9F)
         );
      } else {
         RenderUtil.drawRect(
            (float)this.xA,
            (float)this.yA,
            (float)(this.widthA - 1),
            (float)(this.heightA - 1),
            3.0F,
            MultiUtilities.applyAlpha(-2500135, 0.9F)
         );
      }

      TrueTypeFont var7 = !this.field20891.equals("Sigma") ? ResourceList.regular25 : ResourceList.regular28;
      if (!this.field20891.equals("Sigma")) {
         RenderUtil.drawString(
            var7,
            (float)this.xA + (float)(this.getWidthA() - var7.getWidth(this.field20891)) / 2.0F,
            (float)(this.yA + 18),
            this.field20891,
            -16777216
         );
      } else {
         RenderUtil.drawString(
            var7,
            (float)this.xA + (float)(this.getWidthA() - var7.getWidth(this.field20891)) / 2.0F,
            (float)(this.yA + 10),
            this.field20891,
            -13619152
         );
      }

      super.draw(var1);
      RenderUtil.endScissor();
   }
}
