package mapped;

import java.util.function.Predicate;

public abstract class Class3262 extends Class3257 {
   public static final Predicate<ItemStack> field18748 = var0 -> var0.method32107().method11743(Class5985.field26119);
   public static final Predicate<ItemStack> field18749 = field18748.or(var0 -> var0.method32107() == Class8514.field38068);

   public Class3262(Class5643 var1) {
      super(var1);
   }

   public Predicate<ItemStack> method11751() {
      return this.method11752();
   }

   public abstract Predicate<ItemStack> method11752();

   public static ItemStack method11774(Class880 var0, Predicate<ItemStack> var1) {
      if (!var1.test(var0.getHeldItem(Hand.field183))) {
         return !var1.test(var0.getHeldItem(Hand.field182)) ? ItemStack.EMPTY : var0.getHeldItem(Hand.field182);
      } else {
         return var0.getHeldItem(Hand.field183);
      }
   }

   @Override
   public int method11736() {
      return 1;
   }

   public abstract int method11771();
}