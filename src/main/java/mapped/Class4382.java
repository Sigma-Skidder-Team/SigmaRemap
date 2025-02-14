package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.*;
import com.mojang.serialization.DataResult.PartialResult;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public final class Class4382 implements Class4383 {
   private final Map<RegistryKey<?>, JsonElement> field21392 = Maps.newIdentityHashMap();
   private final Object2IntMap<RegistryKey<?>> field21393 = new Object2IntOpenCustomHashMap(Util.identityHashStrategy());
   private final Map<RegistryKey<?>, Lifecycle> field21394 = Maps.newIdentityHashMap();

   public <E> void method13745(DynamicRegistriesImpl var1, RegistryKey<E> var2, Encoder<E> var3, int var4, E var5, Lifecycle var6) {
      DataResult var9 = var3.encodeStart(WorldGenSettingsExport.create(JsonOps.INSTANCE, var1), var5);
      Optional var10 = var9.error();
      if (!var10.isPresent()) {
         this.field21392.put(var2, (JsonElement)var9.result().get());
         this.field21393.put(var2, var4);
         this.field21394.put(var2, var6);
      } else {
         WorldSettingsImport.method20490().error("Error adding element: {}", ((PartialResult)var10.get()).message());
      }
   }

   @Override
   public Collection<ResourceLocation> method13746(RegistryKey<? extends Registry<?>> var1) {
      return this.field21392
         .keySet()
         .stream()
         .filter(var1x -> var1x.method31398(var1))
         .<ResourceLocation>map(
            var1x -> new ResourceLocation(var1x.getLocation().getNamespace(), var1.getLocation().getPath() + "/" + var1x.getLocation().getPath() + ".json")
         )
         .collect(Collectors.<ResourceLocation>toList());
   }

   @Override
   public <E> DataResult<Pair<E, OptionalInt>> method13747(
           DynamicOps<JsonElement> var1, RegistryKey<? extends Registry<E>> var2, RegistryKey<E> var3, Decoder<E> var4
   ) {
      JsonElement var7 = this.field21392.get(var3);
      return var7 != null
         ? var4.parse(var1, var7).setLifecycle(this.field21394.get(var3)).map(var2x -> Pair.of(var2x, OptionalInt.of(this.field21393.getInt(var3))))
         : DataResult.error("Unknown element: " + var3);
   }
}
