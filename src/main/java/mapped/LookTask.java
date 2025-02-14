package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

public class LookTask extends Class3676<MobEntity> {
   private static String[] field19693;

   public LookTask(int var1, int var2) {
      super(ImmutableMap.of(MemoryModuleType.field39825, Class2217.field14484), var1, var2);
   }

   public boolean method12499(ServerWorld var1, MobEntity var2, long var3) {
      return var2.getBrain().<Class7864>getMemory(MemoryModuleType.field39825).filter(var1x -> var1x.method26358(var2)).isPresent();
   }

   public void method12506(ServerWorld var1, MobEntity var2, long var3) {
      var2.getBrain().method21405(MemoryModuleType.field39825);
   }

   public void method12504(ServerWorld var1, MobEntity var2, long var3) {
      var2.getBrain().<Class7864>getMemory(MemoryModuleType.field39825).ifPresent(var1x -> var2.method4227().method28039(var1x.method26356()));
   }
}
