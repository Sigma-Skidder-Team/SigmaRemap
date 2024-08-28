package mapped;

import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
public interface Class7732 {
   Class7524 method25590(Block var1);

   default ResourceLocation method25591(Block var1, BiConsumer<ResourceLocation, Supplier<JsonElement>> var2) {
      return this.method25590(var1).method24562(var1, var2);
   }

   default ResourceLocation method25592(Block var1, String var2, BiConsumer<ResourceLocation, Supplier<JsonElement>> var3) {
      return this.method25590(var1).method24563(var1, var2, var3);
   }

   default Class7732 method25593(Consumer<Class7287> var1) {
      return var2 -> this.method25590(var2).method24561(var1);
   }
}
