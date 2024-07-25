package remapped;

import java.util.Comparator;

public class class_4110<T> {
   private static long field_20033;
   private final T field_20031;
   public final BlockPos field_20034;
   public final long field_20036;
   public final class_1716 field_20035;
   private final long field_20037;

   public class_4110(BlockPos var1, T var2) {
      this(var1, (T)var2, 0L, class_1716.field_8861);
   }

   public class_4110(BlockPos var1, T var2, long var3, class_1716 var5) {
      this.field_20037 = field_20033++;
      this.field_20034 = var1.method_6072();
      this.field_20031 = (T)var2;
      this.field_20036 = var3;
      this.field_20035 = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_4110)) {
         return false;
      } else {
         class_4110 var4 = (class_4110)var1;
         return this.field_20034.equals(var4.field_20034) && this.field_20031 == var4.field_20031;
      }
   }

   @Override
   public int hashCode() {
      return this.field_20034.hashCode();
   }

   public static <T> Comparator<class_4110<T>> method_19094() {
      return Comparator.<class_4110<T>>comparingLong(var0 -> var0.field_20036)
         .thenComparing(var0 -> var0.field_20035)
         .thenComparingLong(var0 -> var0.field_20037);
   }

   @Override
   public String toString() {
      return this.field_20031 + ": " + this.field_20034 + ", " + this.field_20036 + ", " + this.field_20035 + ", " + this.field_20037;
   }

   public T method_19096() {
      return this.field_20031;
   }
}
