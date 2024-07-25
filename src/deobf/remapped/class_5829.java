package remapped;

public class class_5829 implements Runnable {
   private static String[] field_29581;

   public class_5829(class_3381 var1, long var2, long var4, class_4330 var6, class_4330 var7, long var8) {
      this.field_29579 = var1;
      this.field_29584 = var2;
      this.field_29578 = var4;
      this.field_29583 = var6;
      this.field_29582 = var7;
      this.field_29580 = var8;
   }

   @Override
   public void run() {
      for (long var3 = this.field_29584; var3 < this.field_29578; var3++) {
         long var5 = var3 * class_3381.method_15598(this.field_29579);

         for (long var7 = 0L; var7 < class_3381.method_15624(this.field_29579); var7++) {
            class_3685.method_17117(
               this.field_29583,
               var5 + var7 * class_3381.method_15638(this.field_29579),
               this.field_29582,
               var3 * class_3381.method_15624(this.field_29579) * this.field_29580 + var7 * this.field_29580,
               class_3381.method_15582(this.field_29579)
            );
            class_3381.method_15625(this.field_29579)
               .method_24159(this.field_29582, var3 * class_3381.method_15624(this.field_29579) * this.field_29580 + var7 * this.field_29580);
         }
      }
   }
}
