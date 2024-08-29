package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;

public class Class1099 extends Class1009 {
   private static String[] field6050;

   public Class1099(EntityType<? extends Class1099> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return 10.440001F;
   }

   public static Class7037 method5268() {
      return Class1009.method4343().method21849(Class9173.field42105, 100.0).method21849(Class9173.field42108, 0.5).method21849(Class9173.field42110, 50.0);
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      return var2.method7009(var1) - 0.5F;
   }
}
