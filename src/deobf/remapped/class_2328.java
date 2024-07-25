package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_2328 extends class_5178 {
   public class_2328(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method_10677(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class_9276.method_42737(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      method_10677(var1, var4, "minecraft:turtle");
      method_10677(var1, var4, "minecraft:cod_mob");
      method_10677(var1, var4, "minecraft:tropical_fish");
      method_10677(var1, var4, "minecraft:salmon_mob");
      method_10677(var1, var4, "minecraft:puffer_fish");
      method_10677(var1, var4, "minecraft:phantom");
      method_10677(var1, var4, "minecraft:dolphin");
      method_10677(var1, var4, "minecraft:drowned");
      var1.register(var4, "minecraft:trident", var1x -> DSL.optionalFields("inBlockState", class_4002.field_19435.in(var1)));
      return var4;
   }
}
