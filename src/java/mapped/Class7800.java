package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class Class7800 extends DataFix {
   public Class7800(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> var3 = DSL.named(Class8239.field35385.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(Class8239.field35385))) {
         return this.fixTypeEverywhere("POI rebuild", var3, var0 -> var0x -> var0x.mapSecond(Class7800::method26041));
      } else {
         throw new IllegalStateException("Poi type is not what was expected.");
      }
   }

   private static <T> Dynamic<T> method26041(Dynamic<T> var0) {
      return var0.update("Sections", var0x -> var0x.updateMapValues(var0xx -> var0xx.mapSecond(var0xxx -> var0xxx.remove("Valid"))));
   }
}
