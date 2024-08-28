package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class Class6716 extends Class6717 {
   public Class6716(Schema var1, boolean var2) {
      super(var1, var2, "EntityShulkerColorFix", Class8239.field35391, "minecraft:shulker");
   }

   public Dynamic<?> method20507(Dynamic<?> var1) {
      return var1.get("Color").map(Dynamic::asNumber).result().isPresent() ? var1 : var1.set("Color", var1.createByte((byte)10));
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20507);
   }
}
