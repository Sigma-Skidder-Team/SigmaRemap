package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Optional;

public class Class3736 extends Class3676<AnimalEntity> {
   private static String[] field19854;
   private final EntityType<? extends AnimalEntity> field19855;
   private final float field19856;
   private long field19857;

   public Class3736(EntityType<? extends AnimalEntity> var1, float var2) {
      super(
         ImmutableMap.of(
            MemoryModuleType.field39819,
            Class2217.field14484,
            MemoryModuleType.field39829,
            Class2217.field14485,
            MemoryModuleType.field39824,
            Class2217.field14486,
            MemoryModuleType.field39825,
            Class2217.field14486
         ),
         325
      );
      this.field19855 = var1;
      this.field19856 = var2;
   }

   public boolean method12508(ServerWorld var1, AnimalEntity var2) {
      return var2.method4507() && this.method12666(var2).isPresent();
   }

   public void method12502(ServerWorld var1, AnimalEntity var2, long var3) {
      AnimalEntity var7 = this.method12666(var2).get();
      var2.getBrain().method21406(MemoryModuleType.field39829, var7);
      var7.getBrain().method21406(MemoryModuleType.field39829, var2);
      Class6983.method21569(var2, var7, this.field19856);
      int var8 = 275 + var2.getRNG().nextInt(50);
      this.field19857 = var3 + (long)var8;
   }

   public boolean method12499(ServerWorld var1, AnimalEntity var2, long var3) {
      if (!this.method12665(var2)) {
         return false;
      } else {
         AnimalEntity var7 = this.method12664(var2);
         return var7.isAlive() && var2.method4386(var7) && Class6983.method21570(var2.getBrain(), var7) && var3 <= this.field19857;
      }
   }

   public void method12504(ServerWorld var1, AnimalEntity var2, long var3) {
      AnimalEntity var7 = this.method12664(var2);
      Class6983.method21569(var2, var7, this.field19856);
      if (var2.isEntityInRange(var7, 3.0) && var3 >= this.field19857) {
         var2.method4509(var1, var7);
         var2.getBrain().method21405(MemoryModuleType.field39829);
         var7.getBrain().method21405(MemoryModuleType.field39829);
      }
   }

   public void method12506(ServerWorld var1, AnimalEntity var2, long var3) {
      var2.getBrain().method21405(MemoryModuleType.field39829);
      var2.getBrain().method21405(MemoryModuleType.field39824);
      var2.getBrain().method21405(MemoryModuleType.field39825);
      this.field19857 = 0L;
   }

   private AnimalEntity method12664(AnimalEntity var1) {
      return (AnimalEntity)var1.getBrain().<Class1045>getMemory(MemoryModuleType.field39829).get();
   }

   private boolean method12665(AnimalEntity var1) {
      Brain<?> var4 = var1.getBrain();
      return var4.method21404(MemoryModuleType.field39829) && var4.getMemory(MemoryModuleType.field39829).get().getType() == this.field19855;
   }

   private Optional<? extends AnimalEntity> method12666(AnimalEntity var1) {
      return var1.getBrain()
         .<List<LivingEntity>>getMemory(MemoryModuleType.field39819)
         .get()
         .stream()
         .filter(var1x -> var1x.getType() == this.field19855)
         .<AnimalEntity>map(var0 -> (AnimalEntity)var0)
         .filter(var1::method4386)
         .findFirst();
   }
}
