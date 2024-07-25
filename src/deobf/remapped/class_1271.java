package remapped;

public class class_1271 extends Thread {
   public class_1271(class_7039 var1, String var2) {
      super(var2);
      this.field_7005 = var1;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();

      try {
         Boolean var4 = var3.method_780();
         if (var4) {
            class_7039.method_32312().info("Realms is available for this user");
            class_7039.method_32322(true);
         } else {
            class_7039.method_32312().info("Realms is not available for this user");
            class_7039.method_32322(false);
            class_7039.method_32284(this.field_7005)
               .execute(() -> class_7039.method_32282(this.field_7005).method_8609(new class_815(class_7039.method_32291(this.field_7005))));
         }

         class_7039.method_32289(true);
      } catch (class_3900 var5) {
         class_7039.method_32312().error("Couldn't connect to realms", var5);
         class_7039.method_32311(this.field_7005)
            .execute(() -> class_7039.method_32349(this.field_7005).method_8609(new class_9306(var5, class_7039.method_32291(this.field_7005))));
      }
   }
}
