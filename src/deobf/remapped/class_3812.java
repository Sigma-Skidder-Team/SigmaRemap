package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class class_3812 extends class_5735 {
   private static final Map<String, String> field_18658 = ImmutableMap.builder()
      .put("minecraft:acacia_bark", "minecraft:acacia_wood")
      .put("minecraft:birch_bark", "minecraft:birch_wood")
      .put("minecraft:dark_oak_bark", "minecraft:dark_oak_wood")
      .put("minecraft:jungle_bark", "minecraft:jungle_wood")
      .put("minecraft:oak_bark", "minecraft:oak_wood")
      .put("minecraft:spruce_bark", "minecraft:spruce_wood")
      .build();

   public class_3812(Schema var1, boolean var2) {
      super(var1, var2, "Recipes renamening fix", var0 -> field_18658.getOrDefault(var0, var0));
   }
}
