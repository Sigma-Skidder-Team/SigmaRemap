package remapped;

public class class_2784 implements Runnable {
   private static String[] field_13588;

   public class_2784(class_8720 var1, long var2, long var4, class_8720 var6, class_8720 var7) {
      this.field_13590 = var1;
      this.field_13585 = var2;
      this.field_13586 = var4;
      this.field_13587 = var6;
      this.field_13589 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_13585; var3 < this.field_13586; var3++) {
         this.field_13587.method_36117(var3, (byte)(this.field_13590.method_36121(var3) ^ this.field_13589.method_36121(var3)));
      }
   }
}
