package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class class_4571 extends DataFix {
   private static final Map<String, String> field_22266 = ImmutableMap.builder()
      .put("down", "down_south")
      .put("up", "up_north")
      .put(field_22267[5], "north_up")
      .put("south", "south_up")
      .put("west", "west_up")
      .put("east", "east_up")
      .build();

   public class_4571(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static Dynamic<?> method_21215(Dynamic<?> var0) {
      Optional var3 = var0.get("Name").asString().result();
      return !var3.equals(Optional.<String>of("minecraft:jigsaw")) ? var0 : var0.update("Properties", var0x -> {
         String var3x = var0x.get("facing").asString("north");
         return var0x.remove("facing").set("orientation", var0x.createString(field_22266.getOrDefault(var3x, var3x)));
      });
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "jigsaw_rotation_fix", this.getInputSchema().getType(class_4002.field_19435), var0 -> var0.update(DSL.remainderFinder(), class_4571::method_21215)
      );
   }
}
