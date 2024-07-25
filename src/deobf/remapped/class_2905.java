package remapped;

public class class_2905 implements Runnable {
   public class_2905(class_9351 var1, Object[] var2) {
      this.field_14178 = var1;
      this.field_14179 = var2;
   }

   @Override
   public void run() {
      Exception var3 = this.field_14179.length > 0 && this.field_14179[0] instanceof Exception ? (Exception)this.field_14179[0] : null;
      class_5831.method_26393(this.field_14178.field_47712, "xhr post error", var3);
   }
}
