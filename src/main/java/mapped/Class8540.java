package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Objects;
import java.util.Optional;

public class Class8540 extends DataFix {
   public Class8540(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> var3 = this.getInputSchema().getType(TypeReferences.ITEM_STACK);
      OpticFinder<Pair<String, String>> var4 = DSL.fieldFinder("id", DSL.named(TypeReferences.ITEM_NAME.typeName(), Class3639.method12354()));
      OpticFinder<?> var5 = var3.findField("tag");
      return this.fixTypeEverywhereTyped("ItemInstanceMapIdFix", var3, var2 -> {
         Optional<Pair<String, String>> var5x = var2.getOptional(var4);
         if (var5x.isPresent() && Objects.equals(((Pair)var5x.get()).getSecond(), "minecraft:filled_map")) {
            Dynamic<?> var6 = var2.get(DSL.remainderFinder());
            Typed<?> var7 = var2.getOrCreateTyped(var5);
            Dynamic var8 = var7.get(DSL.remainderFinder());
            var8 = var8.set("map", var8.createInt(var6.get("Damage").asInt(0)));
            return var2.set(var5, var7.set(DSL.remainderFinder(), var8));
         } else {
            return var2;
         }
      });
   }
}
