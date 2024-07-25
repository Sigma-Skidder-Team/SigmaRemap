package remapped;

public class class_6728 implements Runnable {
   private static String[] field_34750;

   public class_6728(class_6842 var1, int var2, int var3, int var4, double[][] var5, boolean var6) {
      this.field_34754 = var1;
      this.field_34751 = var2;
      this.field_34749 = var3;
      this.field_34753 = var4;
      this.field_34752 = var5;
      this.field_34755 = var6;
   }

   @Override
   public void run() {
      if (this.field_34751 != -1) {
         for (int var3 = this.field_34749; var3 < class_6842.method_31358(this.field_34754); var3 += this.field_34753) {
            class_6842.method_31356(this.field_34754).method_31289(this.field_34752[var3], this.field_34755);
         }
      } else {
         for (int var4 = this.field_34749; var4 < class_6842.method_31358(this.field_34754); var4 += this.field_34753) {
            class_6842.method_31356(this.field_34754).method_31295(this.field_34752[var4], this.field_34755);
         }
      }
   }
}
