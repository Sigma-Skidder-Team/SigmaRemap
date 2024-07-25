package remapped;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class class_6885 implements AutoCloseable {
   private static String[] field_35436;
   private final Map<class_4639, class_8359> field_35435;

   public class_6885(Collection<class_8359> var1) {
      this.field_35435 = var1.stream().collect(Collectors.toMap(class_8359::method_38519, Function.<class_8359>identity()));
   }

   public class_8359 method_31569(class_4639 var1) {
      return this.field_35435.get(var1);
   }

   public class_5155 method_31568(class_2843 var1) {
      return this.field_35435.get(var1.method_12946()).method_38528(var1.method_12948());
   }

   @Override
   public void close() {
      this.field_35435.values().forEach(class_8359::method_38518);
      this.field_35435.clear();
   }
}
