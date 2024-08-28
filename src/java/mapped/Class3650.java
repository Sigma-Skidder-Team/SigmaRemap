package mapped;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3650 extends Class3639 {
   public Class3650(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var4.put("minecraft:command_block_minecart", var4.remove("minecraft:commandblock_minecart"));
      var4.put("minecraft:end_crystal", var4.remove("minecraft:ender_crystal"));
      var4.put("minecraft:snow_golem", var4.remove("minecraft:snowman"));
      var4.put("minecraft:evoker", var4.remove("minecraft:evocation_illager"));
      var4.put("minecraft:evoker_fangs", var4.remove("minecraft:evocation_fangs"));
      var4.put("minecraft:illusioner", var4.remove("minecraft:illusion_illager"));
      var4.put("minecraft:vindicator", var4.remove("minecraft:vindication_illager"));
      var4.put("minecraft:iron_golem", var4.remove("minecraft:villager_golem"));
      var4.put("minecraft:experience_orb", var4.remove("minecraft:xp_orb"));
      var4.put("minecraft:experience_bottle", var4.remove("minecraft:xp_bottle"));
      var4.put("minecraft:eye_of_ender", var4.remove("minecraft:eye_of_ender_signal"));
      var4.put("minecraft:firework_rocket", var4.remove("minecraft:fireworks_rocket"));
      return var4;
   }
}
