package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_5419 extends class_7449 {
   public class_5419(Schema var1, boolean var2) {
      super(var1, var2, "Remove Golem Gossip Fix", class_4002.field_19444, "minecraft:villager");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class_5419::method_24641);
   }

   private static Dynamic<?> method_24641(Dynamic<?> var0) {
      return var0.update("Gossips", var1 -> var0.createList(var1.asStream().filter(var0xx -> !var0xx.get("Type").asString("").equals("golem"))));
   }
}
