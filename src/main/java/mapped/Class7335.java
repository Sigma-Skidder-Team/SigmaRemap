package mapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;

public class Class7335 extends DataFix {
   private final String field31433;
   private final TypeReference field31434;

   public Class7335(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.field31433 = var2;
      this.field31434 = var3;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType var3 = this.getInputSchema().findChoiceType(this.field31434);
      TaggedChoiceType var4 = this.getOutputSchema().findChoiceType(this.field31434);
      return this.method23250(this.field31433, var3, var4);
   }

   public final <K> TypeRewriteRule method23250(String var1, TaggedChoiceType<K> var2, TaggedChoiceType<?> var3) {
      if (var2.getKeyType() == var3.getKeyType()) {
         return this.fixTypeEverywhere(var1, var2, var3, var2x -> var2xx -> {
               if (((TaggedChoiceType<K>)var3).hasType(var2xx.getFirst())) {
                  return ((Pair) var2xx);
               } else {
                  throw new IllegalArgumentException(String.format("Unknown type %s in %s ", var2xx.getFirst(), this.field31434));
               }
            });
      } else {
         throw new IllegalStateException("Could not inject: key type is not the same");
      }
   }
}
