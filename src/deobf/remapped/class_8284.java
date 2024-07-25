package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.stream.Collectors;

public class class_8284 extends DataFix {
   public class_8284(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsKeyTranslationFix",
         this.getInputSchema().getType(class_4002.field_19442),
         var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.getMapValues().map(var1 -> var0x.createMap(var1.entrySet().stream().<Pair>map(var1x -> {
                     if (((Dynamic)var1x.getKey()).asString("").startsWith("key_")) {
                        String var4 = ((Dynamic)var1x.getValue()).asString("");
                        if (!var4.startsWith("key.mouse") && !var4.startsWith("scancode.")) {
                           return Pair.of(var1x.getKey(), var0x.createString("key.keyboard." + var4.substring("key.".length())));
                        }
                     }

                     return Pair.of(var1x.getKey(), var1x.getValue());
                  }).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))).result().orElse(var0x))
      );
   }
}
