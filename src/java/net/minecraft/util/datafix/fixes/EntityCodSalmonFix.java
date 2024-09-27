package net.minecraft.util.datafix.fixes;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;

import java.util.Map;

public class EntityCodSalmonFix extends TypedEntityRenameHelper {
   public static final Map<String, String> field27830 = ImmutableMap.<String, String>builder()
      .put("minecraft:salmon_mob", "minecraft:salmon")
      .put("minecraft:cod_mob", "minecraft:cod")
      .build();
   public static final Map<String, String> field27831 = ImmutableMap.<String, String>builder()
      .put("minecraft:salmon_mob_spawn_egg", "minecraft:salmon_spawn_egg")
      .put("minecraft:cod_mob_spawn_egg", "minecraft:cod_spawn_egg")
      .build();

   public EntityCodSalmonFix(Schema var1, boolean var2) {
      super("EntityCodSalmonFix", var1, var2);
   }

   @Override
   public String rename(String var1) {
      return field27830.getOrDefault(var1, var1);
   }
}
