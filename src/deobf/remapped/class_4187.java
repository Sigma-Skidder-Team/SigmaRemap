package remapped;

public class class_4187 implements Runnable {
   private static String[] field_20378;

   public class_4187(class_573 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_20381 = var1;
      this.field_20382 = var2;
      this.field_20380 = var4;
      this.field_20379 = var6;
      this.field_20383 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_20382; var3 < this.field_20380; var3++) {
         long var5 = var3 * class_573.method_2731(this.field_20381);

         for (long var7 = 0L; var7 < class_573.method_2715(this.field_20381); var7++) {
            class_573.method_2736(this.field_20381).method_44813(this.field_20379, var5 + var7 * class_573.method_2726(this.field_20381), this.field_20383);
         }
      }
   }
}
