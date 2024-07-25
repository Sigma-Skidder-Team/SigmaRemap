package remapped;

public class class_5563 extends Thread {
   public class_5563(class_7409 var1, String var2) {
      super(var2);
      this.field_28283 = var1;
   }

   @Override
   public void run() {
      try {
         class_176 var3 = class_176.method_777();
         var3.method_804(class_7409.method_33763(this.field_28283).field_39016);
      } catch (class_3900 var4) {
         class_7409.method_33760().error("Couldn't delete world");
         class_7409.method_33760().error(var4);
      }

      class_7409.method_33764(this.field_28283).execute(() -> class_7409.method_33767(this.field_28283).method_8609(class_7409.method_33765(this.field_28283)));
   }
}
