package remapped;

import com.google.common.hash.Hashing;

public class class_859 {
   private static String[] field_4460;
   private final class_6142 field_4462;
   private final long field_4461;
   private final class_6166 field_4463;

   public class_859(class_6142 var1, long var2, class_6166 var4) {
      this.field_4462 = var1;
      this.field_4461 = var2;
      this.field_4463 = var4;
   }

   public static long method_3728(long var0) {
      return Hashing.sha256().hashLong(var0).asLong();
   }

   public class_859 method_3730(class_3498 var1) {
      return new class_859(var1, this.field_4461, this.field_4463);
   }

   public class_6325 method_3726(BlockPos var1) {
      return this.field_4463.method_28268(this.field_4461, var1.getX(), var1.getY(), var1.getZ(), this.field_4462);
   }

   public class_6325 method_3724(double var1, double var3, double var5) {
      int var9 = MathHelper.floor(var1) >> 2;
      int var10 = MathHelper.floor(var3) >> 2;
      int var11 = MathHelper.floor(var5) >> 2;
      return this.method_3727(var9, var10, var11);
   }

   public class_6325 method_3725(BlockPos var1) {
      int var4 = var1.getX() >> 2;
      int var5 = var1.getY() >> 2;
      int var6 = var1.getZ() >> 2;
      return this.method_3727(var4, var5, var6);
   }

   public class_6325 method_3727(int var1, int var2, int var3) {
      return this.field_4462.method_28192(var1, var2, var3);
   }
}
