package remapped;

public class class_6241 implements Runnable {
   private static String[] field_31939;

   public class_6241(class_84 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_31941 = var1;
      this.field_31943 = var2;
      this.field_31944 = var4;
      this.field_31942 = var6;
      this.field_31940 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_31943; var3 < this.field_31944; var3++) {
         long var5 = var3 * class_84.method_182(this.field_31941);

         for (long var7 = 0L; var7 < class_84.method_190(this.field_31941); var7++) {
            class_84.method_187(this.field_31941).method_31292(this.field_31942, var5 + var7 * class_84.method_197(this.field_31941), this.field_31940);
         }
      }
   }
}
