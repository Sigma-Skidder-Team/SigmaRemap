package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6740 extends Class6717 {
   public Class6740(Schema var1, boolean var2) {
      super(var1, var2, "Colorless shulker entity fix", Class8239.field35391, "minecraft:shulker");
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.get("Color").asInt(0) != 10 ? var0 : var0.set("Color", var0.createByte((byte)16)));
   }
}
