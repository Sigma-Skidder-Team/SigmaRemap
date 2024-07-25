package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_676 extends class_5178 {
   public class_676(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var1.register(
         var4,
         "minecraft:wandering_trader",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(class_4002.field_19433.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes",
                  DSL.list(
                     DSL.optionalFields(
                        "buy", class_4002.field_19433.in(var1), "buyB", class_4002.field_19433.in(var1), "sell", class_4002.field_19433.in(var1)
                     )
                  )
               ),
               class_9276.method_42737(var1)
            )
      );
      var1.register(
         var4,
         "minecraft:trader_llama",
         var1x -> DSL.optionalFields(
               "Items",
               DSL.list(class_4002.field_19433.in(var1)),
               "SaddleItem",
               class_4002.field_19433.in(var1),
               "DecorItem",
               class_4002.field_19433.in(var1),
               class_9276.method_42737(var1)
            )
      );
      return var4;
   }
}
