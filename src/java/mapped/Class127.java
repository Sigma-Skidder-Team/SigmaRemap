package mapped;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface Class127 extends Class126, BiFunction<ItemStack, Class7812, ItemStack> {
   Class7128 method368();

   static Consumer<ItemStack> method369(BiFunction<ItemStack, Class7812, ItemStack> var0, Consumer<ItemStack> var1, Class7812 var2) {
      return var3 -> var1.accept(var0.apply(var3, var2));
   }
}
