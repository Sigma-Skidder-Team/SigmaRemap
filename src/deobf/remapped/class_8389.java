package remapped;

import java.util.function.Predicate;

public class class_8389 implements Predicate<Entity> {
   private static String[] field_42913;
   private final ItemStack field_42912;

   public class_8389(ItemStack var1) {
      this.field_42912 = var1;
   }

   public boolean test(Entity var1) {
      if (var1.isAlive()) {
         if (var1 instanceof LivingEntity) {
            LivingEntity var4 = (LivingEntity)var1;
            return var4.method_26612(this.field_42912);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
