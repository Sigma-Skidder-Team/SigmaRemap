package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3735 extends Class3676<MobEntity> {
   private static String[] field19849;
   private int field19850;
   private Class8238 field19851;
   private BlockPos field19852;
   private float field19853;

   public Class3735() {
      this(150, 250);
   }

   public Class3735(int var1, int var2) {
      super(
         ImmutableMap.of(MemoryModuleType.field39841, Class2217.field14486, MemoryModuleType.field39831, Class2217.field14485, MemoryModuleType.field39824, Class2217.field14484),
         var1,
         var2
      );
   }

   public boolean method12508(ServerWorld var1, MobEntity var2) {
      if (this.field19850 <= 0) {
         Brain<?> var5 = var2.getBrain();
         Class8999 var6 = var5.getMemory(MemoryModuleType.field39824).get();
         boolean var7 = this.method12663(var2, var6);
         if (!var7 && this.method12662(var2, var6, var1.getGameTime())) {
            this.field19852 = var6.method33251().method26357();
            return true;
         } else {
            var5.method21405(MemoryModuleType.field39824);
            if (var7) {
               var5.method21405(MemoryModuleType.field39841);
            }

            return false;
         }
      } else {
         this.field19850--;
         return false;
      }
   }

   public boolean method12499(ServerWorld var1, MobEntity var2, long var3) {
      if (this.field19851 != null && this.field19852 != null) {
         Optional var7 = var2.getBrain().<Class8999>getMemory(MemoryModuleType.field39824);
         Class6990 var8 = var2.method4230();
         return !var8.method21664() && var7.isPresent() && !this.method12663(var2, (Class8999)var7.get());
      } else {
         return false;
      }
   }

   public void method12506(ServerWorld var1, MobEntity var2, long var3) {
      if (var2.getBrain().method21404(MemoryModuleType.field39824)
         && !this.method12663(var2, var2.getBrain().<Class8999>getMemory(MemoryModuleType.field39824).get())
         && var2.method4230().method21677()) {
         this.field19850 = var1.method6814().nextInt(40);
      }

      var2.method4230().method21666();
      var2.getBrain().method21405(MemoryModuleType.field39824);
      var2.getBrain().method21405(MemoryModuleType.field39831);
      this.field19851 = null;
   }

   public void method12502(ServerWorld var1, MobEntity var2, long var3) {
      var2.getBrain().method21406(MemoryModuleType.field39831, this.field19851);
      var2.method4230().method21656(this.field19851, (double)this.field19853);
   }

   public void method12504(ServerWorld var1, MobEntity var2, long var3) {
      Class8238 var7 = var2.method4230().method21657();
      Brain<?> var8 = var2.getBrain();
      if (this.field19851 != var7) {
         this.field19851 = var7;
         var8.method21406(MemoryModuleType.field39831, var7);
      }

      if (var7 != null && this.field19852 != null) {
         Class8999 var9 = var8.getMemory(MemoryModuleType.field39824).get();
         if (var9.method33251().method26357().distanceSq(this.field19852) > 4.0 && this.method12662(var2, var9, var1.getGameTime())) {
            this.field19852 = var9.method33251().method26357();
            this.method12502(var1, var2, var3);
         }
      }
   }

   private boolean method12662(MobEntity var1, Class8999 var2, long var3) {
      BlockPos var7 = var2.method33251().method26357();
      this.field19851 = var1.method4230().method21651(var7, 0);
      this.field19853 = var2.method33252();
      Brain var8 = var1.getBrain();
      if (!this.method12663(var1, var2)) {
         boolean var9 = this.field19851 != null && this.field19851.method28708();
         if (!var9) {
            if (!var8.method21404(MemoryModuleType.field39841)) {
               var8.method21406(MemoryModuleType.field39841, var3);
            }
         } else {
            var8.method21405(MemoryModuleType.field39841);
         }

         if (this.field19851 != null) {
            return true;
         }

         Vector3d var10 = Class8037.method27587((CreatureEntity)var1, 10, 7, Vector3d.method11330(var7));
         if (var10 != null) {
            this.field19851 = var1.method4230().method21648(var10.x, var10.y, var10.z, 0);
            return this.field19851 != null;
         }
      } else {
         var8.method21405(MemoryModuleType.field39841);
      }

      return false;
   }

   private boolean method12663(MobEntity var1, Class8999 var2) {
      return var2.method33251().method26357().manhattanDistance(var1.getPosition()) <= var2.method33253();
   }
}
