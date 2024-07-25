package remapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public final class class_8780 implements Codec<class_6746<E>> {
   public class_8780(Codec var1) {
      this.field_44937 = var1;
   }

   public <T> DataResult<Pair<class_6746<E>, T>> decode(DynamicOps<T> var1, T var2) {
      Dynamic var5 = new Dynamic(var1, var2);
      return var5.get("data")
         .flatMap(this.field_44937::parse)
         .map(var1x -> new class_6746(var1x, var5.get("weight").asInt(1), null))
         .map(var1x -> Pair.of(var1x, var1.empty()));
   }

   public <T> DataResult<T> encode(class_6746<E> var1, DynamicOps<T> var2, T var3) {
      return var2.mapBuilder()
         .add("weight", var2.createInt(class_6746.method_30898(var1)))
         .add("data", this.field_44937.encodeStart(var2, class_6746.method_30905(var1)))
         .build(var3);
   }
}
