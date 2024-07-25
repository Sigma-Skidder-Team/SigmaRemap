package remapped;

import javax.annotation.Nullable;

public class class_7850 implements class_5561 {
   private static String[] field_39782;
   public final int field_39775;
   public final int field_39783;
   public final BlockPos field_39784;
   public final int field_39776;
   public final int field_39781;
   public final int field_39780;
   public final class_2654[][] field_39774;
   public final class_2522[] field_39778;
   public final class_4774[] field_39777;
   public final World field_39779;

   @Nullable
   public static class_7850 method_35515(World var0, BlockPos var1, BlockPos var2, int var3) {
      return method_35516(var0, var1, var2, var3, true);
   }

   public static class_7850 method_35516(World var0, BlockPos var1, BlockPos var2, int var3, boolean var4) {
      int var7 = var1.method_12173() - var3 >> 4;
      int var8 = var1.method_12185() - var3 >> 4;
      int var9 = var2.method_12173() + var3 >> 4;
      int var10 = var2.method_12185() + var3 >> 4;
      class_2654[][] var11 = new class_2654[var9 - var7 + 1][var10 - var8 + 1];

      for (int var12 = var7; var12 <= var9; var12++) {
         for (int var13 = var8; var13 <= var10; var13++) {
            var11[var12 - var7][var13 - var8] = var0.method_29554(var12, var13);
         }
      }

      if (var4 && method_35521(var1, var2, var7, var8, var11)) {
         return null;
      } else {
         boolean var15 = true;
         BlockPos var16 = var1.method_6104(-1, -1, -1);
         BlockPos var14 = var2.method_6104(1, 1, 1);
         return new class_7850(var0, var7, var8, var11, var16, var14);
      }
   }

   public static boolean method_35521(BlockPos var0, BlockPos var1, int var2, int var3, class_2654[][] var4) {
      for (int var7 = var0.method_12173() >> 4; var7 <= var1.method_12173() >> 4; var7++) {
         for (int var8 = var0.method_12185() >> 4; var8 <= var1.method_12185() >> 4; var8++) {
            class_2654 var9 = var4[var7 - var2][var8 - var3];
            if (!var9.method_27368(var0.method_12165(), var1.method_12165())) {
               return false;
            }
         }
      }

      return true;
   }

   public class_7850(World var1, int var2, int var3, class_2654[][] var4, BlockPos var5, BlockPos var6) {
      this.field_39779 = var1;
      this.field_39775 = var2;
      this.field_39783 = var3;
      this.field_39774 = var4;
      this.field_39784 = var5;
      this.field_39776 = var6.method_12173() - var5.method_12173() + 1;
      this.field_39781 = var6.method_12165() - var5.method_12165() + 1;
      this.field_39780 = var6.method_12185() - var5.method_12185() + 1;
      this.field_39778 = null;
      this.field_39777 = null;
   }

   public final int method_35520(BlockPos var1) {
      return this.method_35519(var1.method_12173(), var1.method_12165(), var1.method_12185());
   }

   public int method_35519(int var1, int var2, int var3) {
      int var6 = var1 - this.field_39784.method_12173();
      int var7 = var2 - this.field_39784.method_12165();
      int var8 = var3 - this.field_39784.method_12185();
      return var8 * this.field_39776 * this.field_39781 + var7 * this.field_39776 + var6;
   }

   @Override
   public class_2522 method_28262(BlockPos var1) {
      int var4 = (var1.method_12173() >> 4) - this.field_39775;
      int var5 = (var1.method_12185() >> 4) - this.field_39783;
      return this.field_39774[var4][var5].method_28262(var1);
   }

   @Override
   public class_4774 method_28258(BlockPos var1) {
      int var4 = (var1.method_12173() >> 4) - this.field_39775;
      int var5 = (var1.method_12185() >> 4) - this.field_39783;
      return this.field_39774[var4][var5].method_28258(var1);
   }

   @Override
   public float method_25265(Direction var1, boolean var2) {
      return this.field_39779.method_25265(var1, var2);
   }

   @Override
   public class_4663 method_25264() {
      return this.field_39779.method_25264();
   }

   @Nullable
   @Override
   public class_3757 method_28260(BlockPos var1) {
      return this.method_35518(var1, class_1628.field_8478);
   }

   @Nullable
   public class_3757 method_35518(BlockPos var1, class_1628 var2) {
      int var5 = (var1.method_12173() >> 4) - this.field_39775;
      int var6 = (var1.method_12185() >> 4) - this.field_39783;
      return this.field_39774[var5][var6].method_11988(var1, var2);
   }

   @Override
   public int method_25262(BlockPos var1, class_6581 var2) {
      return this.field_39779.method_25262(var1, var2);
   }

   public class_6325 method_35513(BlockPos var1) {
      return this.field_39779.method_22561(var1);
   }

   public class_2654 method_35514(int var1, int var2) {
      return this.field_39774[var1][var2];
   }
}
