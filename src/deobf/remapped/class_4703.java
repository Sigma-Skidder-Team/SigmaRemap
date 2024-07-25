package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_4703 extends class_7449 {
   public class_4703(Schema var1) {
      super(var1, false, "Villager Follow Range Fix", class_4002.field_19444, "minecraft:villager");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class_4703::method_21679);
   }

   private static Dynamic<?> method_21679(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
               var1.asStream()
                  .<Dynamic>map(
                     var0xx -> var0xx.get("Name").asString("").equals("generic.follow_range") && var0xx.get("Base").asDouble(0.0) == 16.0
                           ? var0xx.set("Base", var0xx.createDouble(48.0))
                           : var0xx
                  )
            )
      );
   }
}
