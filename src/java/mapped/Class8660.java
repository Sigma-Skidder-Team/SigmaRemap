package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

import java.util.Objects;
import java.util.Optional;

public class Class8660 extends DataFix {
   public Class8660(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static Class2316 method31175(String var0) {
      return !var0.equals("health") ? Class2316.field15868 : Class2316.field15869;
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> var3 = DSL.named(Class8239.field35396.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(Class8239.field35396))) {
         return this.fixTypeEverywhere("ObjectiveRenderTypeFix", var3, var0 -> var0x -> var0x.mapSecond(var0xx -> {
                  Optional var3x = var0xx.get("RenderType").asString().result();
                  if (var3x.isPresent()) {
                     return var0xx;
                  } else {
                     String var4 = var0xx.get("CriteriaName").asString("");
                     Class2316 var5 = method31175(var4);
                     return var0xx.set("RenderType", var0xx.createString(var5.method9088()));
                  }
               }));
      } else {
         throw new IllegalStateException("Objective type is not what was expected.");
      }
   }
}
