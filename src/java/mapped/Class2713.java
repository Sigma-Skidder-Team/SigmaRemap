package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2713 extends Class2709<LivingEntity> {
   private static String[] field17187;

   public Class2713(Class1030 var1) {
      super(var1, LivingEntity.class, 0, true, true, LivingEntity::attackable);
   }

   @Override
   public boolean method10803() {
      return Class1030.method4593((Class1030)this.field17153) && super.method10803();
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field17153.method3022(0);
   }
}
