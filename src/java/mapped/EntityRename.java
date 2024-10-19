package mapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import net.minecraft.util.datafix.TypeReferences;

public abstract class EntityRename extends DataFix {
   public final String field22194;

   public EntityRename(String var1, Schema var2, boolean var3) {
      super(var2, var3);
      this.field22194 = var1;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> var3 = (TaggedChoiceType<String>) this.getInputSchema().findChoiceType(TypeReferences.ENTITY);
      TaggedChoiceType<String> var4 = (TaggedChoiceType<String>) this.getOutputSchema().findChoiceType(TypeReferences.ENTITY);
      return this.fixTypeEverywhere(this.field22194, var3, var4, var3x -> var4x -> {
            String var7 = var4x.getFirst();
            Type<?> var8 = var3.types().get(var7);
            Pair<String, Typed<?>> var9 = this.method14620(var7, this.method14621(var4x.getSecond(), var3x, var8));
            Type<?> var10 = var4.types().get(var9.getFirst());
            if (var10.equals(var9.getSecond().getType(), true, true)) {
               return Pair.of(var9.getFirst(), ((Typed)var9.getSecond()).getValue());
            } else {
               throw new IllegalStateException(String.format("Dynamic type check failed: %s not equal to %s", var10, ((Typed)var9.getSecond()).getType()));
            }
         });
   }

   private <A> Typed<A> method14621(Object var1, DynamicOps<?> var2, Type<A> var3) {
      return new Typed(var3, var2, var1);
   }

   public abstract Pair<String, Typed<?>> method14620(String var1, Typed<?> var2);
}
