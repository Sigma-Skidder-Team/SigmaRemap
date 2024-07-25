package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

public class class_7726 extends DataFix {
   public class_7726(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = DSL.named(class_4002.field_19447.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(class_4002.field_19447))) {
         return this.fixTypeEverywhere("POI reorganization", var3, var0 -> var0x -> var0x.mapSecond(class_7726::method_34965));
      } else {
         throw new IllegalStateException("Poi type is not what was expected.");
      }
   }

   private static <T> Dynamic<T> method_34965(Dynamic<T> var0) {
      HashMap var3 = Maps.newHashMap();

      for (int var4 = 0; var4 < 16; var4++) {
         String var5 = String.valueOf(var4);
         Optional var6 = var0.get(var5).result();
         if (var6.isPresent()) {
            Dynamic var7 = (Dynamic)var6.get();
            Dynamic var8 = var0.createMap(ImmutableMap.of(var0.createString("Records"), var7));
            var3.put(var0.createInt(var4), var8);
            var0 = var0.remove(var5);
         }
      }

      return var0.set("Sections", var0.createMap(var3));
   }
}
