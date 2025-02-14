package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

public class ChangeJobTask extends Class3676<VillagerEntity> {
   private static String[] field19848;

   public ChangeJobTask() {
      super(ImmutableMap.of(MemoryModuleType.field39814, Class2217.field14485));
   }

   public boolean method12508(ServerWorld var1, VillagerEntity var2) {
      Class7921 var5 = var2.method4674();
      return var5.method26571() != VillagerProfession.field36011 && var5.method26571() != VillagerProfession.field36022 && var2.method4721() == 0 && var5.method26572() <= 1;
   }

   public void startExecuting(ServerWorld var1, VillagerEntity var2, long var3) {
      var2.method4695(var2.method4674().method26574(VillagerProfession.field36011));
      var2.method4677(var1);
   }
}
