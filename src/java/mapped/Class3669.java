package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3669 extends Class3639 {
   public Class3669(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method12482(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(Class8239.field35387.in(var0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var4 = super.registerBlockEntities(var1);
      method12482(var1, var4, "minecraft:campfire");
      return var4;
   }
}
