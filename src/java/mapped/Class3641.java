package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3641 extends Class3639 {
   public Class3641(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var1.registerSimple(var4, "minecraft:egg");
      var1.registerSimple(var4, "minecraft:ender_pearl");
      var1.registerSimple(var4, "minecraft:fireball");
      var1.register(var4, "minecraft:potion", var1x -> DSL.optionalFields("Potion", Class8239.field35387.in(var1)));
      var1.registerSimple(var4, "minecraft:small_fireball");
      var1.registerSimple(var4, "minecraft:snowball");
      var1.registerSimple(var4, "minecraft:wither_skull");
      var1.registerSimple(var4, "minecraft:xp_bottle");
      var1.register(var4, "minecraft:arrow", () -> DSL.optionalFields("inBlockState", Class8239.field35388.in(var1)));
      var1.register(var4, "minecraft:enderman", () -> DSL.optionalFields("carriedBlockState", Class8239.field35388.in(var1), Class9674.method37738(var1)));
      var1.register(
         var4,
         "minecraft:falling_block",
         () -> DSL.optionalFields("BlockState", Class8239.field35388.in(var1), "TileEntityData", Class8239.field35386.in(var1))
      );
      var1.register(var4, "minecraft:spectral_arrow", () -> DSL.optionalFields("inBlockState", Class8239.field35388.in(var1)));
      var1.register(
         var4,
         "minecraft:chest_minecart",
         () -> DSL.optionalFields("DisplayState", Class8239.field35388.in(var1), "Items", DSL.list(Class8239.field35387.in(var1)))
      );
      var1.register(var4, "minecraft:commandblock_minecart", () -> DSL.optionalFields("DisplayState", Class8239.field35388.in(var1)));
      var1.register(var4, "minecraft:furnace_minecart", () -> DSL.optionalFields("DisplayState", Class8239.field35388.in(var1)));
      var1.register(
         var4,
         "minecraft:hopper_minecart",
         () -> DSL.optionalFields("DisplayState", Class8239.field35388.in(var1), "Items", DSL.list(Class8239.field35387.in(var1)))
      );
      var1.register(var4, "minecraft:minecart", () -> DSL.optionalFields("DisplayState", Class8239.field35388.in(var1)));
      var1.register(var4, "minecraft:spawner_minecart", () -> DSL.optionalFields("DisplayState", Class8239.field35388.in(var1), Class8239.field35394.in(var1)));
      var1.register(var4, "minecraft:tnt_minecart", () -> DSL.optionalFields("DisplayState", Class8239.field35388.in(var1)));
      return var4;
   }
}
