package remapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_9651 extends Schema {
   public class_9651(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method_44529(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class_9276.method_42737(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      method_44529(var1, var4, "PolarBear");
      return var4;
   }
}
