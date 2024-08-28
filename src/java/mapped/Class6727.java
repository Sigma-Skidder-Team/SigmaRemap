package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6727 extends Class6717 {
   public Class6727(Schema var1, boolean var2) {
      super(var1, var2, "Remove Golem Gossip Fix", Class8239.field35391, "minecraft:villager");
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), Class6727::method20527);
   }

   private static Dynamic<?> method20527(Dynamic<?> var0) {
      return var0.update("Gossips", var1 -> var0.createList(var1.asStream().filter(var0xx -> !var0xx.get("Type").asString("").equals("golem"))));
   }
}
