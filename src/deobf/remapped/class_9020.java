package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_9020 extends class_5363<class_9020> {
   private static String[] field_46141;
   private final Map<class_1425, class_7986> field_46140 = Maps.newHashMap();

   public class_9020 method_41385() {
      return this;
   }

   public class_9020 method_41386(class_1425 var1, class_7986 var2) {
      this.field_46140.put(var1, var2);
      return this;
   }

   @Override
   public class_2913 method_8947() {
      return new class_797(this.method_24475(), this.field_46140, null);
   }
}
