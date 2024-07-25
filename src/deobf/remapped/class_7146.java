package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_7146 extends class_7449 {
   public class_7146(Schema var1, boolean var2) {
      super(var1, var2, "EntityWolfColorFix", class_4002.field_19444, "minecraft:wolf");
   }

   public Dynamic<?> method_32793(Dynamic<?> var1) {
      return var1.update("CollarColor", var0 -> var0.createByte((byte)(15 - var0.asInt(0))));
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_32793);
   }
}
