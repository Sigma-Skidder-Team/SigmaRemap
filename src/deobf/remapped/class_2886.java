package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_2886 extends DataFix {
   public class_2886(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsAddTextBackgroundFix",
         this.getInputSchema().getType(class_4002.field_19442),
         var1 -> var1.update(
               DSL.remainderFinder(),
               var1x -> (Dynamic)DataFixUtils.orElse(
                     var1x.get("chatOpacity").asString().map(var2 -> var1x.set("textBackgroundOpacity", var1x.createDouble(this.method_13232(var2)))).result(),
                     var1x
                  )
            )
      );
   }

   private double method_13232(String var1) {
      try {
         double var4 = 0.9 * Double.parseDouble(var1) + 0.1;
         return var4 / 2.0;
      } catch (NumberFormatException var7) {
         return 0.5;
      }
   }
}
