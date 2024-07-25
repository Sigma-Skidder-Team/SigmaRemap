package remapped;

public class class_7167 implements Runnable {
   private static String[] field_36882;

   public class_7167(class_8720 var1, long var2, long var4, class_8720 var6) {
      this.field_36880 = var1;
      this.field_36881 = var2;
      this.field_36879 = var4;
      this.field_36878 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_36881; var3 < this.field_36879; var3++) {
         this.field_36878.method_36117(var3, (byte)(1 - this.field_36880.method_36121(var3)));
      }
   }
}
