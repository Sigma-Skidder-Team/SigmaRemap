package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class Class4361 extends Class4247 {
   private static String[] field21320;
   public Animation field21321 = new Animation(1200, 1200, Direction.BACKWARDS);

   public Class4361(Class4305 var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 30, 30, false);
   }

   @Override
   public void method13027(float var1) {
      RenderUtil.method11455((float)this.field20895, (float)this.field20896, 30.0F, 30.0F, !this.method13298() ? Class4334.field21177 : Class4334.field21178);
      super.method13027(var1);
   }
}
