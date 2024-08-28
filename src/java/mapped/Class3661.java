package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3661 extends Class3639 {
   public Class3661(int var1, Schema var2) {
      super(var1, var2);
   }

   private static void method12467(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(
         var1,
         var2,
         () -> DSL.optionalFields(
               "Items", DSL.list(Class8239.field35387.in(var0)), "RecipesUsed", DSL.compoundList(Class8239.field35398.in(var0), DSL.constType(DSL.intType()))
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var4 = super.registerBlockEntities(var1);
      method12467(var1, var4, "minecraft:furnace");
      method12467(var1, var4, "minecraft:smoker");
      method12467(var1, var4, "minecraft:blast_furnace");
      return var4;
   }
}
