package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_5867 {
   private static String[] field_29800;
   private final Map<class_4739, class_1929<?>> field_29799 = Maps.newEnumMap(class_4739.class);

   private class_5867() {
   }

   public <T extends class_1977> class_5867 method_26727(class_4739 var1, class_1929<T> var2) {
      this.field_29799.put(var1, var2);
      return this;
   }
}
