package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class Class4265 extends Class4247 {
   private static String[] field20681;
   private boolean field20682 = true;
   private Animation field20683 = new Animation(100, 100);

   public Class4265(Class4305 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20682 = var7;
   }

   @Override
   public void method13027(float var1) {
      this.field20683.changeDirection(!this.method13298() ? Direction.BACKWARDS : Direction.FORWARDS);
      var1 *= 0.09F + 0.25F * this.field20683.calcPercent() + (this.field20682 ? 0.0F : 0.2F);
      Class3192.method11424(
         (float)(this.field20895 + 10), (float)(this.field20896 + 16), 5.0F, 14.0F, Class5628.method17688(Class1979.field12896.field12910, var1)
      );
      Class3192.method11424(
         (float)(this.field20895 + 17), (float)(this.field20896 + 10), 5.0F, 20.0F, Class5628.method17688(Class1979.field12896.field12910, var1)
      );
      Class3192.method11424(
         (float)(this.field20895 + 24), (float)(this.field20896 + 20), 5.0F, 10.0F, Class5628.method17688(Class1979.field12896.field12910, var1)
      );
      super.method13027(var1);
   }

   public void method13099(boolean var1) {
      this.field20682 = var1;
   }
}