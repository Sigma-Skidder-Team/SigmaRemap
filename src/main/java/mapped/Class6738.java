package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

public class Class6738 extends Class6717 {
   public Class6738(Schema var1, boolean var2) {
      super(var1, var2, "StriderGravityFix", TypeReferences.ENTITY, "minecraft:strider");
   }

   public Dynamic<?> method20551(Dynamic<?> var1) {
      return !var1.get("NoGravity").asBoolean(false) ? var1 : var1.set("NoGravity", var1.createBoolean(false));
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20551);
   }
}
