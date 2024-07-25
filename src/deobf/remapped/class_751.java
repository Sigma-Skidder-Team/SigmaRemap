package remapped;

public class class_751 implements Runnable {
   private static String[] field_4074;

   public class_751(class_6842 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_4077 = var1;
      this.field_4076 = var2;
      this.field_4073 = var4;
      this.field_4072 = var6;
      this.field_4075 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_4076; var3 < this.field_4073; var3++) {
         class_6842.method_31356(this.field_4077).method_31286(this.field_4072, var3 * class_6842.method_31357(this.field_4077), this.field_4075);
      }
   }
}
