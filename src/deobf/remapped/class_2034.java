package remapped;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class class_2034 {
   public static final long field_10326 = method_9540(1875016, 1875016);
   public int field_10328;
   public int field_10327;
   private int field_10325 = 0;

   public class_2034(int var1, int var2) {
      this.field_10328 = var1;
      this.field_10327 = var2;
   }

   public class_2034(BlockPos var1) {
      this.field_10328 = var1.getX() >> 4;
      this.field_10327 = var1.method_12185() >> 4;
   }

   public class_2034(long var1) {
      this.field_10328 = (int)var1;
      this.field_10327 = (int)(var1 >> 32);
   }

   public long method_9539() {
      return method_9540(this.field_10328, this.field_10327);
   }

   public static long method_9540(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public static int method_9541(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public static int method_9533(long var0) {
      return (int)(var0 >>> 32 & 4294967295L);
   }

   @Override
   public int hashCode() {
      if (this.field_10325 == 0) {
         int var3 = 1664525 * this.field_10328 + 1013904223;
         int var4 = 1664525 * (this.field_10327 ^ -559038737) + 1013904223;
         this.field_10325 = var3 ^ var4;
         return this.field_10325;
      } else {
         return this.field_10325;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_2034)) {
            return false;
         } else {
            class_2034 var4 = (class_2034)var1;
            return this.field_10328 == var4.field_10328 && this.field_10327 == var4.field_10327;
         }
      } else {
         return true;
      }
   }

   public int method_9535() {
      return this.field_10328 << 4;
   }

   public int method_9545() {
      return this.field_10327 << 4;
   }

   public int method_9536() {
      return (this.field_10328 << 4) + 15;
   }

   public int method_9538() {
      return (this.field_10327 << 4) + 15;
   }

   public int method_9537() {
      return this.field_10328 >> 5;
   }

   public int method_9544() {
      return this.field_10327 >> 5;
   }

   public int method_9548() {
      return this.field_10328 & 31;
   }

   public int method_9547() {
      return this.field_10327 & 31;
   }

   @Override
   public String toString() {
      return "[" + this.field_10328 + ", " + this.field_10327 + "]";
   }

   public BlockPos method_9546() {
      return new BlockPos(this.method_9535(), 0, this.method_9545());
   }

   public int method_9549(class_2034 var1) {
      return Math.max(Math.abs(this.field_10328 - var1.field_10328), Math.abs(this.field_10327 - var1.field_10327));
   }

   public static Stream<class_2034> method_9542(class_2034 var0, int var1) {
      return method_9543(new class_2034(var0.field_10328 - var1, var0.field_10327 - var1), new class_2034(var0.field_10328 + var1, var0.field_10327 + var1));
   }

   public static Stream<class_2034> method_9543(class_2034 var0, class_2034 var1) {
      int var4 = Math.abs(var0.field_10328 - var1.field_10328) + 1;
      int var5 = Math.abs(var0.field_10327 - var1.field_10327) + 1;
      int var6 = var0.field_10328 >= var1.field_10328 ? -1 : 1;
      int var7 = var0.field_10327 >= var1.field_10327 ? -1 : 1;
      return StreamSupport.<class_2034>stream(new class_5361((long)(var4 * var5), 64, var0, var1, var7, var6), false);
   }
}
