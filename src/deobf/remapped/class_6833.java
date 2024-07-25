package remapped;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.function.Supplier;

public final class class_6833<E> implements Codec<Supplier<E>> {
   private final class_5621<? extends class_8669<E>> field_35230;
   private final Codec<E> field_35229;
   private final boolean field_35231;

   public static <E> class_6833<E> method_31333(class_5621<? extends class_8669<E>> var0, Codec<E> var1) {
      return method_31335(var0, var1, true);
   }

   public static <E> Codec<List<Supplier<E>>> method_31334(class_5621<? extends class_8669<E>> var0, Codec<E> var1) {
      return Codec.either(method_31335(var0, var1, false).listOf(), var1.xmap(var0x -> () -> var0x, Supplier::get).listOf())
         .xmap(var0x -> (List)var0x.map(var0xx -> var0xx, var0xx -> var0xx), Either::left);
   }

   private static <E> class_6833<E> method_31335(class_5621<? extends class_8669<E>> var0, Codec<E> var1, boolean var2) {
      return new class_6833<E>(var0, var1, var2);
   }

   private class_6833(class_5621<? extends class_8669<E>> var1, Codec<E> var2, boolean var3) {
      this.field_35230 = var1;
      this.field_35229 = var2;
      this.field_35231 = var3;
   }

   public <T> DataResult<T> encode(Supplier<E> var1, DynamicOps<T> var2, T var3) {
      return !(var2 instanceof class_8876)
         ? this.field_35229.encode(var1.get(), var2, var3)
         : ((class_8876)var2).method_40844(var1.get(), var3, this.field_35230, this.field_35229);
   }

   public <T> DataResult<Pair<Supplier<E>, T>> decode(DynamicOps<T> var1, T var2) {
      return !(var1 instanceof class_888)
         ? this.field_35229.decode(var1, var2).map(var0 -> var0.mapFirst(var0x -> () -> var0x))
         : ((class_888)var1).<E>method_3827(var2, this.field_35230, this.field_35229, this.field_35231);
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.field_35230 + " " + this.field_35229 + "]";
   }
}
