package remapped;

import java.util.Arrays;

public class class_1680 implements class_5561 {
   private static String[] field_8699;
   private final class_7850 field_8703;
   private final int field_8702;
   private final int field_8691;
   private final int field_8692;
   private final int field_8689;
   private final int field_8700;
   private final int field_8695;
   private final int field_8698;
   private int[] field_8696;
   private class_2522[] field_8705;
   private class_6325[] field_8704;
   private final int field_8693;
   private class_4460 field_8690;
   private static final class_9442 field_8697 = new class_9442(int.class, 16);
   private static final class_9442 field_8694 = new class_9442(class_2522.class, 16);
   private static final class_9442 field_8701 = new class_9442(class_6325.class, 16);

   public class_1680(class_7850 var1, BlockPos var2, BlockPos var3, int var4) {
      this.field_8703 = var1;
      int var7 = var2.method_12173() - var4 >> 4;
      int var8 = var2.method_12165() - var4 >> 4;
      int var9 = var2.method_12185() - var4 >> 4;
      int var10 = var3.method_12173() + var4 >> 4;
      int var11 = var3.method_12165() + var4 >> 4;
      int var12 = var3.method_12185() + var4 >> 4;
      this.field_8689 = var10 - var7 + 1 << 4;
      this.field_8700 = var11 - var8 + 1 << 4;
      this.field_8695 = var12 - var9 + 1 << 4;
      this.field_8698 = this.field_8689 * this.field_8695;
      this.field_8693 = this.field_8689 * this.field_8700 * this.field_8695;
      this.field_8702 = var7 << 4;
      this.field_8691 = var8 << 4;
      this.field_8692 = var9 << 4;
   }

   public int method_7523(BlockPos var1) {
      int var4 = var1.method_12173() - this.field_8702;
      if (var4 >= 0 && var4 < this.field_8689) {
         int var5 = var1.method_12165() - this.field_8691;
         if (var5 >= 0 && var5 < this.field_8700) {
            int var6 = var1.method_12185() - this.field_8692;
            return var6 >= 0 && var6 < this.field_8695 ? var5 * this.field_8698 + var6 * this.field_8689 + var4 : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @Override
   public int method_25266(class_2957 var1, BlockPos var2) {
      return this.field_8703.method_25266(var1, var2);
   }

   @Override
   public class_2522 method_28262(BlockPos var1) {
      int var4 = this.method_7523(var1);
      if (var4 >= 0 && var4 < this.field_8693 && this.field_8705 != null) {
         class_2522 var5 = this.field_8705[var4];
         if (var5 == null) {
            var5 = this.field_8703.method_28262(var1);
            this.field_8705[var4] = var5;
         }

         return var5;
      } else {
         return this.field_8703.method_28262(var1);
      }
   }

   public void method_7525() {
      if (this.field_8696 == null) {
         this.field_8696 = (int[])field_8697.method_43674(this.field_8693);
      }

      if (this.field_8705 == null) {
         this.field_8705 = (class_2522[])field_8694.method_43674(this.field_8693);
      }

      if (this.field_8704 == null) {
         this.field_8704 = (class_6325[])field_8701.method_43674(this.field_8693);
      }

      Arrays.fill(this.field_8696, -1);
      Arrays.fill(this.field_8705, null);
      Arrays.fill(this.field_8704, null);
      this.method_7524();
   }

   private void method_7524() {
      if (this.field_8689 == 48 && this.field_8700 == 48 && this.field_8695 == 48) {
         class_2654 var3 = this.field_8703.method_35514(1, 1);
         class_523 var4 = new class_523();

         for (int var5 = 16; var5 < 32; var5++) {
            int var6 = var5 * this.field_8698;

            for (int var7 = 16; var7 < 32; var7++) {
               int var8 = var7 * this.field_8689;

               for (int var9 = 16; var9 < 32; var9++) {
                  var4.method_2548(this.field_8702 + var9, this.field_8691 + var5, this.field_8692 + var7);
                  int var10 = var6 + var8 + var9;
                  class_2522 var11 = var3.method_28262(var4);
                  this.field_8705[var10] = var11;
               }
            }
         }
      }
   }

   public void method_7516() {
      field_8697.method_43676(this.field_8696);
      this.field_8696 = null;
      field_8694.method_43676(this.field_8705);
      this.field_8705 = null;
      field_8701.method_43676(this.field_8704);
      this.field_8704 = null;
   }

   public int[] method_7521() {
      return this.field_8696;
   }

   public class_6325 method_7522(BlockPos var1) {
      int var4 = this.method_7523(var1);
      if (var4 >= 0 && var4 < this.field_8693 && this.field_8704 != null) {
         class_6325 var5 = this.field_8704[var4];
         if (var5 == null) {
            var5 = this.field_8703.method_35513(var1);
            this.field_8704[var4] = var5;
         }

         return var5;
      } else {
         return this.field_8703.method_35513(var1);
      }
   }

   @Override
   public class_3757 method_28260(BlockPos var1) {
      return this.field_8703.method_35518(var1, class_1628.field_8476);
   }

   public class_3757 method_7520(BlockPos var1, class_1628 var2) {
      return this.field_8703.method_35518(var1, var2);
   }

   @Override
   public boolean method_25263(BlockPos var1) {
      return this.field_8703.method_25263(var1);
   }

   @Override
   public class_4774 method_28258(BlockPos var1) {
      return this.method_28262(var1).method_8364();
   }

   @Override
   public int method_25262(BlockPos var1, class_6581 var2) {
      return this.field_8703.method_25262(var1, var2);
   }

   @Override
   public class_4663 method_25264() {
      return this.field_8703.method_25264();
   }

   public class_4460 method_7519() {
      return this.field_8690;
   }

   public void method_7517(class_4460 var1) {
      this.field_8690 = var1;
   }

   @Override
   public float method_25265(Direction var1, boolean var2) {
      return this.field_8703.method_25265(var1, var2);
   }
}
