package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class class_4930 extends DataFix {
   public class_4930(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
      return this.fixTypeEverywhereTyped("BedItemColorFix", this.getInputSchema().getType(class_4002.field_19433), var1 -> {
         Optional var4 = var1.getOptional(var3);
         if (var4.isPresent() && Objects.equals(((Pair)var4.get()).getSecond(), "minecraft:bed")) {
            Dynamic var5 = (Dynamic)var1.get(DSL.remainderFinder());
            if (var5.get("Damage").asInt(0) == 0) {
               return var1.set(DSL.remainderFinder(), var5.set("Damage", var5.createShort((short)14)));
            }
         }

         return var1;
      });
   }
}
