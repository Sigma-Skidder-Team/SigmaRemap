package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class7117 extends Class7114 {
   public Class7117(Schema var1) {
      super(var1, Class8239.field35376);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelUUIDFix",
         this.getInputSchema().getType(this.field30634),
         var1 -> var1.updateTyped(DSL.remainderFinder(), var1x -> var1x.update(DSL.remainderFinder(), var1xx -> {
                  var1xx = this.method22183(var1xx);
                  var1xx = this.method22182(var1xx);
                  return this.method22181(var1xx);
               }))
      );
   }

   private Dynamic<?> method22181(Dynamic<?> var1) {
      return method22156(var1, "WanderingTraderId", "WanderingTraderId").orElse(var1);
   }

   private Dynamic<?> method22182(Dynamic<?> var1) {
      return var1.update(
         "DimensionData",
         var0 -> var0.updateMapValues(
               var0x -> var0x.mapSecond(var0xx -> var0xx.update("DragonFight", var0xxx -> method22158(var0xxx, "DragonUUID", "Dragon").orElse(var0xxx)))
            )
      );
   }

   private Dynamic<?> method22183(Dynamic<?> var1) {
      return var1.update(
         "CustomBossEvents",
         var0 -> var0.updateMapValues(
               var0x -> var0x.mapSecond(
                     var0xx -> var0xx.update(
                           "Players",
                           var1x -> var0xx.createList(var1x.asStream().map(var0xxxx -> method22160(var0xxxx).orElseGet(() -> {
                                    field30633.warn("CustomBossEvents contains invalid UUIDs.");
                                    return var0xxxx;
                                 })))
                        )
                  )
            )
      );
   }
}
