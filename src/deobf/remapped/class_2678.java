package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_2678 extends class_5178 {
   public class_2678(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var1.registerSimple(var4, "minecraft:egg");
      var1.registerSimple(var4, "minecraft:ender_pearl");
      var1.registerSimple(var4, "minecraft:fireball");
      var1.register(var4, "minecraft:potion", var1x -> DSL.optionalFields("Potion", class_4002.field_19433.in(var1)));
      var1.registerSimple(var4, "minecraft:small_fireball");
      var1.registerSimple(var4, "minecraft:snowball");
      var1.registerSimple(var4, "minecraft:wither_skull");
      var1.registerSimple(var4, "minecraft:xp_bottle");
      var1.register(var4, "minecraft:arrow", () -> DSL.optionalFields("inBlockState", class_4002.field_19435.in(var1)));
      var1.register(var4, "minecraft:enderman", () -> DSL.optionalFields("carriedBlockState", class_4002.field_19435.in(var1), class_9276.method_42737(var1)));
      var1.register(
         var4,
         "minecraft:falling_block",
         () -> DSL.optionalFields("BlockState", class_4002.field_19435.in(var1), "TileEntityData", class_4002.field_19434.in(var1))
      );
      var1.register(var4, "minecraft:spectral_arrow", () -> DSL.optionalFields("inBlockState", class_4002.field_19435.in(var1)));
      var1.register(
         var4,
         "minecraft:chest_minecart",
         () -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      var1.register(var4, "minecraft:commandblock_minecart", () -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1)));
      var1.register(var4, "minecraft:furnace_minecart", () -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1)));
      var1.register(
         var4,
         "minecraft:hopper_minecart",
         () -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      var1.register(var4, "minecraft:minecart", () -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1)));
      var1.register(
         var4, "minecraft:spawner_minecart", () -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1), class_4002.field_19453.in(var1))
      );
      var1.register(var4, "minecraft:tnt_minecart", () -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1)));
      return var4;
   }
}
