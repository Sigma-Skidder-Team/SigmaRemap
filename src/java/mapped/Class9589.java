package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Objects;

public class Class9589 extends DataFix {
   private static final Map<String, String> field44862 = ImmutableMap.<String, String>builder()
      .put("structure_references", "empty")
      .put("biomes", "empty")
      .put("base", "surface")
      .put("carved", "carvers")
      .put("liquid_carved", "liquid_carvers")
      .put("decorated", "features")
      .put("lighted", "light")
      .put("mobs_spawned", "spawn")
      .put("finalized", "heightmaps")
      .put("fullchunk", "full")
      .build();

   public Class9589(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(Class8239.field35378);
      Type var4 = var3.findFieldType("Level");
      OpticFinder var5 = DSL.fieldFinder("Level", var4);
      return this.fixTypeEverywhereTyped(
         "ChunkStatusFix2", var3, this.getOutputSchema().getType(Class8239.field35378), var1 -> var1.updateTyped(var5, var0x -> {
               Dynamic var3x = (Dynamic)var0x.get(DSL.remainderFinder());
               String var4x = var3x.get("Status").asString("empty");
               String var5x = field44862.getOrDefault(var4x, "empty");
               return !Objects.equals(var4x, var5x) ? var0x.set(DSL.remainderFinder(), var3x.set("Status", var3x.createString(var5x))) : var0x;
            })
      );
   }
}
