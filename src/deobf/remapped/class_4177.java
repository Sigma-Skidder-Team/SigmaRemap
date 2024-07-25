package remapped;

import java.util.function.Predicate;

public class class_4177 implements Predicate<ItemStack> {
   private static String[] field_20331;
   private final class_2307<class_2451> field_20329;
   private final CompoundNBT field_20330;

   public class_4177(class_2307<class_2451> var1, CompoundNBT var2) {
      this.field_20329 = var1;
      this.field_20330 = var2;
   }

   public boolean test(ItemStack var1) {
      return this.field_20329.method_10609(var1.method_27960()) && class_4338.method_20182(this.field_20330, var1.method_27990(), true);
   }
}
