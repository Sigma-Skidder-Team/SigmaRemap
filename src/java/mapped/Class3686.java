package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class Class3686 extends Class3676<LivingEntity> {
   private static String[] field19703;
   private final float field19704;

   public Class3686(float var1) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14485));
      this.field19704 = var1;
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      Optional<Vector3d> var7 = Optional.ofNullable(this.method12532(var1, var2));
      if (var7.isPresent()) {
         var2.getBrain().method21408(Class8830.field39824, var7.map(var1x -> new Class8999(var1x, this.field19704, 0)));
      }
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      return !var1.method7022(var2.getPosition());
   }

   @Nullable
   private Vector3d method12532(ServerWorld var1, LivingEntity var2) {
      Random var5 = var2.getRNG();
      BlockPos var6 = var2.getPosition();

      for (int var7 = 0; var7 < 10; var7++) {
         BlockPos var8 = var6.method8336(var5.nextInt(20) - 10, var5.nextInt(6) - 3, var5.nextInt(20) - 10);
         if (method12533(var1, var2, var8)) {
            return Vector3d.method11330(var8);
         }
      }

      return null;
   }

   public static boolean method12533(ServerWorld var0, LivingEntity var1, BlockPos var2) {
      return var0.method7022(var2) && (double)var0.method7006(Heightmap.Type.MOTION_BLOCKING, var2).getY() <= var1.getPosY();
   }
}
