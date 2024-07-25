package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class class_6071 extends class_7784 {
   public class_6071(Schema var1) {
      super(var1, class_4002.field_19436);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerUUIDFix",
         this.getInputSchema().getType(this.field_39450),
         var0 -> {
            OpticFinder var3 = var0.getType().findField("RootVehicle");
            return var0.updateTyped(
                  var3, var3.type(), var0x -> var0x.update(DSL.remainderFinder(), var0xx -> method_35321(var0xx, "Attach", "Attach").orElse(var0xx))
               )
               .update(DSL.remainderFinder(), var0x -> class_8306.method_38319(class_8306.method_38306(var0x)));
         }
      );
   }
}
