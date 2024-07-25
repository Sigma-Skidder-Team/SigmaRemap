package remapped;

public class class_4751 extends Thread {
   private static String[] field_23014;

   public class_4751(class_772 var1, String var2) {
      super(var2);
      this.field_23015 = var1;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();

      try {
         class_2529 var4 = var3.method_778();
         if (var4 != class_2529.field_12535) {
            return;
         }
      } catch (class_3900 var5) {
         if (var5.field_18958 != 401) {
            class_772.method_3466(false);
         }

         return;
      }

      class_772.method_3468(true);
   }
}
