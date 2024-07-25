package remapped;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;

public class class_3461 {
   public static final Codec<class_3461> field_16960 = Codec.either(
         Codec.INT,
         RecordCodecBuilder.create(
               var0 -> var0.group(
                        Codec.INT.fieldOf("base").forGetter(var0x -> var0x.field_16961), Codec.INT.fieldOf("spread").forGetter(var0x -> var0x.field_16959)
                     )
                     .apply(var0, class_3461::new)
            )
            .comapFlatMap(
               var0 -> var0.field_16959 >= 0 ? DataResult.success(var0) : DataResult.error("Spread must be non-negative, got: " + var0.field_16959),
               Function.identity()
            )
      )
      .xmap(
         var0 -> (class_3461)var0.map(class_3461::method_15935, var0x -> var0x),
         var0 -> var0.field_16959 != 0 ? Either.right(var0) : Either.left(var0.field_16961)
      );
   private final int field_16961;
   private final int field_16959;

   public static Codec<class_3461> method_15933(int var0, int var1, int var2) {
      Function var5 = var3 -> {
         if (var3.field_16961 >= var0 && var3.field_16961 <= var1) {
            return var3.field_16959 > var2 ? DataResult.error("Spread too big: " + var3.field_16959 + " > " + var2) : DataResult.success(var3);
         } else {
            return DataResult.error("Base value out of range: " + var3.field_16961 + " [" + var0 + "-" + var1 + "]");
         }
      };
      return field_16960.flatXmap(var5, var5);
   }

   private class_3461(int var1, int var2) {
      this.field_16961 = var1;
      this.field_16959 = var2;
   }

   public static class_3461 method_15935(int var0) {
      return new class_3461(var0, 0);
   }

   public static class_3461 method_15934(int var0, int var1) {
      return new class_3461(var0, var1);
   }

   public int method_15936(Random var1) {
      return this.field_16959 != 0 ? this.field_16961 + var1.nextInt(this.field_16959 + 1) : this.field_16961;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_3461 var4 = (class_3461)var1;
         return this.field_16961 == var4.field_16961 && this.field_16959 == var4.field_16959;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_16961, this.field_16959);
   }

   @Override
   public String toString() {
      return "[" + this.field_16961 + '-' + (this.field_16961 + this.field_16959) + ']';
   }
}
