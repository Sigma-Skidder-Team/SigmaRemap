package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class Class8434 extends DataFix {
   private static final Map<String, String> field36145 = ImmutableMap.<String, String>builder()
      .put("down", "down_south")
      .put("up", "up_north")
      .put("north", "north_up")
      .put("south", "south_up")
      .put("west", "west_up")
      .put("east", "east_up")
      .build();

   public Class8434(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static Dynamic<?> method29645(Dynamic<?> var0) {
      Optional var3 = var0.get("Name").asString().result();
      return !var3.equals(Optional.<String>of("minecraft:jigsaw")) ? var0 : var0.update("Properties", var0x -> {
         String var3x = var0x.get("facing").asString("north");
         return var0x.remove("facing").set("orientation", var0x.createString(field36145.getOrDefault(var3x, var3x)));
      });
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "jigsaw_rotation_fix", this.getInputSchema().getType(TypeReferences.field35388), var0 -> var0.update(DSL.remainderFinder(), Class8434::method29645)
      );
   }
}
