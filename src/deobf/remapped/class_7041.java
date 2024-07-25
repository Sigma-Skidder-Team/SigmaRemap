package remapped;

public class class_7041 implements Runnable {
   private static String[] field_36376;

   public class_7041(class_4993 var1, long var2, long var4, class_4330 var6, long var7, boolean var9) {
      this.field_36372 = var1;
      this.field_36375 = var2;
      this.field_36374 = var4;
      this.field_36377 = var6;
      this.field_36373 = var7;
      this.field_36371 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_36375; var3 < this.field_36374; var3++) {
         class_4993.method_22998(this.field_36372).method_24213(this.field_36377, var3 * this.field_36373, this.field_36371);
      }
   }
}
