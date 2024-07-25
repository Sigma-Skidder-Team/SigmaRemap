package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class class_6247<T extends class_5521> extends class_1762<T, class_4094<T>> {
   private static final Map<class_6629<?>, class_4639> field_31962 = Maps.newHashMap(
      ImmutableMap.of(
         class_6629.field_34248, new class_4639("textures/entity/horse/donkey.png"), class_6629.field_34218, new class_4639("textures/entity/horse/mule.png")
      )
   );

   public class_6247(class_6122 var1, float var2) {
      super(var1, new class_4094<T>(0.0F), var2);
   }

   public class_4639 method_28520(T var1) {
      return field_31962.get(var1.method_37387());
   }
}
