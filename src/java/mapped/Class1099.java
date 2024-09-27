package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class Class1099 extends Class1009 {
   private static String[] field6050;

   public Class1099(EntityType<? extends Class1099> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public float getStandingEyeHeight(Pose var1, EntitySize var2) {
      return 10.440001F;
   }

   public static Class7037 method5268() {
      return Class1009.method4343().method21849(Attributes.field42105, 100.0).method21849(Attributes.MOVEMENT_SPEED, 0.5).method21849(Attributes.ATTACK_DAMAGE, 50.0);
   }

   @Override
   public float method4339(BlockPos var1, IWorldReader var2) {
      return var2.method7009(var1) - 0.5F;
   }
}
