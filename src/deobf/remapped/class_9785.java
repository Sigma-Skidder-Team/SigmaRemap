package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import java.util.Objects;

public abstract class class_9785 extends DataFix {
   private final String field_49663;

   public class_9785(String var1, Schema var2, boolean var3) {
      super(var2, var3);
      this.field_49663 = var1;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType var3 = this.getInputSchema().findChoiceType(class_4002.field_19444);
      TaggedChoiceType var4 = this.getOutputSchema().findChoiceType(class_4002.field_19444);
      Type var5 = DSL.named(class_4002.field_19446.typeName(), class_5178.method_23741());
      if (Objects.equals(this.getOutputSchema().getType(class_4002.field_19446), var5)) {
         return TypeRewriteRule.seq(this.fixTypeEverywhere(this.field_49663, var3, var4, var3x -> var3xx -> var3xx.mapFirst(var3xxx -> {
                  String var6 = this.method_45177(var3xxx);
                  Type var7 = (Type)var3.types().get(var3xxx);
                  Type var8 = (Type)var4.types().get(var6);
                  if (var8.equals(var7, true, true)) {
                     return var6;
                  } else {
                     throw new IllegalStateException(String.format("Dynamic type check failed: %s not equal to %s", var8, var7));
                  }
               })), this.fixTypeEverywhere(this.field_49663 + " for entity name", var5, var1 -> var1x -> var1x.mapSecond(this::method_45177)));
      } else {
         throw new IllegalStateException("Entity name type is not what was expected.");
      }
   }

   public abstract String method_45177(String var1);
}
