package remapped;

public class class_6840 implements Runnable {
   private static String[] field_35264;

   public class_6840(class_3803 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_35266 = var1;
      this.field_35268 = var2;
      this.field_35267 = var3;
      this.field_35269 = var4;
      this.field_35265 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_35268; var3 < this.field_35267; var3++) {
         int var4 = var3 * class_3803.method_17689(this.field_35266);

         for (int var5 = 0; var5 < class_3803.method_17681(this.field_35266); var5++) {
            class_3803.method_17704(this.field_35266).method_17789(this.field_35269, var4 + var5 * class_3803.method_17685(this.field_35266), this.field_35265);
         }
      }
   }
}
