package remapped;

public class class_6622 implements Runnable {
   private static String[] field_34193;

   public class_6622(class_9035 var1, int var2, int var3, double[][] var4) {
      this.field_34191 = var1;
      this.field_34195 = var2;
      this.field_34192 = var3;
      this.field_34194 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_34195; var3 < this.field_34192; var3++) {
         class_9035.method_41463(this.field_34191).method_15028(this.field_34194[var3]);
      }
   }
}
