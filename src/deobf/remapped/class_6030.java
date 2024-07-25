package remapped;

public class class_6030 implements Runnable {
   private static String[] field_30792;

   public class_6030(class_4993 var1, long var2, long var4, long var6, long var8, class_4330 var10, class_4330 var11, long var12) {
      this.field_30793 = var1;
      this.field_30795 = var2;
      this.field_30791 = var4;
      this.field_30798 = var6;
      this.field_30794 = var8;
      this.field_30799 = var10;
      this.field_30797 = var11;
      this.field_30796 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_30795; var3 < this.field_30791; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < this.field_30798; var7++) {
            long var9 = 2L * var7;
            long var11 = var3 * this.field_30794 + var9;
            this.field_30799.method_36114(var11, (double)this.field_30797.method_36133(var7 * this.field_30796 + var5));
            this.field_30799.method_36114(var11 + 1L, (double)this.field_30797.method_36133(var7 * this.field_30796 + var5 + 1L));
         }
      }
   }
}
