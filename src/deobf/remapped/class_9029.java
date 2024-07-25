package remapped;

public class class_9029 implements Runnable {
   private static String[] field_46209;

   public class_9029(class_3381 var1, long var2, long var4, class_4330 var6) {
      this.field_46208 = var1;
      this.field_46207 = var2;
      this.field_46206 = var4;
      this.field_46210 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_46207; var3 < this.field_46206; var3++) {
         long var5 = var3 * class_3381.method_15598(this.field_46208);

         for (long var7 = 0L; var7 < class_3381.method_15624(this.field_46208); var7++) {
            class_3381.method_15625(this.field_46208).method_24184(this.field_46210, var5 + var7 * class_3381.method_15638(this.field_46208));
         }
      }
   }
}
