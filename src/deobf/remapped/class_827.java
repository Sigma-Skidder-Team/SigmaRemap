package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class class_827 extends class_9785 {
   public static final Map<String, String> field_4361 = ImmutableMap.builder()
      .put("minecraft:zombie_pigman_spawn_egg", "minecraft:zombified_piglin_spawn_egg")
      .build();

   public class_827(Schema var1) {
      super("EntityZombifiedPiglinRenameFix", var1, true);
   }

   @Override
   public String method_45177(String var1) {
      return !Objects.equals("minecraft:zombie_pigman", var1) ? var1 : "minecraft:zombified_piglin";
   }
}
