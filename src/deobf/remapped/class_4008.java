package remapped;

public class class_4008 implements Runnable {
   private static String[] field_19466;

   public class_4008(class_8751 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_19467 = var1;
      this.field_19465 = var2;
      this.field_19464 = var3;
      this.field_19463 = var4;
      this.field_19462 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_19465; var3 < this.field_19464; var3++) {
         class_8751.method_40165(this.field_19467).method_21132(this.field_19463[var3], this.field_19462);
      }
   }
}
