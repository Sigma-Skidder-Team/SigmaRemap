package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6723 extends Class6717 {
   public Class6723(Schema var1, boolean var2) {
      super(var1, var2, "CatTypeFix", TypeReferences.ENTITY, "minecraft:cat");
   }

   public Dynamic<?> method20522(Dynamic<?> var1) {
      return var1.get("CatType").asInt(0) != 9 ? var1 : var1.set("CatType", var1.createInt(10));
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20522);
   }
}
