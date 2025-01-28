package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Class3683 extends Class3676<CreatureEntity> {
   private static String[] field19697;
   private final float field19698;

   public Class3683(float var1) {
      super(ImmutableMap.of(MemoryModuleType.field39824, Class2217.field14485));
      this.field19698 = var1;
   }

   public boolean method12508(ServerWorld var1, CreatureEntity var2) {
      return !var1.method7022(var2.getPosition());
   }

   public void method12502(ServerWorld var1, CreatureEntity var2, long var3) {
      BlockPos var7 = var2.getPosition();
      List<BlockPos> var8 = BlockPos.method8360(var7.add(-1, -1, -1), var7.add(1, 1, 1))
         .map(BlockPos::toImmutable)
         .collect(Collectors.toList());
      Collections.shuffle(var8);
      Optional<BlockPos> var9 = var8.stream()
         .filter(var1x -> !var1.method7022(var1x))
         .filter(var2x -> var1.method6765(var2x, var2))
         .filter(var2x -> var1.hasNoCollisions(var2))
         .findFirst();
      var9.ifPresent(var2x -> var2.getBrain().method21406(MemoryModuleType.field39824, new Class8999(var2x, this.field19698, 0)));
   }
}
