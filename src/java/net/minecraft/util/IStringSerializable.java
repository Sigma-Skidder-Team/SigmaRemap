package net.minecraft.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import mapped.Class8119;
import mapped.Class9099;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public interface IStringSerializable {
   String getString();

   static <E extends Enum<E> & IStringSerializable> Codec<E> method258(Supplier<E[]> var0, Function<? super String, ? extends E> var1) {
      Enum[] var4 = (Enum[])var0.get();
      return method259(Enum::ordinal, var1x -> (E)var4[var1x], var1);
   }

   static <E extends IStringSerializable> Codec<E> method259(ToIntFunction<E> var0, IntFunction<E> var1, Function<? super String, ? extends E> var2) {
      return new Class9099(var0, var1, var2);
   }

   static Keyable method260(IStringSerializable[] var0) {
      return new Class8119(var0);
   }
}
