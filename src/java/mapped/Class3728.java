package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3728 extends Class3676<VillagerEntity> {
   private static String[] field19825;
   private final float field19826;

   public Class3728(float var1) {
      super(ImmutableMap.of(Class8830.field39815, Class2217.field14484, Class8830.field39814, Class2217.field14485, Class8830.field39818, Class2217.field14484));
      this.field19826 = var1;
   }

   public boolean method12508(ServerWorld var1, VillagerEntity var2) {
      return !var2.isChild() ? var2.method4674().method26571() == Class8395.field36011 : false;
   }

   public void method12502(ServerWorld var1, VillagerEntity var2, long var3) {
      BlockPos var7 = var2.getBrain().<Class9378>method21410(Class8830.field39815).get().method35579();
      Optional var8 = var1.method6951().method6676(var7);
      if (var8.isPresent()) {
         Class6983.method21587(var2, var3x -> this.method12635((Class4913)var8.get(), var3x, var7))
            .findFirst()
            .ifPresent(var4 -> this.method12636(var1, var2, var4, var7, var4.getBrain().<Class9378>method21410(Class8830.field39814).isPresent()));
      }
   }

   private boolean method12635(Class4913 var1, VillagerEntity var2, BlockPos var3) {
      boolean var6 = var2.getBrain().<Class9378>method21410(Class8830.field39815).isPresent();
      if (!var6) {
         Optional var7 = var2.getBrain().<Class9378>method21410(Class8830.field39814);
         Class8395 var8 = var2.method4674().method26571();
         if (var2.method4674().method26571() != Class8395.field36011 && var8.method29457().method15182().test(var1)) {
            return var7.isPresent() ? ((Class9378)var7.get()).method35579().equals(var3) : this.method12637(var2, var3, var1);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method12636(ServerWorld var1, VillagerEntity var2, VillagerEntity var3, BlockPos var4, boolean var5) {
      this.method12638(var2);
      if (!var5) {
         Class6983.method21577(var3, var4, this.field19826, 1);
         var3.getBrain().method21406(Class8830.field39815, Class9378.method35577(var1.getDimensionKey(), var4));
         DebugPacketSender.method23615(var1, var4);
      }
   }

   private boolean method12637(VillagerEntity var1, BlockPos var2, Class4913 var3) {
      Class8238 var6 = var1.method4230().method21651(var2, var3.method15183());
      return var6 != null && var6.method28708();
   }

   private void method12638(VillagerEntity var1) {
      var1.getBrain().method21405(Class8830.field39824);
      var1.getBrain().method21405(Class8830.field39825);
      var1.getBrain().method21405(Class8830.field39815);
   }
}
