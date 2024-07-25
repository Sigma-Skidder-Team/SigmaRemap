package remapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;

public abstract class class_6131 extends DataFix {
   public final String field_31474;

   public class_6131(String var1, Schema var2, boolean var3) {
      super(var2, var3);
      this.field_31474 = var1;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType var3 = this.getInputSchema().findChoiceType(class_4002.field_19444);
      TaggedChoiceType var4 = this.getOutputSchema().findChoiceType(class_4002.field_19444);
      return this.fixTypeEverywhere(this.field_31474, var3, var4, var3x -> var4x -> {
            String var7 = (String)var4x.getFirst();
            Type var8 = (Type)var3.types().get(var7);
            Pair var9 = this.method_28172(var7, this.method_28174(var4x.getSecond(), var3x, var8));
            Type var10 = (Type)var4.types().get(var9.getFirst());
            if (var10.equals(((Typed)var9.getSecond()).getType(), true, true)) {
               return Pair.of(var9.getFirst(), ((Typed)var9.getSecond()).getValue());
            } else {
               throw new IllegalStateException(String.format("Dynamic type check failed: %s not equal to %s", var10, ((Typed)var9.getSecond()).getType()));
            }
         });
   }

   private <A> Typed<A> method_28174(Object var1, DynamicOps<?> var2, Type<A> var3) {
      return new Typed(var3, var2, var1);
   }

   public abstract Pair<String, Typed<?>> method_28172(String var1, Typed<?> var2);
}
