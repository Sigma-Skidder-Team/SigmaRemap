package remapped;

public class class_4860 implements Runnable {
   private static String[] field_24208;

   public class_4860(class_4993 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_24204 = var1;
      this.field_24209 = var2;
      this.field_24207 = var4;
      this.field_24206 = var6;
      this.field_24205 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_24209; var3 < this.field_24207; var3++) {
         class_4993.method_22998(this.field_24204).method_24206(this.field_24206, var3 * class_4993.method_23002(this.field_24204), this.field_24205);
      }
   }
}
