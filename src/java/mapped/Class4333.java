package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4333 extends Class4305 {
   public Animation field21149 = new Animation(500, 200, Direction.FORWARDS);

   public Class4333(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method13027(float var1) {
      GL11.glAlphaFunc(518, 0.1F);
      float var4 = Class8603.method30791(1.0F - this.field21149.calcPercent(), 0.9, 0.0, 0.9, 0.0);
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
            (float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, Class5628.method17688(-2500135, 0.9F)
         );
      } else {
         RenderUtil.method11475(
            (float)this.field20895,
            (float)this.field20896,
            (float)(this.field20897 - 1),
            (float)(this.field20898 - 1),
            3.0F,
            Class5628.method17688(-2500135, 0.9F)
         );
      }

      ClientResource var7 = !this.field20891.equals("Sigma") ? ClassicDecryption.regular25 : ClassicDecryption.regular28;
      if (!this.field20891.equals("Sigma")) {
         RenderUtil.method11439(
            var7,
            (float)this.field20895 + (float)(this.method13267() - var7.method23942(this.field20891)) / 2.0F,
            (float)(this.field20896 + 18),
            this.field20891,
            -16777216
         );
      } else {
         RenderUtil.method11439(
            var7,
            (float)this.field20895 + (float)(this.method13267() - var7.method23942(this.field20891)) / 2.0F,
            (float)(this.field20896 + 10),
            this.field20891,
            -13619152
         );
      }

      super.method13027(var1);
      RenderUtil.method11422();
   }
}
