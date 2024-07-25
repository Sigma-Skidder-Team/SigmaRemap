package remapped;

public class class_8007 implements Runnable {
   private static String[] field_41025;

   public class_8007(class_3101 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_41023 = var1;
      this.field_41022 = var2;
      this.field_41024 = var3;
      this.field_41026 = var4;
      this.field_41027 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_41022; var3 < this.field_41024; var3++) {
         for (int var4 = 0; var4 < class_3101.method_14204(this.field_41023); var4++) {
            class_3101.method_14195(this.field_41023).method_19204(this.field_41026[var3][var4], this.field_41027);
         }
      }
   }
}
