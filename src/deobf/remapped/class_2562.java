package remapped;

import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
public interface class_2562 {
   class_2109 method_11639(class_6414 var1);

   default Identifier method_11640(class_6414 var1, BiConsumer<Identifier, Supplier<JsonElement>> var2) {
      return this.method_11639(var1).method_9873(var1, var2);
   }

   default Identifier method_11642(class_6414 var1, String var2, BiConsumer<Identifier, Supplier<JsonElement>> var3) {
      return this.method_11639(var1).method_9867(var1, var2, var3);
   }

   default class_2562 method_11641(Consumer<class_1685> var1) {
      return var2 -> this.method_11639(var2).method_9874(var1);
   }
}
