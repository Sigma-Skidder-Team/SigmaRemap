package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class Class8166 extends Class8167 {
   private static final Map<String, String> field35145 = ImmutableMap.<String, String>builder()
      .put("minecraft:acacia_bark", "minecraft:acacia_wood")
      .put("minecraft:birch_bark", "minecraft:birch_wood")
      .put("minecraft:dark_oak_bark", "minecraft:dark_oak_wood")
      .put("minecraft:jungle_bark", "minecraft:jungle_wood")
      .put("minecraft:oak_bark", "minecraft:oak_wood")
      .put("minecraft:spruce_bark", "minecraft:spruce_wood")
      .build();

   public Class8166(Schema var1, boolean var2) {
      super(var1, var2, "Recipes renamening fix", var0 -> field35145.getOrDefault(var0, var0));
   }
}
