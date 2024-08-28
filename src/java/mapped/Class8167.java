package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

import java.util.Objects;
import java.util.function.Function;

public class Class8167 extends DataFix {
   private final String field35146;
   private final Function<String, String> field35147;

   public Class8167(Schema var1, boolean var2, String var3, Function<String, String> var4) {
      super(var1, var2);
      this.field35146 = var3;
      this.field35147 = var4;
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, String>> var3 = DSL.named(Class8239.field35398.typeName(), Class3639.method12354());
      if (Objects.equals(var3, this.getInputSchema().getType(Class8239.field35398))) {
         return this.fixTypeEverywhere(this.field35146, var3, var1 -> var1x -> var1x.mapSecond(this.field35147));
      } else {
         throw new IllegalStateException("Recipe type is not what was expected.");
      }
   }
}
