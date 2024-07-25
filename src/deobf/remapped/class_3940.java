package remapped;

import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.OptionalInt;

public interface class_3940 {
   Collection<class_4639> method_18209(class_5621<? extends class_8669<?>> var1);

   <E> DataResult<Pair<E, OptionalInt>> method_18208(
      DynamicOps<JsonElement> var1, class_5621<? extends class_8669<E>> var2, class_5621<E> var3, Decoder<E> var4
   );

   static class_3940 method_18207(class_7832 var0) {
      return new class_9410(var0);
   }
}
