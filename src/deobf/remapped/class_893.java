package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_893 extends class_7449 {
   public class_893(Schema var1, boolean var2) {
      super(var1, var2, "EntityShulkerColorFix", class_4002.field_19444, "minecraft:shulker");
   }

   public Dynamic<?> method_3848(Dynamic<?> var1) {
      return var1.get("Color").map(Dynamic::asNumber).result().isPresent() ? var1 : var1.set("Color", var1.createByte((byte)10));
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_3848);
   }
}
