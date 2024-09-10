package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6721 extends Class6717 {
   public Class6721(Schema var1, String var2) {
      super(var1, false, "Gossip for for " + var2, TypeReferences.ENTITY, var2);
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> var0.update(
               "Gossips",
               var0x -> DataFixUtils.orElse(
                     var0x.asStreamOpt()
                        .result()
                        .map(
                           var0xx -> var0xx.map(
                                 var0xxx -> Class7114.method22158(var0xxx, "Target", "Target").orElse((Dynamic<?>)var0xxx)
                              )
                        )
                        .map(var0x::createList),
                     var0x
                  )
            )
      );
   }
}
