package remapped;

public class class_8518 implements Runnable {
   private static String[] field_43604;

   public class_8518(class_7963 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_43601 = var1;
      this.field_43605 = var2;
      this.field_43606 = var3;
      this.field_43603 = var4;
      this.field_43602 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_43605; var3 < this.field_43606; var3++) {
         class_7963.method_36036(this.field_43601).method_44821(this.field_43603[var3], this.field_43602);
      }
   }
}
