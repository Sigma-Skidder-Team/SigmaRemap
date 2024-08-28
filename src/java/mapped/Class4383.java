package mapped;

import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;

import java.util.Collection;
import java.util.OptionalInt;

public interface Class4383 {
   Collection<ResourceLocation> method13746(Class8705<? extends Class2348<?>> var1);

   <E> DataResult<Pair<E, OptionalInt>> method13747(DynamicOps<JsonElement> var1, Class8705<? extends Class2348<E>> var2, Class8705<E> var3, Decoder<E> var4);

   static Class4383 method13751(Class191 var0) {
      return new Class4384(var0);
   }
}
