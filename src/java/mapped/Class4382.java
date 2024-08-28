package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.*;
import com.mojang.serialization.DataResult.PartialResult;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public final class Class4382 implements Class4383 {
   private final Map<Class8705<?>, JsonElement> field21392 = Maps.newIdentityHashMap();
   private final Object2IntMap<Class8705<?>> field21393 = new Object2IntOpenCustomHashMap(Util.method38509());
   private final Map<Class8705<?>, Lifecycle> field21394 = Maps.newIdentityHashMap();

   public <E> void method13745(Class8905 var1, Class8705<E> var2, Encoder<E> var3, int var4, E var5, Lifecycle var6) {
      DataResult var9 = var3.encodeStart(Class6713.method20491(JsonOps.INSTANCE, var1), var5);
      Optional var10 = var9.error();
      if (!var10.isPresent()) {
         this.field21392.put(var2, (JsonElement)var9.result().get());
         this.field21393.put(var2, var4);
         this.field21394.put(var2, var6);
      } else {
         Class6711.method20490().error("Error adding element: {}", ((PartialResult)var10.get()).message());
      }
   }

   @Override
   public Collection<ResourceLocation> method13746(Class8705<? extends Class2348<?>> var1) {
      return this.field21392
         .keySet()
         .stream()
         .filter(var1x -> var1x.method31398(var1))
         .<ResourceLocation>map(
            var1x -> new ResourceLocation(var1x.method31399().method8293(), var1.method31399().method8292() + "/" + var1x.method31399().method8292() + ".json")
         )
         .collect(Collectors.<ResourceLocation>toList());
   }

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> method13747(
      DynamicOps<JsonElement> var1, Class8705<? extends Class2348<E>> var2, Class8705<E> var3, Decoder<E> var4
   ) {
      JsonElement var7 = this.field21392.get(var3);
      return var7 != null
         ? var4.parse(var1, var7).setLifecycle(this.field21394.get(var3)).map(var2x -> Pair.of(var2x, OptionalInt.of(this.field21393.getInt(var3))))
         : DataResult.error("Unknown element: " + var3);
   }
}
