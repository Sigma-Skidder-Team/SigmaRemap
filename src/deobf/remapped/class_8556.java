package remapped;

public class class_8556 implements Runnable {
   private static String[] field_43773;

   public class_8556(class_6056 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_43777 = var1;
      this.field_43775 = var2;
      this.field_43774 = var4;
      this.field_43776 = var6;
      this.field_43778 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_43775; var3 < this.field_43774; var3++) {
         long var5 = var3 * class_6056.method_27679(this.field_43777);

         for (long var7 = 0L; var7 < class_6056.method_27677(this.field_43777); var7++) {
            class_6056.method_27665(this.field_43777).method_31280(this.field_43776, var5 + var7 * class_6056.method_27672(this.field_43777), this.field_43778);
         }
      }
   }
}
