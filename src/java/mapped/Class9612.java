package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public class Class9612 extends DataFix {
   private static final Set<String> field44941 = ImmutableSet.of(
      "minecraft:andesite_wall",
      "minecraft:brick_wall",
      "minecraft:cobblestone_wall",
      "minecraft:diorite_wall",
      "minecraft:end_stone_brick_wall",
      "minecraft:granite_wall",
      new String[]{
         "minecraft:mossy_cobblestone_wall",
         "minecraft:mossy_stone_brick_wall",
         "minecraft:nether_brick_wall",
         "minecraft:prismarine_wall",
         "minecraft:red_nether_brick_wall",
         "minecraft:red_sandstone_wall",
         "minecraft:sandstone_wall",
         "minecraft:stone_brick_wall"
      }
   );

   public Class9612(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "WallPropertyFix", this.getInputSchema().getType(Class8239.field35388), var0 -> var0.update(DSL.remainderFinder(), Class9612::method37371)
      );
   }

   private static String method37369(String var0) {
      return !"true".equals(var0) ? "none" : "low";
   }

   private static <T> Dynamic<T> method37370(Dynamic<T> var0, String var1) {
      return var0.update(
         var1, var0x -> (Dynamic)DataFixUtils.orElse(var0x.asString().result().<String>map(Class9612::method37369).map(var0x::createString), var0x)
      );
   }

   private static <T> Dynamic<T> method37371(Dynamic<T> var0) {
      boolean var3 = var0.get("Name").asString().result().filter(field44941::contains).isPresent();
      return var3 ? var0.update("Properties", var0x -> {
         Dynamic var3x = method37370(var0x, "east");
         var3x = method37370(var3x, "west");
         var3x = method37370(var3x, "north");
         return method37370(var3x, "south");
      }) : var0;
   }
}
