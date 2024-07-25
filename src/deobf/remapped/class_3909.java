package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class class_3909<T> {
   private final T field_18998;
   private long field_18996;

   public class_3909(T var1, long var2) {
      this.field_18998 = (T)var1;
      this.field_18996 = var2;
   }

   public void method_18104() {
      if (this.method_18101()) {
         this.field_18996--;
      }
   }

   public static <T> class_3909<T> method_18102(T var0) {
      return new class_3909<T>((T)var0, Long.MAX_VALUE);
   }

   public static <T> class_3909<T> method_18099(T var0, long var1) {
      return new class_3909<T>((T)var0, var1);
   }

   public T method_18098() {
      return this.field_18998;
   }

   public boolean method_18100() {
      return this.field_18996 <= 0L;
   }

   @Override
   public String toString() {
      return this.field_18998.toString() + (!this.method_18101() ? "" : " (ttl: " + this.field_18996 + ")");
   }

   public boolean method_18101() {
      return this.field_18996 != Long.MAX_VALUE;
   }

   public static <T> Codec<class_3909<T>> method_18103(Codec<T> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
                  var0.fieldOf("value").forGetter(var0xx -> var0xx.field_18998),
                  Codec.LONG.optionalFieldOf("ttl").forGetter(var0xx -> !var0xx.method_18101() ? Optional.empty() : Optional.<Long>of(var0xx.field_18996))
               )
               .apply(var1, (var0xx, var1x) -> new class_3909<Object>(var0xx, var1x.orElse(Long.MAX_VALUE)))
      );
   }
}
