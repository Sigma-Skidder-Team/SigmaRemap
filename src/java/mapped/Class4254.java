package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4254 extends Class4247 {
   private static String[] field20629;
   public Animation field20630 = new Animation(300, 300, Direction.BACKWARDS);
   public Texture field20631;

   public Class4254(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
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
   public void method13027(float var1) {
      float var4 = Class8603.method30791(this.field20630.calcPercent(), 0.68, 2.32, 0.06, 0.48);
      if (this.field20630.method25319() == Direction.BACKWARDS) {
         var4 = Class8603.method30791(this.field20630.calcPercent(), 0.81, 0.38, 0.32, -1.53);
      }

      this.method13285((int)(-25.0F * var4));
      this.method13225();
      Class3192.method11455((float)(this.field20895 + 20), (float)this.field20896, 100.0F, 100.0F, this.field20631);
      int var5 = this.field20895 + 12 - (ClassicDecryption.regular20.method23942(this.field20891) - this.field20897) / 2;
      int var6 = this.field20896 + 102;
      GL11.glAlphaFunc(516, 0.1F);
      Class3192.method11439(ClassicDecryption.regular20, (float)var5, (float)(var6 + 1), this.field20891, Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.5F));
      Class3192.method11439(ClassicDecryption.regular20, (float)var5, (float)var6, this.field20891, ClientColors.LIGHT_GREYISH_BLUE.getColor);
      GL11.glAlphaFunc(519, 0.0F);
      super.method13226(var1);
   }
}
