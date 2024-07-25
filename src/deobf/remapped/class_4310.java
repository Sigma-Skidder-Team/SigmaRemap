package remapped;

public class class_4310 implements Runnable {
   public class_4310(class_8609 var1) {
      this.field_20905 = var1;
   }

   @Override
   public void run() {
      if (class_1144.method_5025(this.field_20905.field_44152) != class_5119.field_26410) {
         class_1144.method_5051(this.field_20905.field_44152, "ping timeout");
      }
   }
}
