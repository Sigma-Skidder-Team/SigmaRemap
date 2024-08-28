package mapped;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.stream.Stream;

public final class Class8611<E> extends MapCodec<Class2348<E>> {
   private final Class8705<? extends Class2348<E>> field38730;

   public static <E> Class8611<E> method30859(Class8705<? extends Class2348<E>> var0) {
      return new Class8611<E>(var0);
   }

   private Class8611(Class8705<? extends Class2348<E>> var1) {
      this.field38730 = var1;
   }

   public <T> RecordBuilder<T> encode(Class2348<E> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return var3;
   }

   public <T> DataResult<Class2348<E>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      return !(var1 instanceof Class6711) ? DataResult.error("Not a registry ops") : ((Class6711)var1).<E>method20477(this.field38730);
   }

   public String toString() {
      return "RegistryLookupCodec[" + this.field38730 + "]";
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.<T>empty();
   }
}
