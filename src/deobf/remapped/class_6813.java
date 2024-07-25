package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_6813 extends Schema {
   public class_6813(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         class_4002.field_19436,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", class_4002.field_19451.in(var1)),
               "Inventory",
               DSL.list(class_4002.field_19433.in(var1)),
               "EnderItems",
               DSL.list(class_4002.field_19433.in(var1))
            )
      );
      var1.registerType(
         true, class_4002.field_19451, () -> DSL.optionalFields("Passengers", DSL.list(class_4002.field_19451.in(var1)), class_4002.field_19444.in(var1))
      );
   }
}
