package remapped;

public class class_5852 implements Runnable {
   private static String[] field_29743;

   public class_5852(class_7380 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_29741 = var1;
      this.field_29745 = var2;
      this.field_29740 = var4;
      this.field_29742 = var6;
      this.field_29744 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_29745; var3 < this.field_29740; var3++) {
         class_7380.method_33625(this.field_29741).method_31280(this.field_29742, var3 * class_7380.method_33608(this.field_29741), this.field_29744);
      }
   }
}
