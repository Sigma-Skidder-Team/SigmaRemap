package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class8779 {
   private static String[] field39487;
   private final Map<Class1975, Class7417<?>> field39488 = Maps.newEnumMap(Class1975.class);

   public Class8779() {
   }

   public <T extends Class5104> Class8779 method31658(Class1975 var1, Class7417<T> var2) {
      this.field39488.put(var1, var2);
      return this;
   }

   // $VF: synthetic method
   public static Map<Class1975, Class7417<?>> method31659(Class8779 var0) {
      return var0.field39488;
   }
}
