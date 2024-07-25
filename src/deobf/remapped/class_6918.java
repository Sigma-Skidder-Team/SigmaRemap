package remapped;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.PrimitiveCodec;

public final class class_6918 implements PrimitiveCodec<String> {
   public <T> DataResult<String> read(DynamicOps<T> var1, T var2) {
      return var1.getStringValue(var2).map(class_5178::method_23742);
   }

   public <T> T write(DynamicOps<T> var1, String var2) {
      return (T)var1.createString(var2);
   }

   @Override
   public String toString() {
      return "NamespacedString";
   }
}
