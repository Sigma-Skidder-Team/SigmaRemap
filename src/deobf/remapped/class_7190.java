package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_7190 extends class_7449 {
   public class_7190(Schema var1, boolean var2) {
      super(var1, var2, "CatTypeFix", class_4002.field_19444, "minecraft:cat");
   }

   public Dynamic<?> method_32935(Dynamic<?> var1) {
      return var1.get("CatType").asInt(0) != 9 ? var1 : var1.set("CatType", var1.createInt(10));
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_32935);
   }
}
