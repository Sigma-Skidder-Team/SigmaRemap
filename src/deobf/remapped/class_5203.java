package remapped;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.stream.Stream;

public final class class_5203<E> extends MapCodec<class_8669<E>> {
   private final class_5621<? extends class_8669<E>> field_26744;

   public static <E> class_5203<E> method_23878(class_5621<? extends class_8669<E>> var0) {
      return new class_5203<E>(var0);
   }

   private class_5203(class_5621<? extends class_8669<E>> var1) {
      this.field_26744 = var1;
   }

   public <T> RecordBuilder<T> encode(class_8669<E> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return var3;
   }

   public <T> DataResult<class_8669<E>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      return !(var1 instanceof class_888) ? DataResult.error("Not a registry ops") : ((class_888)var1).<E>method_3823(this.field_26744);
   }

   public String toString() {
      return "RegistryLookupCodec[" + this.field_26744 + "]";
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.<T>empty();
   }
}
