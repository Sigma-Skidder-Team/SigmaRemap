package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class Class8823 extends DataFix {
   private final String field39785;
   private final Function<String, String> field39786;

   public Class8823(Schema var1, boolean var2, String var3, Function<String, String> var4) {
      super(var1, var2);
      this.field39785 = var3;
      this.field39786 = var4;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.field39785,
         this.getInputSchema().getType(Class8239.field35384),
         var1 -> var1.update(DSL.remainderFinder(), var1x -> var1x.updateMapValues(var2 -> {
                  String var5 = ((Dynamic)var2.getFirst()).asString("");
                  return var2.mapFirst(var3 -> var1x.createString(this.field39786.apply(var5)));
               }))
      );
   }
}
