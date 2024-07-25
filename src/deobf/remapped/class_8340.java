package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class_8340 extends class_7449 {
   public class_8340(Schema var1, boolean var2) {
      super(var1, var2, "EntityArmorStandSilentFix", class_4002.field_19444, "ArmorStand");
   }

   public Dynamic<?> method_38401(Dynamic<?> var1) {
      return var1.get("Silent").asBoolean(false) && !var1.get("Marker").asBoolean(false) ? var1.remove("Silent") : var1;
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_38401);
   }
}
