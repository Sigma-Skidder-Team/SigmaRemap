package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class class_3513 extends class_1762<class_4109, class_3192<class_4109>> {
   private static final Map<EntityType<?>, Identifier> field_17229 = Maps.newHashMap(
      ImmutableMap.of(
         EntityType.field_34268,
         new Identifier("textures/entity/horse/horse_zombie.png"),
         EntityType.field_34261,
         new Identifier("textures/entity/horse/horse_skeleton.png")
      )
   );

   public class_3513(EntityRenderDispatcher var1) {
      super(var1, new class_3192<class_4109>(0.0F), 1.0F);
   }

   public Identifier method_16190(class_4109 var1) {
      return field_17229.get(var1.method_37387());
   }
}
