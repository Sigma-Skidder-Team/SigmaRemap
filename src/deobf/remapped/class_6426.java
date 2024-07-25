package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList.CompoundListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class class_6426 extends DataFix {
   public class_6426(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      CompoundListType var3 = DSL.compoundList(DSL.string(), this.getInputSchema().getType(class_4002.field_19431));
      OpticFinder var4 = var3.finder();
      return this.method_29363(var3);
   }

   private <SF> TypeRewriteRule method_29363(CompoundListType<String, SF> var1) {
      Type var4 = this.getInputSchema().getType(class_4002.field_19449);
      Type var5 = this.getInputSchema().getType(class_4002.field_19431);
      OpticFinder var6 = var4.findField("Level");
      OpticFinder var7 = var6.type().findField("Structures");
      OpticFinder var8 = var7.type().findField("Starts");
      OpticFinder var9 = var1.finder();
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "NewVillageFix",
            var4,
            var4x -> var4x.updateTyped(
                  var6,
                  var3x -> var3x.updateTyped(
                        var7,
                        var2xx -> var2xx.updateTyped(
                                 var8,
                                 var1xxxx -> var1xxxx.update(
                                       var9,
                                       var0xxxx -> var0xxxx.stream()
                                             .filter(var0xxxxx -> !Objects.equals(var0xxxxx.getFirst(), "Village"))
                                             .<Pair>map(
                                                var0xxxxx -> var0xxxxx.mapFirst(var0xxxxxx -> !var0xxxxxx.equals("New_Village") ? var0xxxxxx : "Village")
                                             )
                                             .collect(Collectors.toList())
                                    )
                              )
                              .update(
                                 DSL.remainderFinder(),
                                 var0xxx -> var0xxx.update(
                                       "References",
                                       var0xxxx -> {
                                          Optional var3xx = var0xxxx.get("New_Village").result();
                                          return ((Dynamic)DataFixUtils.orElse(
                                                var3xx.<Dynamic>map(var1xxxx -> var0xxxx.remove("New_Village").set("Village", var1xxxx)), var0xxxx
                                             ))
                                             .remove("Village");
                                       }
                                    )
                              )
                     )
               )
         ),
         this.fixTypeEverywhereTyped(
            "NewVillageStartFix",
            var5,
            var0 -> var0.update(
                  DSL.remainderFinder(),
                  var0x -> var0x.update(
                        "id",
                        var0xx -> !Objects.equals(class_5178.method_23742(var0xx.asString("")), "minecraft:new_village")
                              ? var0xx
                              : var0xx.createString("minecraft:village")
                     )
               )
         )
      );
   }
}
