package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;

public class Class8045 {
   public static final Codec<Class8045> field34558 = Codec.either(
         Codec.INT,
         RecordCodecBuilder.<Class8045>create(
               var0 -> var0.group(
                        Codec.INT.fieldOf("base").forGetter(var0x -> var0x.field34559), Codec.INT.fieldOf("spread").forGetter(var0x -> var0x.field34560)
                     )
                     .apply(var0, Class8045::new)
            )
            .comapFlatMap(
               var0 -> var0.field34560 >= 0 ? DataResult.success(var0) : DataResult.error("Spread must be non-negative, got: " + var0.field34560),
               Function.identity()
            )
      )
      .xmap(
         var0 -> (Class8045)var0.map(Class8045::method27631, var0x -> var0x), var0 -> var0.field34560 != 0 ? Either.right(var0) : Either.left(var0.field34559)
      );
   private final int field34559;
   private final int field34560;

   public static Codec<Class8045> method27630(int var0, int var1, int var2) {
      Function<Class8045, DataResult<Class8045>> var5 = var3 -> {
         if (var3.field34559 >= var0 && var3.field34559 <= var1) {
            return var3.field34560 > var2 ? DataResult.error("Spread too big: " + var3.field34560 + " > " + var2) : DataResult.success(var3);
         } else {
            return DataResult.error("Base value out of range: " + var3.field34559 + " [" + var0 + "-" + var1 + "]");
         }
      };
      return field34558.flatXmap(var5, var5);
   }

   private Class8045(int var1, int var2) {
      this.field34559 = var1;
      this.field34560 = var2;
   }

   public static Class8045 method27631(int var0) {
      return new Class8045(var0, 0);
   }

   public static Class8045 method27632(int var0, int var1) {
      return new Class8045(var0, var1);
   }

   public int method27633(Random var1) {
      return this.field34560 != 0 ? this.field34559 + var1.nextInt(this.field34560 + 1) : this.field34559;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class8045 var4 = (Class8045)var1;
         return this.field34559 == var4.field34559 && this.field34560 == var4.field34560;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field34559, this.field34560);
   }

   @Override
   public String toString() {
      return "[" + this.field34559 + '-' + (this.field34559 + this.field34560) + ']';
   }
}
