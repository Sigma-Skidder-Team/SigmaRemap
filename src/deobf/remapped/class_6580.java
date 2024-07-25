package remapped;

public class class_6580 implements Runnable {
   private static String[] field_33561;

   public class_6580(class_5519 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_33563 = var1;
      this.field_33562 = var2;
      this.field_33560 = var4;
      this.field_33558 = var6;
      this.field_33559 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_33562; var3 < this.field_33560; var3++) {
         class_5519.method_24991(this.field_33563).method_19201(this.field_33558, var3 * class_5519.method_25007(this.field_33563), this.field_33559);
      }
   }
}
