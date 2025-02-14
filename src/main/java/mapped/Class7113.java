package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import net.minecraft.util.datafix.TypeReferences;

public class Class7113 extends Class7114 {
   public Class7113(Schema var1) {
      super(var1, TypeReferences.SAVED_DATA);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "SavedDataUUIDFix",
         this.getInputSchema().getType(this.field30634),
         var0 -> var0.updateTyped(
               var0.getType().findField("data"),
               var0x -> var0x.update(
                     DSL.remainderFinder(),
                     var0xx -> var0xx.update(
                           "Raids",
                           var0xxx -> var0xxx.createList(
                                 var0xxx.asStream()
                                    .map(
                                       var0xxxx -> var0xxxx.update(
                                             "HeroesOfTheVillage",
                                             var0xxxxx -> var0xxxxx.createList(
                                                   var0xxxxx.asStream()
                                                      .map(
                                                         var0xxxxxx -> method22161(var0xxxxxx, "UUIDMost", "UUIDLeast").orElseGet(() -> {
                                                               field30633.warn("HeroesOfTheVillage contained invalid UUIDs.");
                                                               return var0xxxxxx;
                                                            })
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }
}
