package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class9048 extends Schema {
   public Class9048(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         Class8239.field35377,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", Class8239.field35390.in(var1)),
               "Inventory",
               DSL.list(Class8239.field35387.in(var1)),
               "EnderItems",
               DSL.list(Class8239.field35387.in(var1))
            )
      );
      var1.registerType(
         true, Class8239.field35390, () -> DSL.optionalFields("Passengers", DSL.list(Class8239.field35390.in(var1)), Class8239.field35391.in(var1))
      );
   }
}
