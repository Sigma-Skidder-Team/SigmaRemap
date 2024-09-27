package net.minecraft.util.datafix.fixes;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;

import java.util.Map;
import java.util.Objects;

public class ZombifiedPiglinRename extends TypedEntityRenameHelper {
   public static final Map<String, String> field27829 = ImmutableMap.<String, String>builder()
      .put("minecraft:zombie_pigman_spawn_egg", "minecraft:zombified_piglin_spawn_egg")
      .build();

   public ZombifiedPiglinRename(Schema var1) {
      super("EntityZombifiedPiglinRenameFix", var1, true);
   }

   @Override
   public String rename(String var1) {
      return !Objects.equals("minecraft:zombie_pigman", var1) ? var1 : "minecraft:zombified_piglin";
   }
}
