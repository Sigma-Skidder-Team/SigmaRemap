package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class Class8521 extends DataFix {
   public Class8521(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder var3 = DSL.fieldFinder("id", DSL.named(Class8239.field35393.typeName(), Class3639.method12354()));
      return this.fixTypeEverywhereTyped("BedItemColorFix", this.getInputSchema().getType(Class8239.field35387), var1 -> {
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
