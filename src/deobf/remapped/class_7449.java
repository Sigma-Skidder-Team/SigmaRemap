package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public abstract class class_7449 extends DataFix {
   private final String field_37954;
   private final String field_37953;
   private final TypeReference field_37952;

   public class_7449(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2);
      this.field_37954 = var3;
      this.field_37952 = var4;
      this.field_37953 = var5;
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.namedChoice(this.field_37953, this.getInputSchema().getChoiceType(this.field_37952, this.field_37953));
      return this.fixTypeEverywhereTyped(
         this.field_37954,
         this.getInputSchema().getType(this.field_37952),
         this.getOutputSchema().getType(this.field_37952),
         var2 -> var2.updateTyped(var3, this.getOutputSchema().getChoiceType(this.field_37952, this.field_37953), this::method_33892)
      );
   }

   public abstract Typed<?> method_33892(Typed<?> var1);
}
