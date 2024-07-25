package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class class_3088 extends class_9785 {
   public static final Map<String, String> field_15308 = ImmutableMap.builder().put("minecraft:illager_beast_spawn_egg", "minecraft:ravager_spawn_egg").build();

   public class_3088(Schema var1, boolean var2) {
      super("EntityRavagerRenameFix", var1, var2);
   }

   @Override
   public String method_45177(String var1) {
      return !Objects.equals("minecraft:illager_beast", var1) ? var1 : "minecraft:ravager";
   }
}
