package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class8271 extends Schema {
   public Class8271(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         Class8239.field35394,
         () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", Class8239.field35390.in(var1))), "SpawnData", Class8239.field35390.in(var1))
      );
   }
}
