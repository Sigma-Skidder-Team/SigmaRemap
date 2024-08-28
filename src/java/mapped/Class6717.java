package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public abstract class Class6717 extends DataFix {
   private final String field29435;
   private final String field29436;
   private final TypeReference field29437;

   public Class6717(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2);
      this.field29435 = var3;
      this.field29437 = var4;
      this.field29436 = var5;
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.namedChoice(this.field29436, this.getInputSchema().getChoiceType(this.field29437, this.field29436));
      return this.fixTypeEverywhereTyped(
         this.field29435,
         this.getInputSchema().getType(this.field29437),
         this.getOutputSchema().getType(this.field29437),
         var2 -> var2.updateTyped(var3, this.getOutputSchema().getChoiceType(this.field29437, this.field29436), this::method20508)
      );
   }

   public abstract Typed<?> method20508(Typed<?> var1);
}
