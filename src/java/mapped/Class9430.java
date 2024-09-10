package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.Stream;

public class Class9430 extends DataFix {
   public Class9430(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> method36192(Dynamic<?> var1) {
      if ("MobSpawner".equals(var1.get("id").asString(""))) {
         Optional<String> var4 = var1.get("EntityId").asString().result();
         if (var4.isPresent()) {
            Dynamic<?> var5 = DataFixUtils.orElse(var1.get("SpawnData").result(), var1.emptyMap());
            var5 = var5.set("id", var5.createString(!((String)var4.get()).isEmpty() ? (String)var4.get() : "Pig"));
            var1 = var1.set("SpawnData", var5);
            var1 = var1.remove("EntityId");
         }

         Optional<? extends Stream<? extends Dynamic<?>>> var8 = var1.get("SpawnPotentials").asStreamOpt().result();
         if (var8.isPresent()) {
            var1 = var1.set(
               "SpawnPotentials",
               var1.createList(
                  var8.get().map(var0 -> {
                           Optional<String>  var3 = var0.get("Type").asString().result();
                           if (!var3.isPresent()) {
                              return var0;
                           } else {
                              Dynamic<?> var4x = (DataFixUtils.orElse(var0.get("Properties").result(), var0.emptyMap()))
                                 .set("id", var0.createString((String)var3.get()));
                              return var0.set("Entity", var4x).remove("Type").remove("Properties");
                           }
                        }
                     )
               )
            );
         }

         return var1;
      } else {
         return var1;
      }
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getOutputSchema().getType(TypeReferences.field35394);
      return this.fixTypeEverywhereTyped("MobSpawnerEntityIdentifiersFix", this.getInputSchema().getType(TypeReferences.field35394), var3, var2 -> {
         Dynamic var5 = (Dynamic)var2.get(DSL.remainderFinder());
         var5 = var5.set("id", var5.createString("MobSpawner"));
         DataResult var6 = var3.readTyped(this.method36192(var5));
         return var6.result().isPresent() ? (Typed)((Pair)var6.result().get()).getFirst() : var2;
      });
   }
}
