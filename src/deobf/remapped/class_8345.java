package remapped;

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

public class class_8345 extends DataFix {
   public class_8345(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> method_38429(Dynamic<?> var1) {
      if ("MobSpawner".equals(var1.get("id").asString(""))) {
         Optional var4 = var1.get("EntityId").asString().result();
         if (var4.isPresent()) {
            Dynamic var5 = (Dynamic)DataFixUtils.orElse(var1.get("SpawnData").result(), var1.emptyMap());
            var5 = var5.set("id", var5.createString(!((String)var4.get()).isEmpty() ? (String)var4.get() : "Pig"));
            var1 = var1.set("SpawnData", var5);
            var1 = var1.remove("EntityId");
         }

         Optional var8 = var1.get("SpawnPotentials").asStreamOpt().result();
         if (var8.isPresent()) {
            var1 = var1.set(
               "SpawnPotentials",
               var1.createList(
                  ((Stream)var8.get())
                     .<Dynamic>map(
                        var0 -> {
                           Optional var3 = var0.get("Type").asString().result();
                           if (!var3.isPresent()) {
                              return (Dynamic)var0;
                           } else {
                              Dynamic var4x = ((Dynamic)DataFixUtils.orElse(var0.get("Properties").result(), var0.emptyMap()))
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
      Type var3 = this.getOutputSchema().getType(class_4002.field_19453);
      return this.fixTypeEverywhereTyped("MobSpawnerEntityIdentifiersFix", this.getInputSchema().getType(class_4002.field_19453), var3, var2 -> {
         Dynamic var5 = (Dynamic)var2.get(DSL.remainderFinder());
         var5 = var5.set("id", var5.createString("MobSpawner"));
         DataResult var6 = var3.readTyped(this.method_38429(var5));
         return var6.result().isPresent() ? (Typed)((Pair)var6.result().get()).getFirst() : var2;
      });
   }
}
