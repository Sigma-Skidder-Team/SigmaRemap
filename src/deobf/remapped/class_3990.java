package remapped;

public class class_3990 implements Runnable {
   private static String[] field_19390;

   public class_3990(class_3803 var1, int var2, int var3, float[] var4) {
      this.field_19389 = var1;
      this.field_19393 = var2;
      this.field_19392 = var3;
      this.field_19391 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_19393; var3 < this.field_19392; var3++) {
         int var4 = var3 * class_3803.method_17689(this.field_19389);

         for (int var5 = 0; var5 < class_3803.method_17681(this.field_19389); var5++) {
            class_3803.method_17704(this.field_19389).method_17786(this.field_19391, var4 + var5 * class_3803.method_17685(this.field_19389));
         }
      }
   }
}
