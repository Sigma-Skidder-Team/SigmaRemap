package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Class9261 extends DataFix {
   public Class9261(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> var3 = DSL.named(TypeReferences.POI_CHUNK.typeName(), DSL.remainderType());
      if (Objects.equals(var3, this.getInputSchema().getType(TypeReferences.POI_CHUNK))) {
         return this.fixTypeEverywhere("POI reorganization", var3, var0 -> var0x -> var0x.mapSecond(Class9261::method34851));
      } else {
         throw new IllegalStateException("Poi type is not what was expected.");
      }
   }

   private static <T> Dynamic<T> method34851(Dynamic<T> var0) {
      Map<Dynamic<T>, Dynamic<T>> var3 = Maps.newHashMap();

      for (int var4 = 0; var4 < 16; var4++) {
         String var5 = String.valueOf(var4);
         Optional<Dynamic<T>> var6 = var0.get(var5).result();
         if (var6.isPresent()) {
            Dynamic<T> var7 = var6.get();
            Dynamic<T> var8 = var0.createMap(ImmutableMap.of(var0.createString("Records"), var7));
            var3.put(var0.createInt(var4), var8);
            var0 = var0.remove(var5);
         }
      }

      return var0.set("Sections", var0.createMap(var3));
   }
}
