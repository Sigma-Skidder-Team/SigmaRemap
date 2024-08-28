package mapped;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface ILootFunction extends Class126, BiFunction<ItemStack, LootContext, ItemStack> {
   LootFunctionType getFunctionType();

   static Consumer<ItemStack> method369(BiFunction<ItemStack, LootContext, ItemStack> var0, Consumer<ItemStack> var1, LootContext var2) {
      return var3 -> var1.accept(var0.apply(var3, var2));
   }
}
