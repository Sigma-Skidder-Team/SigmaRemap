package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public final class Class9541<E> implements Codec<Class9030<E>> {
   public final Codec field44427;

   public Class9541(Codec var1) {
      this.field44427 = var1;
   }

   public <T> DataResult<Pair<Class9030<E>, T>> decode(DynamicOps<T> dynamicOps, T t) {
      Dynamic dynamic = new Dynamic(dynamicOps, t);
      return dynamic.get("data").flatMap(arg_0 -> (this.field44427).parse((Dynamic) arg_0)).map(object -> new Class9030(object, dynamic.get("weight").asInt(1))).map(class9030 -> Pair.of((Object)class9030, (Object)dynamicOps.empty()));
   }

   public <T> DataResult<T> encode(Class9030<E> class9030, DynamicOps<T> dynamicOps, T t) {
      return dynamicOps.mapBuilder().add("weight", dynamicOps.createInt(Class9030.method33437(class9030))).add("data", this.field44427.encodeStart(dynamicOps, Class9030.method33436(class9030))).build(t);
   }
}
