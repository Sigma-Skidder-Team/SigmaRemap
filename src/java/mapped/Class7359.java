package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class7359 extends DataFix {
   private static String[] field31510;
   private final String field31511;
   private final String field31512;
   private final String field31513;

   public Class7359(Schema var1, boolean var2, String var3, String var4, String var5) {
      super(var1, var2);
      this.field31511 = var3;
      this.field31512 = var4;
      this.field31513 = var5;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.field31511,
         this.getInputSchema().getType(TypeReferences.field35380),
         var1 -> var1.update(
               DSL.remainderFinder(),
               var1x -> (Dynamic)DataFixUtils.orElse(
                     var1x.get(this.field31512).result().<Dynamic>map(var2 -> var1x.set(this.field31513, var2).remove(this.field31512)), var1x
                  )
            )
      );
   }
}
