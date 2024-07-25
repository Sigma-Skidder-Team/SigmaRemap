package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class class_9473 extends DataFix {
   private final String field_48304;
   private final Function<String, String> field_48303;

   public class_9473(Schema var1, boolean var2, String var3, Function<String, String> var4) {
      super(var1, var2);
      this.field_48304 = var3;
      this.field_48303 = var4;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.field_48304,
         this.getInputSchema().getType(class_4002.field_19438),
         var1 -> var1.update(DSL.remainderFinder(), var1x -> var1x.updateMapValues(var2 -> {
                  String var5 = ((Dynamic)var2.getFirst()).asString("");
                  return var2.mapFirst(var3 -> var1x.createString(this.field_48303.apply(var5)));
               }))
      );
   }
}
