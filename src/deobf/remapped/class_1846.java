package remapped;

public class class_1846 extends Thread {
   public class_1846(class_4502 var1, String var2, int var3) {
      super(var2);
      this.field_9372 = var1;
      this.field_9373 = var3;
   }

   @Override
   public void run() {
      try {
         class_176 var3 = class_176.method_777();
         var3.method_776(class_131.method_403(class_4502.method_20917(this.field_9372).method_41183().get(this.field_9373)).field_14264);
         class_4502.method_20936(this.field_9372).execute(() -> class_4502.method_20919(this.field_9372, var1));
      } catch (class_3900 var4) {
         class_4502.method_20926().error("Couldn't accept invite");
      }
   }
}
