package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_1395 extends class_7784 {
   public class_1395(Schema var1) {
      super(var1, class_4002.field_19448);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "SavedDataUUIDFix",
         this.getInputSchema().getType(this.field_39450),
         var0 -> var0.updateTyped(
               var0.getType().findField("data"),
               var0x -> var0x.update(
                     DSL.remainderFinder(),
                     var0xx -> var0xx.update(
                           "Raids",
                           var0xxx -> var0xxx.createList(
                                 var0xxx.asStream()
                                    .<Dynamic>map(
                                       var0xxxx -> var0xxxx.update(
                                             "HeroesOfTheVillage",
                                             var0xxxxx -> var0xxxxx.createList(
                                                   var0xxxxx.asStream()
                                                      .<Dynamic>map(
                                                         var0xxxxxx -> (Dynamic)method_35320((Dynamic<?>)var0xxxxxx, "UUIDMost", "UUIDLeast").orElseGet(() -> {
                                                               field_39451.warn("HeroesOfTheVillage contained invalid UUIDs.");
                                                               return (Dynamic<?>)var0xxxxxx;
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
