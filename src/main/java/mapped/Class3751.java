package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3751 extends Class3676<LivingEntity> {
   private static String[] field19902;
   private final float field19903;
   private final int field19904;
   private final int field19905;
   private Optional<BlockPos> field19906 = Optional.<BlockPos>empty();

   public Class3751(int var1, float var2, int var3) {
      super(ImmutableMap.of(MemoryModuleType.field39824, Class2217.field14485, MemoryModuleType.field39813, Class2217.field14486, MemoryModuleType.field39839, Class2217.field14486));
      this.field19904 = var1;
      this.field19903 = var2;
      this.field19905 = var3;
   }

   @Override
   public boolean method12508(ServerWorld var1, LivingEntity var2) {
      Optional var5 = var1.getPointOfInterestManager()
         .method6670(var0 -> var0 == PointOfInterestType.HOME, var0 -> true, var2.getPosition(), this.field19905 + 1, Class2093.field13637);
      if (var5.isPresent() && ((BlockPos)var5.get()).withinDistance(var2.getPositionVec(), (double)this.field19905)) {
         this.field19906 = var5;
      } else {
         this.field19906 = Optional.<BlockPos>empty();
      }

      return true;
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      Brain var7 = var2.getBrain();
      Optional var8 = this.field19906;
      if (!var8.isPresent()) {
         var8 = var1.getPointOfInterestManager()
            .method6673(var0 -> var0 == PointOfInterestType.HOME, var0 -> true, Class2093.field13637, var2.getPosition(), this.field19904, var2.getRNG());
         if (!var8.isPresent()) {
            Optional var9 = var7.<Class9378>getMemory(MemoryModuleType.field39813);
            if (var9.isPresent()) {
               var8 = Optional.<BlockPos>of(((Class9378)var9.get()).method35579());
            }
         }
      }

      if (var8.isPresent()) {
         var7.method21405(MemoryModuleType.field39831);
         var7.method21405(MemoryModuleType.field39825);
         var7.method21405(MemoryModuleType.field39829);
         var7.method21405(MemoryModuleType.field39828);
         var7.method21406(MemoryModuleType.field39839, Class9378.method35577(var1.getDimensionKey(), (BlockPos)var8.get()));
         if (!((BlockPos)var8.get()).withinDistance(var2.getPositionVec(), (double)this.field19905)) {
            var7.method21406(MemoryModuleType.field39824, new Class8999((BlockPos)var8.get(), this.field19903, this.field19905));
         }
      }
   }
}
