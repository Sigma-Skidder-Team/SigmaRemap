package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3678 extends Class3676<VillagerEntity> {
   private static String[] field19690;

   public Class3678() {
      super(ImmutableMap.of(Class8830.field39815, Class2217.field14484));
   }

   public boolean method12508(ServerWorld var1, VillagerEntity var2) {
      BlockPos var5 = var2.getBrain().<Class9378>method21410(Class8830.field39815).get().method35579();
      return var5.method8317(var2.getPositionVec(), 2.0) || var2.method4680();
   }

   public void method12502(ServerWorld var1, VillagerEntity var2, long var3) {
      Class9378 var7 = var2.getBrain().<Class9378>method21410(Class8830.field39815).get();
      var2.getBrain().method21405(Class8830.field39815);
      var2.getBrain().method21406(Class8830.field39814, var7);
      var1.setEntityState(var2, (byte)14);
      if (var2.method4674().method26571() == Class8395.field36011) {
         MinecraftServer var8 = var1.getServer();
         Optional.<ServerWorld>ofNullable(var8.method1318(var7.method35578()))
            .<Class4913>flatMap(var1x -> var1x.method6951().method6676(var7.method35579()))
            .<Class8395>flatMap(var0 -> Registry.field16090.stream().filter(var1x -> var1x.method29457() == var0).findFirst())
            .ifPresent(var2x -> {
               var2.method4695(var2.method4674().method26574(var2x));
               var2.method4677(var1);
            });
      }
   }
}
