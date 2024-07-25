package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class class_1650 extends class_4171<IronGolemEntity, class_7946<IronGolemEntity>> {
   private static final Map<class_440, Identifier> field_8577 = ImmutableMap.of(
      class_440.field_1840,
      new Identifier("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      class_440.field_1842,
      new Identifier("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      class_440.field_1844,
      new Identifier("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public class_1650(class_2514<IronGolemEntity, class_7946<IronGolemEntity>> var1) {
      super(var1);
   }

   public void method_7375(class_7966 var1, class_2565 var2, int var3, IronGolemEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method_37109()) {
         class_440 var13 = var4.method_36976();
         if (var13 != class_440.field_1847) {
            Identifier var14 = field_8577.get(var13);
            method_19348(this.method_19347(), var14, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
