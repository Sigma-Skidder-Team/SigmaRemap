package mapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3663 extends Class3639 {
   public Class3663(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var4 = super.registerBlockEntities(var1);
      var1.registerSimple(var4, "minecraft:jigsaw");
      return var4;
   }
}
