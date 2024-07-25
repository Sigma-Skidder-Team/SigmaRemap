package remapped;

public class class_7382 implements Runnable {
   public class_7382(class_5349 var1, Object[] var2) {
      this.field_37709 = var1;
      this.field_37711 = var2;
   }

   @Override
   public void run() {
      Exception var3 = this.field_37711.length > 0 && this.field_37711[0] instanceof Exception ? (Exception)this.field_37711[0] : null;
      class_5831.method_26391(this.field_37709.field_27328, "xhr poll error", var3);
   }
}
