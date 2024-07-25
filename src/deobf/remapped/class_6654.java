package remapped;

public class class_6654 implements Runnable {
   private static String[] field_34430;

   public class_6654(class_3803 var1, long var2, long var4, class_4330 var6) {
      this.field_34432 = var1;
      this.field_34431 = var2;
      this.field_34428 = var4;
      this.field_34429 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_34431; var3 < this.field_34428; var3++) {
         long var5 = var3 * (long)class_3803.method_17689(this.field_34432);

         for (long var7 = 0L; var7 < class_3803.method_17686(this.field_34432); var7++) {
            class_3803.method_17704(this.field_34432).method_17784(this.field_34429, var5 + var7 * (long)class_3803.method_17685(this.field_34432));
         }
      }
   }
}
