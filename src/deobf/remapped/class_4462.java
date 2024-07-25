package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_4462 extends class_7449 {
   public class_4462(Schema var1, boolean var2) {
      super(var1, var2, "StriderGravityFix", class_4002.field_19444, "minecraft:strider");
   }

   public Dynamic<?> method_20701(Dynamic<?> var1) {
      return !var1.get("NoGravity").asBoolean(false) ? var1 : var1.set("NoGravity", var1.createBoolean(false));
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_20701);
   }
}
