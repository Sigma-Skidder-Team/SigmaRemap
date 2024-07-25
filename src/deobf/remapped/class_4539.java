package remapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public final class class_4539<E> implements Codec<class_5383<E>> {
   private final Codec<class_5383<E>> field_22146;
   private final class_5621<? extends class_8669<E>> field_22148;
   private final Codec<E> field_22145;

   public static <E> class_4539<E> method_21069(class_5621<? extends class_8669<E>> var0, Lifecycle var1, Codec<E> var2) {
      return new class_4539<E>(var0, var1, var2);
   }

   private class_4539(class_5621<? extends class_8669<E>> var1, Lifecycle var2, Codec<E> var3) {
      this.field_22146 = class_5383.<E>method_24526(var1, var2, var3);
      this.field_22148 = var1;
      this.field_22145 = var3;
   }

   public <T> DataResult<T> encode(class_5383<E> var1, DynamicOps<T> var2, T var3) {
      return this.field_22146.encode(var1, var2, var3);
   }

   public <T> DataResult<Pair<class_5383<E>, T>> decode(DynamicOps<T> var1, T var2) {
      DataResult var5 = this.field_22146.decode(var1, var2);
      return !(var1 instanceof class_888)
         ? var5
         : var5.flatMap(
            var2x -> ((class_888)var1)
                  .<E>method_3829((class_5383<E>)var2x.getFirst(), this.field_22148, this.field_22145)
                  .map(var1xx -> Pair.of(var1xx, var2x.getSecond()))
         );
   }

   @Override
   public String toString() {
      return "RegistryDataPackCodec[" + this.field_22146 + " " + this.field_22148 + " " + this.field_22145 + "]";
   }
}
