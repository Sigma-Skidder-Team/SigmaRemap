package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

public class Class6724 extends Class6717 {
   public Class6724(Schema var1, boolean var2) {
      super(var1, var2, "EntityArmorStandSilentFix", TypeReferences.ENTITY, "ArmorStand");
   }

   public Dynamic<?> method20523(Dynamic<?> var1) {
      return var1.get("Silent").asBoolean(false) && !var1.get("Marker").asBoolean(false) ? var1.remove("Silent") : var1;
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20523);
   }
}
