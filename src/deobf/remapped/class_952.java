package remapped;

public class class_952 implements Runnable {
   private static String[] field_4905;

   public class_952(class_3803 var1, int var2, int var3, float[][][] var4) {
      this.field_4904 = var1;
      this.field_4907 = var2;
      this.field_4908 = var3;
      this.field_4906 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_4907; var3 < this.field_4908; var3++) {
         for (int var4 = 0; var4 < class_3803.method_17681(this.field_4904); var4++) {
            class_3803.method_17704(this.field_4904).method_17785(this.field_4906[var3][var4]);
         }
      }
   }
}
