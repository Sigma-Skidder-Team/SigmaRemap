package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3662 extends Class3639 {
   public Class3662(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var4 = super.registerBlockEntities(var1);
      method12469(var1, var4, "minecraft:barrel");
      method12469(var1, var4, "minecraft:smoker");
      method12469(var1, var4, "minecraft:blast_furnace");
      var1.register(var4, "minecraft:lectern", var1x -> DSL.optionalFields("Book", TypeReferences.field35387.in(var1)));
      var1.registerSimple(var4, "minecraft:bell");
      return var4;
   }

   public static void method12469(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(TypeReferences.field35387.in(var0))));
   }
}
