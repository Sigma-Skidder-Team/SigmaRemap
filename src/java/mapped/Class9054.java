package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.function.Supplier;

public final class Class9054<E> implements Codec<Supplier<E>> {
   private final RegistryKey<? extends Registry<E>> field41443;
   private final Codec<E> field41444;
   private final boolean field41445;

   public static <E> Class9054<E> method33671(RegistryKey<? extends Registry<E>> var0, Codec<E> var1) {
      return method33673(var0, var1, true);
   }

   public static <E> Codec<List<Supplier<E>>> method33672(RegistryKey<? extends Registry<E>> var0, Codec<E> var1) {
      return Codec.either(method33673(var0, var1, false).listOf(), var1.<Supplier<E>>xmap(var0x -> () -> var0x, Supplier::get).listOf())
         .xmap(var0x -> var0x.map(var0xx -> var0xx, var0xx -> var0xx), Either::left);
   }

   private static <E> Class9054<E> method33673(RegistryKey<? extends Registry<E>> var0, Codec<E> var1, boolean var2) {
      return new Class9054<E>(var0, var1, var2);
   }

   private Class9054(RegistryKey<? extends Registry<E>> var1, Codec<E> var2, boolean var3) {
      this.field41443 = var1;
      this.field41444 = var2;
      this.field41445 = var3;
   }

   public <T> DataResult<T> encode(Supplier<E> var1, DynamicOps<T> var2, T var3) {
      return !(var2 instanceof WorldGenSettingsExport)
         ? this.field41444.encode(var1.get(), var2, var3)
         : ((WorldGenSettingsExport)var2).method20492(var1.get(), var3, this.field41443, this.field41444);
   }

   public <T> DataResult<Pair<Supplier<E>, T>> decode(DynamicOps<T> var1, T var2) {
      return !(var1 instanceof WorldSettingsImport)
         ? this.field41444.decode(var1, var2).map(var0 -> var0.mapFirst(var0x -> () -> var0x))
         : ((WorldSettingsImport)var1).<E>method20473(var2, this.field41443, this.field41444, this.field41445);
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.field41443 + " " + this.field41444 + "]";
   }
}
