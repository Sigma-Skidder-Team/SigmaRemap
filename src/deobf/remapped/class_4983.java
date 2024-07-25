package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class class_4983 extends DataFix {
   public class_4983(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19433);
      OpticFinder var4 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
      OpticFinder var5 = var3.findField("tag");
      return this.fixTypeEverywhereTyped("ItemInstanceMapIdFix", var3, var2 -> {
         Optional var5x = var2.getOptional(var4);
         if (var5x.isPresent() && Objects.equals(((Pair)var5x.get()).getSecond(), "minecraft:filled_map")) {
            Dynamic var6 = (Dynamic)var2.get(DSL.remainderFinder());
            Typed var7 = var2.getOrCreateTyped(var5);
            Dynamic var8 = (Dynamic)var7.get(DSL.remainderFinder());
            var8 = var8.set("map", var8.createInt(var6.get("Damage").asInt(0)));
            return var2.set(var5, var7.set(DSL.remainderFinder(), var8));
         } else {
            return var2;
         }
      });
   }
}
