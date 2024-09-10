package mapped;

import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;

public class WaterAvoidingRandomWalkingGoal extends Class2736 {
   private static String[] field17257;
   public final float field17266;

   public WaterAvoidingRandomWalkingGoal(Class1046 var1, double var2) {
      this(var1, var2, 0.001F);
   }

   public WaterAvoidingRandomWalkingGoal(Class1046 var1, double var2, float var4) {
      super(var1, var2);
      this.field17266 = var4;
   }

   @Nullable
   @Override
   public Vector3d method10943() {
      if (!this.field17258.method3255()) {
         return !(this.field17258.getRNG().nextFloat() >= this.field17266) ? super.method10943() : Class8037.method27583(this.field17258, 10, 7);
      } else {
         Vector3d var3 = Class8037.method27583(this.field17258, 15, 7);
         return var3 != null ? var3 : super.method10943();
      }
   }
}
