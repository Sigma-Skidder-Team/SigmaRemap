package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6730 extends Class6717 {
   public Class6730(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityBannerColorFix", Class8239.field35386, "minecraft:banner");
   }

   public Dynamic<?> method20533(Dynamic<?> var1) {
      var1 = var1.update("Base", var0 -> var0.createInt(15 - var0.asInt(0)));
      return var1.update(
         "Patterns",
         var0 -> DataFixUtils.orElse(
               var0.asStreamOpt()
                  .map(var0x -> var0x.map(var0xx -> var0xx.update("Color", var0xxx -> var0xxx.createInt(15 - var0xxx.asInt(0)))))
                  .map(var0::createList)
                  .result(),
               var0
            )
      );
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20533);
   }
}
