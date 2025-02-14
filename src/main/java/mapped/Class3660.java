package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Map;
import java.util.function.Supplier;

public class Class3660 extends Class3639 {
   public Class3660(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var4 = super.registerBlockEntities(var1);
      var1.register(var4, "minecraft:trapped_chest", () -> DSL.optionalFields("Items", DSL.list(TypeReferences.ITEM_STACK.in(var1))));
      return var4;
   }
}
