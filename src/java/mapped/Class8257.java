package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class8257 extends Schema {
   public Class8257(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(false, Class8239.field35398, () -> DSL.constType(Class3639.method12354()));
      var1.registerType(
         false,
         Class8239.field35377,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", Class8239.field35390.in(var1)),
               "Inventory",
               DSL.list(Class8239.field35387.in(var1)),
               "EnderItems",
               DSL.list(Class8239.field35387.in(var1)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  Class8239.field35390.in(var1),
                  "ShoulderEntityRight",
                  Class8239.field35390.in(var1),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(Class8239.field35398.in(var1)), "toBeDisplayed", DSL.list(Class8239.field35398.in(var1)))
               )
            )
      );
      var1.registerType(false, Class8239.field35379, () -> DSL.compoundList(DSL.list(Class8239.field35387.in(var1))));
   }
}
