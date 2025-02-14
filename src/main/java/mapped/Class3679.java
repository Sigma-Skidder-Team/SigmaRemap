package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public class Class3679 extends Class3676<LivingEntity> {
   private static String[] field19691;

   public Class3679() {
      super(ImmutableMap.of(MemoryModuleType.field39816, Class2217.field14484));
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      return var1.rand.nextFloat() > 0.95F;
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      Brain<?> var7 = var2.getBrain();
      BlockPos var8 = var7.getMemory(MemoryModuleType.field39816).get().method35579();
      if (var8.withinDistance(var2.getPosition(), 3.0)) {
         BlockState var9 = var1.getBlockState(var8);
         if (var9.isIn(Blocks.BELL)) {
            Class3369 var10 = (Class3369)var9.getBlock();
            var10.method11962(var1, var8, (Direction)null);
         }
      }
   }
}
