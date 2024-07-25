package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class class_4313 extends class_7449 {
   public class_4313(Schema var1, boolean var2) {
      super(var1, var2, "Colorless shulker entity fix", class_4002.field_19444, "minecraft:shulker");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.get("Color").asInt(0) != 10 ? var0 : var0.set("Color", var0.createByte((byte)16)));
   }
}
