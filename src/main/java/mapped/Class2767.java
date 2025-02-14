package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.List;

public class Class2767 extends Class2595 {
   private static String[] field17341;
   private final PufferfishEntity field17342;

   public Class2767(PufferfishEntity var1) {
      this.field17342 = var1;
   }

   @Override
   public boolean method10803() {
      List var3 = this.field17342.world.<LivingEntity>getEntitiesInAABBexcluding(LivingEntity.class, this.field17342.getBoundingBox().grow(2.0), PufferfishEntity.method4833());
      return !var3.isEmpty();
   }

   @Override
   public void startExecuting() {
      PufferfishEntity.method4834(this.field17342, 1);
      PufferfishEntity.method4835(this.field17342, 0);
   }

   @Override
   public void method10807() {
      PufferfishEntity.method4834(this.field17342, 0);
   }

   @Override
   public boolean method10806() {
      List var3 = this.field17342.world.<LivingEntity>getEntitiesInAABBexcluding(LivingEntity.class, this.field17342.getBoundingBox().grow(2.0), PufferfishEntity.method4833());
      return !var3.isEmpty();
   }
}
