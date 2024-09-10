package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3670 extends Class3639 {
   public Class3670(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method12484(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> Class9674.method37738(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      method12484(var1, var4, "minecraft:panda");
      var1.register(var4, "minecraft:pillager", var1x -> DSL.optionalFields("Inventory", DSL.list(TypeReferences.field35387.in(var1)), Class9674.method37738(var1)));
      return var4;
   }
}
