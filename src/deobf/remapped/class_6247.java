package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class class_6247<T extends class_5521> extends class_1762<T, class_4094<T>> {
   private static final Map<EntityType<?>, Identifier> field_31962 = Maps.newHashMap(
      ImmutableMap.of(
         EntityType.field_34248, new Identifier("textures/entity/horse/donkey.png"), EntityType.field_34218, new Identifier("textures/entity/horse/mule.png")
      )
   );

   public class_6247(EntityRenderDispatcher var1, float var2) {
      super(var1, new class_4094<T>(0.0F), var2);
   }

   public Identifier method_28520(T var1) {
      return field_31962.get(var1.method_37387());
   }
}
