package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.function.Supplier;

public final class Class7269<E> {
   private static String[] field31188;
   private final Map<Class8705<E>, DataResult<Supplier<E>>> field31189 = Maps.newIdentityHashMap();

   public Class7269() {
   }

   // $VF: synthetic method
   public static Map method22833(Class7269 var0) {
      return var0.field31189;
   }
}
