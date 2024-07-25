package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_100 extends class_5178 {
   public class_100(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method_294(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class_9276.method_42737(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      method_294(var1, var4, "minecraft:bee");
      method_294(var1, var4, "minecraft:bee_stinger");
      return var4;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var4 = super.registerBlockEntities(var1);
      var1.register(
         var4,
         "minecraft:beehive",
         () -> DSL.optionalFields(
               "Items", DSL.list(class_4002.field_19433.in(var1)), "Bees", DSL.list(DSL.optionalFields("EntityData", class_4002.field_19451.in(var1)))
            )
      );
      return var4;
   }
}
