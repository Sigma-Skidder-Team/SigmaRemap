package remapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public class class_9015 extends DataFix {
   private static final Set<String> field_46117 = ImmutableSet.of(
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

   public class_9015(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "WallPropertyFix", this.getInputSchema().getType(class_4002.field_19435), var0 -> var0.update(DSL.remainderFinder(), class_9015::method_41371)
      );
   }

   private static String method_41370(String var0) {
      return !"true".equals(var0) ? "none" : "low";
   }

   private static <T> Dynamic<T> method_41372(Dynamic<T> var0, String var1) {
      return var0.update(
         var1, var0x -> (Dynamic)DataFixUtils.orElse(var0x.asString().result().<String>map(class_9015::method_41370).map(var0x::createString), var0x)
      );
   }

   private static <T> Dynamic<T> method_41371(Dynamic<T> var0) {
      boolean var3 = var0.get("Name").asString().result().filter(field_46117::contains).isPresent();
      return var3 ? var0.update("Properties", var0x -> {
         Dynamic var3x = method_41372(var0x, "east");
         var3x = method_41372(var3x, "west");
         var3x = method_41372(var3x, "north");
         return method_41372(var3x, "south");
      }) : var0;
   }
}
