package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Comparator;

public class Class8269<T> {
   private static long field35554;
   private final T field35555;
   public final BlockPos field35556;
   public final long field35557;
   public final Class2199 field35558;
   private final long field35559;

   public Class8269(BlockPos var1, T var2) {
      this(var1, (T)var2, 0L, Class2199.field14370);
   }

   public Class8269(BlockPos var1, T var2, long var3, Class2199 var5) {
      this.field35559 = field35554++;
      this.field35556 = var1.toImmutable();
      this.field35555 = (T)var2;
      this.field35557 = var3;
      this.field35558 = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class8269)) {
         return false;
      } else {
         Class8269 var4 = (Class8269)var1;
         return this.field35556.equals(var4.field35556) && this.field35555 == var4.field35555;
      }
   }

   @Override
   public int hashCode() {
      return this.field35556.hashCode();
   }

   public static <T> Comparator<Class8269<T>> method28873() {
      return Comparator.<Class8269<T>>comparingLong(var0 -> var0.field35557).thenComparing(var0 -> var0.field35558).thenComparingLong(var0 -> var0.field35559);
   }

   @Override
   public String toString() {
      return this.field35555 + ": " + this.field35556 + ", " + this.field35557 + ", " + this.field35558 + ", " + this.field35559;
   }

   public T method28874() {
      return this.field35555;
   }
}
