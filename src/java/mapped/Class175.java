package mapped;

import java.util.function.Predicate;

public class Class175 implements Predicate<ItemStack> {
   private static String[] field559;
   private final Class7608<Item> field560;
   private final CompoundNBT field561;

   public Class175(Class7608<Item> var1, CompoundNBT var2) {
      this.field560 = var1;
      this.field561 = var2;
   }

   public boolean test(ItemStack var1) {
      return this.field560.method24917(var1.getItem()) && Class8354.method29280(this.field561, var1.method32142(), true);
   }
}
