package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

public class SwitchVillagerJobTask extends Class3676<VillagerEntity> {
   private static String[] field19858;
   public final VillagerProfession field19859;

   public SwitchVillagerJobTask(VillagerProfession var1) {
      super(ImmutableMap.of(MemoryModuleType.field39814, Class2217.field14484, MemoryModuleType.field39818, Class2217.field14484));
      this.field19859 = var1;
   }

   public void startExecuting(ServerWorld var1, VillagerEntity var2, long var3) {
      Class9378 var7 = var2.getBrain().<Class9378>getMemory(MemoryModuleType.field39814).get();
      var1.getPointOfInterestManager()
         .getType(var7.method35579())
         .ifPresent(var3x -> Class6983.method21587(var2, var3xx -> this.method12670(var7, var3x, var3xx)).reduce(var2, SwitchVillagerJobTask::method12669));
   }

   private static VillagerEntity method12669(VillagerEntity var0, VillagerEntity var1) {
      VillagerEntity var4;
      VillagerEntity var5;
      if (var0.method4721() <= var1.method4721()) {
         var4 = var1;
         var5 = var0;
      } else {
         var4 = var0;
         var5 = var1;
      }

      var5.getBrain().method21405(MemoryModuleType.field39814);
      return var4;
   }

   private boolean method12670(Class9378 var1, PointOfInterestType var2, VillagerEntity var3) {
      return this.method12672(var3)
         && var1.equals(var3.getBrain().<Class9378>getMemory(MemoryModuleType.field39814).get())
         && this.method12671(var2, var3.method4674().method26571());
   }

   private boolean method12671(PointOfInterestType var1, VillagerProfession var2) {
      return var2.getPointOfInterest().getPredicate().test(var1);
   }

   private boolean method12672(VillagerEntity var1) {
      return var1.getBrain().<Class9378>getMemory(MemoryModuleType.field39814).isPresent();
   }
}
