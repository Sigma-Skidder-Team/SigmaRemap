package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_1104 extends class_7449 {
   public class_1104(Schema var1, boolean var2) {
      super(var1, var2, "EntityItemFrameDirectionFix", class_4002.field_19444, "minecraft:item_frame");
   }

   public Dynamic<?> method_4907(Dynamic<?> var1) {
      return var1.set("Facing", var1.createByte(method_4908(var1.get("Facing").asByte((byte)0))));
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_4907);
   }

   private static byte method_4908(byte var0) {
      switch (var0) {
         case 0:
            return 3;
         case 1:
            return 4;
         case 2:
         default:
            return 2;
         case 3:
            return 5;
      }
   }
}
