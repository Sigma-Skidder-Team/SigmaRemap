package remapped;

public class class_2303 implements Runnable {
   private static String[] field_11491;

   public class_2303(class_84 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_11495 = var1;
      this.field_11492 = var2;
      this.field_11490 = var4;
      this.field_11493 = var6;
      this.field_11494 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_11492; var3 < this.field_11490; var3++) {
         long var5 = var3 * (long)class_84.method_180(this.field_11495);

         for (long var7 = 0L; var7 < class_84.method_190(this.field_11495); var7++) {
            class_84.method_187(this.field_11495).method_31286(this.field_11493, var5 + var7 * (long)class_84.method_188(this.field_11495), this.field_11494);
         }
      }
   }
}
