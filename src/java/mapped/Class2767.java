package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.List;

public class Class2767 extends Class2595 {
   private static String[] field17341;
   private final Class1054 field17342;

   public Class2767(Class1054 var1) {
      this.field17342 = var1;
   }

   @Override
   public boolean method10803() {
      List var3 = this.field17342.world.<LivingEntity>method6772(LivingEntity.class, this.field17342.getBoundingBox().method19664(2.0), Class1054.method4833());
      return !var3.isEmpty();
   }

   @Override
   public void method10804() {
      Class1054.method4834(this.field17342, 1);
      Class1054.method4835(this.field17342, 0);
   }

   @Override
   public void method10807() {
      Class1054.method4834(this.field17342, 0);
   }

   @Override
   public boolean method10806() {
      List var3 = this.field17342.world.<LivingEntity>method6772(LivingEntity.class, this.field17342.getBoundingBox().method19664(2.0), Class1054.method4833());
      return !var3.isEmpty();
   }
}
