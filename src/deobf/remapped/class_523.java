package remapped;

public class class_523 extends BlockPos {
   private static String[] field_3188;
   private int field_3189;
   private int field_3191;
   private int field_3194;
   private int field_3193;
   private class_523[] field_3192;
   private boolean field_3190;

   public class_523() {
      this(0, 0, 0, 0);
   }

   public class_523(int var1, int var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public class_523(double var1, double var3, double var5) {
      this(class_9299.method_42847(var1), class_9299.method_42847(var3), class_9299.method_42847(var5));
   }

   public class_523(int var1, int var2, int var3, int var4) {
      super(0, 0, 0);
      this.field_3189 = var1;
      this.field_3191 = var2;
      this.field_3194 = var3;
      this.field_3193 = var4;
   }

   @Override
   public int method_12173() {
      return this.field_3189;
   }

   @Override
   public int method_12165() {
      return this.field_3191;
   }

   @Override
   public int method_12185() {
      return this.field_3194;
   }

   public void method_2548(int var1, int var2, int var3) {
      this.field_3189 = var1;
      this.field_3191 = var2;
      this.field_3194 = var3;
      this.field_3190 = true;
   }

   public void method_2547(double var1, double var3, double var5) {
      this.method_2548(class_9299.method_42847(var1), class_9299.method_42847(var3), class_9299.method_42847(var5));
   }

   @Override
   public BlockPos method_6098(Direction var1) {
      if (this.field_3193 > 0) {
         if (this.field_3192 == null) {
            this.field_3192 = new class_523[Direction.field_803.length];
         }

         if (this.field_3190) {
            this.method_2545();
         }

         int var4 = var1.method_1050();
         class_523 var5 = this.field_3192[var4];
         if (var5 == null) {
            int var6 = this.field_3189 + var1.method_1041();
            int var7 = this.field_3191 + var1.method_1054();
            int var8 = this.field_3194 + var1.method_1034();
            var5 = new class_523(var6, var7, var8, this.field_3193 - 1);
            this.field_3192[var4] = var5;
         }

         return var5;
      } else {
         return super.method_6099(var1, 1).method_6072();
      }
   }

   @Override
   public BlockPos method_6099(Direction var1, int var2) {
      return var2 != 1 ? super.method_6099(var1, var2).method_6072() : this.method_6098(var1);
   }

   public void method_2549(BlockPos var1, Direction var2) {
      this.field_3189 = var1.method_12173() + var2.method_1041();
      this.field_3191 = var1.method_12165() + var2.method_1054();
      this.field_3194 = var1.method_12185() + var2.method_1034();
   }

   public void method_2550(BlockPos var1, Direction var2, Direction var3) {
      this.field_3189 = var1.method_12173() + var2.method_1041() + var3.method_1041();
      this.field_3191 = var1.method_12165() + var2.method_1054() + var3.method_1054();
      this.field_3194 = var1.method_12185() + var2.method_1034() + var3.method_1034();
   }

   private void method_2545() {
      for (int var3 = 0; var3 < 6; var3++) {
         class_523 var4 = this.field_3192[var3];
         if (var4 != null) {
            Direction var5 = Direction.field_803[var3];
            int var6 = this.field_3189 + var5.method_1041();
            int var7 = this.field_3191 + var5.method_1054();
            int var8 = this.field_3194 + var5.method_1034();
            var4.method_2548(var6, var7, var8);
         }
      }

      this.field_3190 = false;
   }

   @Override
   public BlockPos method_6072() {
      return new BlockPos(this.field_3189, this.field_3191, this.field_3194);
   }

   public static Iterable method_2546(BlockPos var0, BlockPos var1) {
      BlockPos var4 = new BlockPos(
         Math.min(var0.method_12173(), var1.method_12173()),
         Math.min(var0.method_12165(), var1.method_12165()),
         Math.min(var0.method_12185(), var1.method_12185())
      );
      BlockPos var5 = new BlockPos(
         Math.max(var0.method_12173(), var1.method_12173()),
         Math.max(var0.method_12165(), var1.method_12165()),
         Math.max(var0.method_12185(), var1.method_12185())
      );
      return new class_5393(var4, var5);
   }
}
