package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class Class8222<T> {
   private final T field35313;
   private long field35314;

   public Class8222(T var1, long var2) {
      this.field35313 = (T)var1;
      this.field35314 = var2;
   }

   public void method28601() {
      if (this.method28606()) {
         this.field35314--;
      }
   }

   public static <T> Class8222<T> method28602(T var0) {
      return new Class8222<T>((T)var0, Long.MAX_VALUE);
   }

   public static <T> Class8222<T> method28603(T var0, long var1) {
      return new Class8222<T>((T)var0, var1);
   }

   public T method28604() {
      return this.field35313;
   }

   public boolean method28605() {
      return this.field35314 <= 0L;
   }

   @Override
   public String toString() {
      return this.field35313.toString() + (!this.method28606() ? "" : " (ttl: " + this.field35314 + ")");
   }

   public boolean method28606() {
      return this.field35314 != Long.MAX_VALUE;
   }

   public static <T> Codec<Class8222<T>> method28607(Codec<T> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
                  var0.fieldOf("value").forGetter(var0xx -> var0xx.field35313),
                  Codec.LONG.optionalFieldOf("ttl").forGetter(var0xx -> !var0xx.method28606() ? Optional.empty() : Optional.<Long>of(var0xx.field35314))
               )
               .apply(var1, (var0xx, var1x) -> new Class8222(var0xx, var1x.orElse(Long.MAX_VALUE)))
      );
   }
}
