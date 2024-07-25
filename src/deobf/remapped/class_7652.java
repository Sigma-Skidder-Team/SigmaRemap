package remapped;

public class class_7652 extends class_5548 {
   private static String[] field_38878;

   public class_7652(class_2695 var1, String var2, Object[] var3, int var4, class_1692 var5) {
      super(var2, var3);
      this.field_38879 = var1;
      this.field_38877 = var4;
      this.field_38880 = var5;
   }

   @Override
   public void method_25227() {
      this.field_38879.field_13195.method_27515(this.field_38877, this.field_38880);
      synchronized (this.field_38879) {
         this.field_38879.field_13194.remove(this.field_38877);
      }
   }
}
