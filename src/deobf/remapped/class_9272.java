package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_9272 extends class_7449 {
   public class_9272(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityBannerColorFix", class_4002.field_19434, "minecraft:banner");
   }

   public Dynamic<?> method_42724(Dynamic<?> var1) {
      var1 = var1.update("Base", var0 -> var0.createInt(15 - var0.asInt(0)));
      return var1.update(
         "Patterns",
         var0 -> (Dynamic)DataFixUtils.orElse(
               var0.asStreamOpt()
                  .map(var0x -> var0x.<Dynamic>map(var0xx -> var0xx.update("Color", var0xxx -> var0xxx.createInt(15 - var0xxx.asInt(0)))))
                  .map(var0::createList)
                  .result(),
               var0
            )
      );
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_42724);
   }
}
