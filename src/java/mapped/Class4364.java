package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4364 extends Class4247 {
   private static String[] field21332;
   public Animation field21333 = new Animation(1200, 1200, Direction.BACKWARDS);

   public Class4364(Class4305 var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 20, 20, false);
   }

   @Override
   public void draw(float var1) {
      this.field21333.changeDirection(!this.method13298() ? Direction.BACKWARDS : Direction.FORWARDS);
      if (this.field21333.calcPercent() == 1.0F && this.method13298()) {
         this.field21333 = new Animation(1200, 1200, Direction.FORWARDS);
      }

      int var4 = this.method13263() + 10;
      int var5 = this.method13265() + 10;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var4, (float)var5, 0.0F);
      GL11.glRotatef(this.field21333.calcPercent() * 360.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var4), (float)(-var5), 0.0F);
      RenderUtil.method11455((float)this.field20895, (float)this.field20896, 20.0F, 20.0F, !this.method13298() ? Class4334.field21163 : Class4334.field21164);
      GL11.glPopMatrix();
      super.draw(var1);
   }
}
