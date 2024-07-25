package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class_2760 extends DataFix {
   public class_2760(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = DSL.named(class_4002.field_19447.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(class_4002.field_19447))) {
         return this.fixTypeEverywhere("POI rebuild", var3, var0 -> var0x -> var0x.mapSecond(class_2760::method_12562));
      } else {
         throw new IllegalStateException("Poi type is not what was expected.");
      }
   }

   private static <T> Dynamic<T> method_12562(Dynamic<T> var0) {
      return var0.update("Sections", var0x -> var0x.updateMapValues(var0xx -> var0xx.mapSecond(var0xxx -> var0xxx.remove("Valid"))));
   }
}
