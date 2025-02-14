package mapped;

import net.minecraft.item.ItemStack;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Class128 implements ILootFunction {
   public final ILootCondition[] field441;
   private final Predicate<LootContext> field442;

   public Class128(ILootCondition[] var1) {
      this.field441 = var1;
      this.field442 = Class8582.<LootContext>method30665(var1);
   }

   public final ItemStack apply(ItemStack var1, LootContext var2) {
      return !this.field442.test(var2) ? var1 : this.method371(var1, var2);
   }

   public abstract ItemStack method371(ItemStack var1, LootContext var2);

   @Override
   public void method367(Class8478 var1) {
      ILootFunction.super.method367(var1);

      for (int var4 = 0; var4 < this.field441.length; var4++) {
         this.field441[var4].method367(var1.method29956(".conditions[" + var4 + "]"));
      }
   }

   public static Class5876<?> method372(Function<ILootCondition[], ILootFunction> var0) {
      return new Class5884(var0);
   }
}
