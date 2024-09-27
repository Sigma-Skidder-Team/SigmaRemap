package net.minecraft.util.datafix.fixes;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;

import java.util.Map;
import java.util.Objects;

public class EntityRavagerRenameFix extends TypedEntityRenameHelper {
   public static final Map<String, String> field27832 = ImmutableMap.<String, String>builder().put("minecraft:illager_beast_spawn_egg", "minecraft:ravager_spawn_egg").build();

   public EntityRavagerRenameFix(Schema var1, boolean var2) {
      super("EntityRavagerRenameFix", var1, var2);
   }

   @Override
   public String rename(String var1) {
      return !Objects.equals("minecraft:illager_beast", var1) ? var1 : "minecraft:ravager";
   }
}
