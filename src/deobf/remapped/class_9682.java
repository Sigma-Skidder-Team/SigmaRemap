package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_9682 extends class_7784 {
   public class_9682(Schema var1) {
      super(var1, class_4002.field_19455);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelUUIDFix",
         this.getInputSchema().getType(this.field_39450),
         var1 -> var1.updateTyped(DSL.remainderFinder(), var1x -> var1x.update(DSL.remainderFinder(), var1xx -> {
                  var1xx = this.method_44770(var1xx);
                  var1xx = this.method_44771(var1xx);
                  return this.method_44769(var1xx);
               }))
      );
   }

   private Dynamic<?> method_44769(Dynamic<?> var1) {
      return method_35319(var1, "WanderingTraderId", "WanderingTraderId").orElse(var1);
   }

   private Dynamic<?> method_44771(Dynamic<?> var1) {
      return var1.update(
         "DimensionData",
         var0 -> var0.updateMapValues(
               var0x -> var0x.mapSecond(var0xx -> var0xx.update("DragonFight", var0xxx -> method_35321(var0xxx, "DragonUUID", "Dragon").orElse(var0xxx)))
            )
      );
   }

   private Dynamic<?> method_44770(Dynamic<?> var1) {
      return var1.update(
         "CustomBossEvents",
         var0 -> var0.updateMapValues(
               var0x -> var0x.mapSecond(
                     var0xx -> var0xx.update(
                           "Players",
                           var1x -> var0xx.createList(var1x.asStream().<Dynamic>map(var0xxxx -> (Dynamic)method_35326((Dynamic<?>)var0xxxx).orElseGet(() -> {
                                    field_39451.warn("CustomBossEvents contains invalid UUIDs.");
                                    return (Dynamic<?>)var0xxxx;
                                 })))
                        )
                  )
            )
      );
   }
}
