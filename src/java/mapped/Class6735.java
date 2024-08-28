package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6735 extends Class6717 {
   public Class6735(Schema var1, boolean var2) {
      super(var1, var2, "EntityWolfColorFix", Class8239.field35391, "minecraft:wolf");
   }

   public Dynamic<?> method20546(Dynamic<?> var1) {
      return var1.update("CollarColor", var0 -> var0.createByte((byte)(15 - var0.asInt(0))));
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20546);
   }
}
