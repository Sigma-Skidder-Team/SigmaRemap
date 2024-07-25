package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;

public class class_8741 extends class_7449 {
   public class_8741(Schema var1) {
      super(var1, false, "EntityShulkerRotationFix", class_4002.field_19444, "minecraft:shulker");
   }

   public Dynamic<?> method_40132(Dynamic<?> var1) {
      List var4 = var1.get("Rotation").asList(var0 -> var0.asDouble(180.0));
      if (var4.isEmpty()) {
         return var1;
      } else {
         var4.set(0, (Double)var4.get(0) - 180.0);
         return var1.set("Rotation", var1.createList(var4.stream().map(var1::createDouble)));
      }
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_40132);
   }
}
