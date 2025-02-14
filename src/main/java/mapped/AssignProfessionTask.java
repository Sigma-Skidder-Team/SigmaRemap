package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class AssignProfessionTask extends Class3676<VillagerEntity> {
   private static String[] field19690;

   public AssignProfessionTask() {
      super(ImmutableMap.of(MemoryModuleType.field39815, Class2217.field14484));
   }

   public boolean method12508(ServerWorld var1, VillagerEntity var2) {
      BlockPos var5 = var2.getBrain().<Class9378>getMemory(MemoryModuleType.field39815).get().method35579();
      return var5.withinDistance(var2.getPositionVec(), 2.0) || var2.method4680();
   }

   public void startExecuting(ServerWorld var1, VillagerEntity var2, long var3) {
      Class9378 var7 = var2.getBrain().<Class9378>getMemory(MemoryModuleType.field39815).get();
      var2.getBrain().method21405(MemoryModuleType.field39815);
      var2.getBrain().method21406(MemoryModuleType.field39814, var7);
      var1.setEntityState(var2, (byte)14);
      if (var2.method4674().method26571() == VillagerProfession.field36011) {
         MinecraftServer var8 = var1.getServer();
         Optional.<ServerWorld>ofNullable(var8.method1318(var7.method35578()))
            .<PointOfInterestType>flatMap(var1x -> var1x.getPointOfInterestManager().getType(var7.method35579()))
            .<VillagerProfession>flatMap(var0 -> Registry.VILLAGER_PROFESSION.stream().filter(var1x -> var1x.getPointOfInterest() == var0).findFirst())
            .ifPresent(var2x -> {
               var2.method4695(var2.method4674().method26574(var2x));
               var2.method4677(var1);
            });
      }
   }
}
