package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3723 extends Class3676<Class1042> {
   private static String[] field19808;
   private long field19809;

   public Class3723() {
      super(ImmutableMap.of(Class8830.field39829, Class2217.field14484, Class8830.field39819, Class2217.field14484), 350, 350);
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      return this.method12616(var2);
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return var3 <= this.field19809 && this.method12616(var2);
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      Class1045 var7 = var2.getBrain().<Class1045>method21410(Class8830.field39829).get();
      Class6983.method21569(var2, var7, 0.5F);
      var1.setEntityState(var7, (byte)18);
      var1.setEntityState(var2, (byte)18);
      int var8 = 275 + var2.getRNG().nextInt(50);
      this.field19809 = var3 + (long)var8;
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      Class1042 var7 = (Class1042)var2.getBrain().<Class1045>method21410(Class8830.field39829).get();
      if (!(var2.getDistanceSq(var7) > 5.0)) {
         Class6983.method21569(var2, var7, 0.5F);
         if (var3 < this.field19809) {
            if (var2.getRNG().nextInt(35) == 0) {
               var1.setEntityState(var7, (byte)12);
               var1.setEntityState(var2, (byte)12);
            }
         } else {
            var2.method4705();
            var7.method4705();
            this.method12615(var1, var2, var7);
         }
      }
   }

   private void method12615(ServerWorld var1, Class1042 var2, Class1042 var3) {
      Optional var6 = this.method12617(var1, var2);
      if (var6.isPresent()) {
         Optional var7 = this.method12619(var1, var2, var3);
         if (!var7.isPresent()) {
            var1.method6951().method6674((BlockPos)var6.get());
            DebugPacketSender.method23615(var1, (BlockPos)var6.get());
         } else {
            this.method12620(var1, (Class1042)var7.get(), (BlockPos)var6.get());
         }
      } else {
         var1.setEntityState(var3, (byte)13);
         var1.setEntityState(var2, (byte)13);
      }
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      var2.getBrain().method21405(Class8830.field39829);
   }

   private boolean method12616(Class1042 var1) {
      Brain<Class1042> var4 = var1.getBrain();
      Optional<Class1045> var5 = var4.method21410(Class8830.field39829).filter(var0 -> var0.getType() == EntityType.field41098);
      return !var5.isPresent()
         ? false
         : Class6983.method21571(var4, Class8830.field39829, EntityType.field41098) && var1.method4700() && ((Class1045)var5.get()).method4700();
   }

   private Optional<BlockPos> method12617(ServerWorld var1, Class1042 var2) {
      return var1.method6951().method6672(Class4913.field22766.method15182(), var2x -> this.method12618(var2, var2x), var2.getPosition(), 48);
   }

   private boolean method12618(Class1042 var1, BlockPos var2) {
      Class8238 var5 = var1.method4230().method21651(var2, Class4913.field22766.method15183());
      return var5 != null && var5.method28708();
   }

   private Optional<Class1042> method12619(ServerWorld var1, Class1042 var2, Class1042 var3) {
      Class1042 var6 = var2.method4389(var1, var3);
      if (var6 != null) {
         var2.method4770(6000);
         var3.method4770(6000);
         var6.method4770(-24000);
         var6.setLocationAndAngles(var2.getPosX(), var2.getPosY(), var2.getPosZ(), 0.0F, 0.0F);
         var1.method6995(var6);
         var1.setEntityState(var6, (byte)12);
         return Optional.<Class1042>of(var6);
      } else {
         return Optional.<Class1042>empty();
      }
   }

   private void method12620(ServerWorld var1, Class1042 var2, BlockPos var3) {
      Class9378 var6 = Class9378.method35577(var1.getDimensionKey(), var3);
      var2.getBrain().method21406(Class8830.field39813, var6);
   }
}
