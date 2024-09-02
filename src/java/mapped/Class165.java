package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class Class165 implements Predicate<Entity> {
   private static String[] field532;
   private final ItemStack field533;

   public Class165(ItemStack var1) {
      this.field533 = var1;
   }

   public boolean test(Entity var1) {
      if (var1.isAlive()) {
         if (var1 instanceof LivingEntity) {
            LivingEntity var4 = (LivingEntity)var1;
            return var4.method2980(this.field533);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
