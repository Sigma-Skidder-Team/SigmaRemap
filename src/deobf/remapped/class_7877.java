package remapped;

public class class_7877 implements Runnable {
   private static String[] field_40320;

   public class_7877(class_5519 var1, int var2, int var3, int var4, float[][] var5, boolean var6) {
      this.field_40318 = var1;
      this.field_40321 = var2;
      this.field_40323 = var3;
      this.field_40322 = var4;
      this.field_40319 = var5;
      this.field_40317 = var6;
   }

   @Override
   public void run() {
      if (this.field_40321 != -1) {
         for (int var3 = this.field_40323; var3 < class_5519.method_24995(this.field_40318); var3 += this.field_40322) {
            class_5519.method_24991(this.field_40318).method_19204(this.field_40319[var3], this.field_40317);
         }
      } else {
         for (int var4 = this.field_40323; var4 < class_5519.method_24995(this.field_40318); var4 += this.field_40322) {
            class_5519.method_24991(this.field_40318).method_19197(this.field_40319[var4], this.field_40317);
         }
      }
   }
}
