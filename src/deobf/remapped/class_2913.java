package remapped;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface class_2913 extends class_2790, BiFunction<ItemStack, class_2792, ItemStack> {
   class_1404 method_13321();

   static Consumer<ItemStack> method_13320(BiFunction<ItemStack, class_2792, ItemStack> var0, Consumer<ItemStack> var1, class_2792 var2) {
      return var3 -> var1.accept(var0.apply(var3, var2));
   }
}
