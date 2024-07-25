package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_7445 extends Schema {
   public class_7445(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var4.remove("EntityHorse");
      var1.register(
         var4,
         "Horse",
         () -> DSL.optionalFields("ArmorItem", class_4002.field_19433.in(var1), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1))
      );
      var1.register(
         var4,
         "Donkey",
         () -> DSL.optionalFields(
               "Items", DSL.list(class_4002.field_19433.in(var1)), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)
            )
      );
      var1.register(
         var4,
         "Mule",
         () -> DSL.optionalFields(
               "Items", DSL.list(class_4002.field_19433.in(var1)), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)
            )
      );
      var1.register(var4, "ZombieHorse", () -> DSL.optionalFields("SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)));
      var1.register(var4, "SkeletonHorse", () -> DSL.optionalFields("SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)));
      return var4;
   }
}
