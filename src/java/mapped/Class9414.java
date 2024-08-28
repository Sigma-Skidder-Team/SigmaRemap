package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.stream.Collectors;

public class Class9414 extends DataFix {
   public Class9414(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsKeyTranslationFix",
         this.getInputSchema().getType(Class8239.field35380),
         var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.getMapValues().<Dynamic<?>>map(var1 -> var0x.createMap(var1.entrySet().stream().map(var1x -> {
                     if ((var1x.getKey()).asString("").startsWith("key_")) {
                        String var4 = (var1x.getValue()).asString("");
                        if (!var4.startsWith("key.mouse") && !var4.startsWith("scancode.")) {
                           return Pair.of(var1x.getKey(), var0x.createString("key.keyboard." + var4.substring("key.".length())));
                        }
                     }

                     return Pair.of(var1x.getKey(), var1x.getValue());
                  }).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))).result().orElse(var0x))
      );
   }
}
