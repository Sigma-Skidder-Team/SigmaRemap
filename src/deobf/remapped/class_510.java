package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class_510 extends DataFix {
   public class_510(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19431);
      return this.fixTypeEverywhereTyped("Structure Reference Fix", var3, var0 -> var0.update(DSL.remainderFinder(), class_510::method_2528));
   }

   private static <T> Dynamic<T> method_2528(Dynamic<T> var0) {
      return var0.update("references", var0x -> var0x.createInt(var0x.asNumber().map(Number::intValue).result().filter(var0xx -> var0xx > 0).orElse(1)));
   }
}
