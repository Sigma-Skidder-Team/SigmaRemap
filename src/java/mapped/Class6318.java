package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class Class6318 extends Class6319 {
   public static final Map<String, String> field27827 = ImmutableMap.<String, String>builder().put("minecraft:puffer_fish_spawn_egg", "minecraft:pufferfish_spawn_egg").build();

   public Class6318(Schema var1, boolean var2) {
      super("EntityPufferfishRenameFix", var1, var2);
   }

   @Override
   public String method19259(String var1) {
      return !Objects.equals("minecraft:puffer_fish", var1) ? var1 : "minecraft:pufferfish";
   }
}
