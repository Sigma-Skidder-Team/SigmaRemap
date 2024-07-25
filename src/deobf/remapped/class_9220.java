package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class class_9220 extends class_7449 {
   public class_9220(Schema var1, String var2) {
      super(var1, false, "Gossip for for " + var2, class_4002.field_19444, var2);
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> var0.update(
               "Gossips",
               var0x -> (Dynamic)DataFixUtils.orElse(
                     var0x.asStreamOpt()
                        .result()
                        .<Stream<Dynamic>>map(
                           var0xx -> var0xx.<Dynamic>map(
                                 var0xxx -> (Dynamic)class_7784.method_35321((Dynamic<?>)var0xxx, "Target", "Target").orElse((Dynamic<?>)var0xxx)
                              )
                        )
                        .map(var0x::createList),
                     var0x
                  )
            )
      );
   }
}
