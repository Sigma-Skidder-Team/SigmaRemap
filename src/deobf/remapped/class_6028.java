package remapped;

public class class_6028 implements Runnable {
   private static String[] field_30780;

   public class_6028(class_5519 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_30781 = var1;
      this.field_30783 = var2;
      this.field_30782 = var4;
      this.field_30779 = var6;
      this.field_30784 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_30783; var3 < this.field_30782; var3++) {
         class_5519.method_24991(this.field_30781).method_19194(this.field_30779, var3 * class_5519.method_25007(this.field_30781), this.field_30784);
      }
   }
}
