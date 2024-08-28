package mapped;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.PrimitiveCodec;

public final class Class9075 implements PrimitiveCodec<String> {
   public <T> DataResult<String> read(DynamicOps<T> var1, T var2) {
      return var1.getStringValue(var2).map(Class3639::method12353);
   }

   public <T> T write(DynamicOps<T> var1, String var2) {
      return (T)var1.createString(var2);
   }

   @Override
   public String toString() {
      return "NamespacedString";
   }
}
