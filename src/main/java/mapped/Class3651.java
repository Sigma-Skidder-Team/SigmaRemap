package mapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3651 extends Class3639 {
   public Class3651(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var4.put("minecraft:cod", var4.remove("minecraft:cod_mob"));
      var4.put("minecraft:salmon", var4.remove("minecraft:salmon_mob"));
      return var4;
   }
}
