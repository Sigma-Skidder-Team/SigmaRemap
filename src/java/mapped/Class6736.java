package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6736 extends Class6717 {
   public Class6736(Schema var1) {
      super(var1, false, "Villager Follow Range Fix", TypeReferences.ENTITY, "minecraft:villager");
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), Class6736::method20548);
   }

   private static Dynamic<?> method20548(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
               var1.asStream()
                  .map(
                     var0xx -> var0xx.get("Name").asString("").equals("generic.follow_range") && var0xx.get("Base").asDouble(0.0) == 16.0
                           ? var0xx.set("Base", var0xx.createDouble(48.0))
                           : var0xx
                  )
            )
      );
   }
}
