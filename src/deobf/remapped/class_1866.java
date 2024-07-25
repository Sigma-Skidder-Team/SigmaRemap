package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_1866 extends DataFix {
   private static String[] field_9469;
   private final String field_9470;
   private final String field_9472;
   private final String field_9471;

   public class_1866(Schema var1, boolean var2, String var3, String var4, String var5) {
      super(var1, var2);
      this.field_9470 = var3;
      this.field_9472 = var4;
      this.field_9471 = var5;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.field_9470,
         this.getInputSchema().getType(class_4002.field_19442),
         var1 -> var1.update(
               DSL.remainderFinder(),
               var1x -> (Dynamic)DataFixUtils.orElse(
                     var1x.get(this.field_9472).result().<Dynamic>map(var2 -> var1x.set(this.field_9471, var2).remove(this.field_9472)), var1x
                  )
            )
      );
   }
}
