package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

public class Class6718 extends Class6717 {
   public Class6718(Schema var1, boolean var2) {
      super(var1, var2, "EntityItemFrameDirectionFix", TypeReferences.ENTITY, "minecraft:item_frame");
   }

   public Dynamic<?> method20510(Dynamic<?> var1) {
      return var1.set("Facing", var1.createByte(method20511(var1.get("Facing").asByte((byte)0))));
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20510);
   }

   private static byte method20511(byte var0) {
      switch (var0) {
         case 0:
            return 3;
         case 1:
            return 4;
         case 2:
         default:
            return 2;
         case 3:
            return 5;
      }
   }
}
