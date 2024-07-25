package remapped;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface class_2913 extends class_2790, BiFunction<class_6098, class_2792, class_6098> {
   class_1404 method_13321();

   static Consumer<class_6098> method_13320(BiFunction<class_6098, class_2792, class_6098> var0, Consumer<class_6098> var1, class_2792 var2) {
      return var3 -> var1.accept(var0.apply(var3, var2));
   }
}
