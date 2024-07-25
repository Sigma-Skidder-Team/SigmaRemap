package remapped;

import java.util.function.Predicate;

public class class_2978<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
   private static String[] field_14667;
   private boolean field_14666 = true;

   public class_2978(AbstractRaiderEntity var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<LivingEntity> var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_13645(boolean var1) {
      this.field_14666 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_14666 && super.method_16795();
   }
}
