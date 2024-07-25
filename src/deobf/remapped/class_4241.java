package remapped;

public class class_4241 implements Runnable {
   private static String[] field_20581;

   public class_4241(class_4993 var1, long var2, long var4, class_4330 var6, long var7) {
      this.field_20577 = var1;
      this.field_20582 = var2;
      this.field_20579 = var4;
      this.field_20578 = var6;
      this.field_20580 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_20582; var3 < this.field_20579; var3++) {
         class_4993.method_22998(this.field_20577).method_24184(this.field_20578, var3 * this.field_20580);
      }
   }
}
