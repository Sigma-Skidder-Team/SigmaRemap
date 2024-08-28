package mapped;

import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;

import java.util.Collection;
import java.util.OptionalInt;

public interface Class4383 {
   Collection<ResourceLocation> method13746(RegistryKey<? extends Registry<?>> var1);

   <E> DataResult<Pair<E, OptionalInt>> method13747(DynamicOps<JsonElement> var1, RegistryKey<? extends Registry<E>> var2, RegistryKey<E> var3, Decoder<E> var4);

   static Class4383 method13751(Class191 var0) {
      return new Class4384(var0);
   }
}
