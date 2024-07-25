package remapped;

public class class_748 implements Runnable {
   private static String[] field_4069;

   public class_748(class_6842 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_4066 = var1;
      this.field_4068 = var2;
      this.field_4064 = var3;
      this.field_4067 = var4;
      this.field_4065 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_4068; var3 < this.field_4064; var3++) {
         class_6842.method_31356(this.field_4066).method_31289(this.field_4067[var3], this.field_4065);
      }
   }
}
