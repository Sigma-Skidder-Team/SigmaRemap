package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;

public class class_5421 extends DataFix {
   public class_5421(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static class_8792 method_24646(String var0) {
      return !var0.equals("health") ? class_8792.field_44983 : class_8792.field_44982;
   }

   public TypeRewriteRule makeRule() {
      Type var3 = DSL.named(class_4002.field_19443.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(class_4002.field_19443))) {
         return this.fixTypeEverywhere("ObjectiveRenderTypeFix", var3, var0 -> var0x -> var0x.mapSecond(var0xx -> {
                  Optional var3x = var0xx.get("RenderType").asString().result();
                  if (var3x.isPresent()) {
                     return var0xx;
                  } else {
                     String var4 = var0xx.get("CriteriaName").asString("");
                     class_8792 var5 = method_24646(var4);
                     return var0xx.set("RenderType", var0xx.createString(var5.method_40390()));
                  }
               }));
      } else {
         throw new IllegalStateException("Objective type is not what was expected.");
      }
   }
}
