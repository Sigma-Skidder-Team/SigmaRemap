package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3668 extends Class3639 {
   public Class3668(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method12479(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> Class9674.method37738(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      method12479(var1, var4, "minecraft:turtle");
      method12479(var1, var4, "minecraft:cod_mob");
      method12479(var1, var4, "minecraft:tropical_fish");
      method12479(var1, var4, "minecraft:salmon_mob");
      method12479(var1, var4, "minecraft:puffer_fish");
      method12479(var1, var4, "minecraft:phantom");
      method12479(var1, var4, "minecraft:dolphin");
      method12479(var1, var4, "minecraft:drowned");
      var1.register(var4, "minecraft:trident", var1x -> DSL.optionalFields("inBlockState", TypeReferences.field35388.in(var1)));
      return var4;
   }
}
