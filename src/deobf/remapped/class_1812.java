package remapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;

public class class_1812 extends DataFix {
   private final String field_9212;
   private final TypeReference field_9210;

   public class_1812(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.field_9212 = var2;
      this.field_9210 = var3;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType var3 = this.getInputSchema().findChoiceType(this.field_9210);
      TaggedChoiceType var4 = this.getOutputSchema().findChoiceType(this.field_9210);
      return this.method_8046(this.field_9212, var3, var4);
   }

   public final <K> TypeRewriteRule method_8046(String var1, TaggedChoiceType<K> var2, TaggedChoiceType<?> var3) {
      if (var2.getKeyType() == var3.getKeyType()) {
         return this.fixTypeEverywhere(var1, var2, var3, var2x -> var2xx -> {
               if (var3.hasType(var2xx.getFirst())) {
                  return var2xx;
               } else {
                  throw new IllegalArgumentException(String.format("Unknown type %s in %s ", var2xx.getFirst(), this.field_9210));
               }
            });
      } else {
         throw new IllegalStateException("Could not inject: key type is not the same");
      }
   }
}
