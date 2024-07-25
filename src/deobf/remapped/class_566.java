package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class class_566 extends class_9785 {
   public static final Map<String, String> field_3346 = ImmutableMap.builder().put("minecraft:puffer_fish_spawn_egg", "minecraft:pufferfish_spawn_egg").build();

   public class_566(Schema var1, boolean var2) {
      super("EntityPufferfishRenameFix", var1, var2);
   }

   @Override
   public String method_45177(String var1) {
      return !Objects.equals("minecraft:puffer_fish", var1) ? var1 : "minecraft:pufferfish";
   }
}
